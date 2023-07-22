package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * a symbol table data structure for managing scopes and variable declarations.
 * supports adding and retrieving variables, and adding new scopes and exiting scopes.
 */
public class SymbolTable {
    private Stack<Map<String, Object>> MapStack;
    private Stack<Map<String, Object>> SaveStack;


    public SymbolTable() {
        MapStack = new Stack<>();
        SaveStack = new Stack<>();
    }


    /**
     * adds new Scope to Symbol table
     */
    public void newScope() {
        HashMap<String, Object> scope = new HashMap<>();
        MapStack.push(scope);
    }

    /**
     * deletes top Scope from Symbol table
     */
    public void exitScope() {
        if (!MapStack.isEmpty()) {
            MapStack.pop();
        } else System.out.println("Symbol table is empty");
    }

    /**
     *  stores new variable inside current Scope
     * @param identifier
     * @param value
     */
    public void addDeclaration(String identifier, Object value) {
        MapStack.peek().put(identifier, value);
    }

    /**
     * returns whether the given variable is already declared in current Scope
     * @param identifier
     * @return
     */
    public boolean existKey(String identifier) {
       return MapStack.peek().containsKey(identifier) ;
    }

    /**
     * returns value of given variable if it is initialized
     * throws NoSuchElementException if it doesn't exist in any scope
     * throws NullPointerException if uninitialized
     * @param identifier
     * @return
     */
    public Object getValue(String identifier) {
        if (MapStack.isEmpty()) {
            throw new NoSuchElementException("the variable " + identifier + " does not exist!");
        }
        Object value = this.MapStack.peek().get(identifier);
        if (value != null) {
            return value;
        } else if (MapStack.peek().containsKey(identifier)) {
                throw new NullPointerException("Variable is uninitialised");
        } else {
            if (!MapStack.isEmpty()) {
                moveToLastScope();
                value = getValue(identifier);
            }
            if (value == null) {
                throw new NoSuchElementException("the variable " + identifier + " does not exist!");
            }
            moveToCurrentScope();
            return value;
        }
    }

    /**
     * changes current scope to outer scope
     */
    private void moveToLastScope() {
        SaveStack.push(MapStack.pop());
    }

    /**
     * moves back to most inner scope
     */
    private void moveToCurrentScope() {
        while (!SaveStack.isEmpty()) {
            MapStack.push(SaveStack.pop());
        }
    }
}
