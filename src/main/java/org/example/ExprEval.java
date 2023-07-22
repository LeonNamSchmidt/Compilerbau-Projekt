package org.example;


import java.util.*;

/**
 *  expression evaluator that can solve mathematical, logical and concatenation operations
 */
public class ExprEval {

    private Queue<Object> Input = new ArrayDeque<>();

    private Stack<String> OperatorStack = new Stack<>();

    private Stack<Object> Output = new Stack<>();

    private String type="";

    /**
     * updates state depending on input.
     * determines whether a mathematical, logical, or concatenation expression is being processed
     * @param a
     */
    private void updateState(Object a) {
        //no needed for +,-,*,/
        if (a instanceof Float && !type.equals("Boolean") && !type.equals("String")) {
            this.type = "Float";
        } else if (a instanceof String) {
            if (a.equals("!")  ||
                    a.equals(">")  ||
                    a.equals("<")  ||
                    a.equals("==") ||
                    a.equals("!=") ||
                    a.equals(">=") ||
                    a.equals("<=") ||
                    a.equals("and")||
                    a.equals("or")) {
                this.type = "Boolean";
            } else this.type = "String";
        } else if (a instanceof Boolean) {
            this.type = "Boolean";
        }
    }

    /**
     * returns the priority of mathematical operators
     * @param c
     * @return
     */
    private int getPrecedence(String c) {
        switch (c) {
            case "+", "-" -> {
                return 1;
            }
            case "*", "/" -> {
                return 2;
            }
            default -> {
                System.out.println("wrong String: " + c + "\n +,-,* or / expected");
                return 0;
            }
        }
    }

    /**
     * perform mathematical operations on 2 float numbers
     * @param x
     * @param y
     * @param c
     * @return
     */
    private float calc(float x, float y, String c) {
        switch (c) {
            case "+" -> {
                return x + y;
            }
            case "-" -> {
                return x - y;
            }
            case "*" -> {
                return x * y;
            }
            case "/" -> {
                return x / y;
            }
            default -> {
                System.out.println("wrong String: " + c + "\n +,-,* or / expected");
                return 0;
            }
        }

    }

    /**
     * returns if the given String is a mathematical operator
     * @param c
     * @return
     */
    private boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    /**
     *  solves math expressions given in the Input Queue and returns the solution
     *  (uses shunting yard algorithm + solves them in Output stack)
     * @return
     */
    private float solveMathExpr() {
        assert (!Input.isEmpty());
        float op1;
        float op2;
        while (!Input.isEmpty()) {
            if (Input.element() instanceof Float) {
                Output.push(Input.remove());
            } else if (Input.element() instanceof String || Input.element() instanceof Character) {
                if (isOperator(Input.element().toString())) {
                    if (OperatorStack.isEmpty()) {
                        OperatorStack.push(Input.remove().toString());
                    } else {
                        while ((OperatorStack.peek().equals("(")) &&
                                (getPrecedence(OperatorStack.peek()) >= getPrecedence(Input.element().toString()))) { //while the operator on Stack is not '(' and priority of operator on stack is higher than in input
                            op2 = (float) Output.pop();
                            op1 = (float) Output.pop();
                            Output.push(calc(op1, op2,OperatorStack.pop()));
                        }
                        OperatorStack.push(Input.remove().toString());
                    }
                } else if (Input.element().toString().equals("(")) {
                    OperatorStack.push(Input.remove().toString());
                } else if ( Input.element().toString().equals(")")) {
                    while (!OperatorStack.isEmpty() && OperatorStack.peek().equals("(")) {
                        op2 = (float) Output.pop();
                        op1 = (float) Output.pop();
                        Output.push(calc(op1, op2, OperatorStack.pop()));
                    }
                    OperatorStack.pop();
                    Input.remove();
                }
            }
        }
        while (!OperatorStack.isEmpty()) {
            op2 = (float) Output.pop();
            op1 = (float) Output.pop();
            Output.push(calc(op1, op2, OperatorStack.pop()));
        }
        return (float) Output.pop();
    }

    /**
     * performs logical operations on two operands
     * @param x
     * @param y
     * @param op
     * @return
     */
    private boolean calcBool(Object x, Object y, String op) {
        assert (x.getClass() == y.getClass());
        switch (op) {
            case ">" -> {
                return (float) x > (float) y;
            }
            case "<" -> {
                return (float) x < (float) y;
            }
            case ">=" -> {
                return (float) x >= (float) y;
            }
            case "<=" -> {
                return (float) x <= (float) y;
            }
            case "==" -> {
                return (float) x == (float) y;
            }
            case "!=" -> {
                return (float) x != (float) y;
            }
            case "and" -> {
                return (boolean) x && (boolean) y;
            }
            case "or" -> {
                return (boolean) x || (boolean) y;
            }
            default -> {
                throw new RuntimeException("expected boolean: " + op);
            }
        }
    }

    /**
     * returns if the given String is a logical operator
     * @param a
     * @return
     */
    private boolean isBoolOperator(String a) {
        return a.equals("!") || a.equals(">") || a.equals("<") || a.equals("==") || a.equals("!=") || a.equals(">=") || a.equals("<=") || a.equals("and") || a.equals("or");
    }

    /**
     *  solves boolean expressions given in the Input Queue and returns the solution
     *  (uses shunting yard algorithm + solves them in Output stack)
     * @return
     */
    private boolean solveBoolExpr() {
        assert (!Input.isEmpty());
        boolean out;
        Object op1;
        Object op2;
        while (!Input.isEmpty()) {
            if (Input.element() instanceof Float) {
                Output.push(Input.remove());
            } else if (Input.element() instanceof Boolean) { //case of boolean
                if (!OperatorStack.isEmpty() && OperatorStack.peek().equals("!")) {
                    out = !((boolean)  Input.remove());
                    Output.push(out);
                    OperatorStack.pop();
                } else {
                    Output.push(Input.remove());
                }
            } else if (Input.element() instanceof String) { //case of operator
                if (isBoolOperator((String) Input.element())) {
                    if (OperatorStack.isEmpty()) {
                        OperatorStack.push((String) Input.remove());
                    } else {
                        while (!OperatorStack.isEmpty() && !OperatorStack.peek().equals("(")) {
                            if (OperatorStack.peek().equals("!")) {
                                assert (Output.peek() instanceof Boolean);
                                out = !((boolean) Output.pop());
                                Output.push(out);
                                OperatorStack.pop();
                            } else {
                                op2 = Output.pop();
                                op1 = Output.pop();
                                Output.push(calcBool(op1, op2, OperatorStack.pop()));
                            }
                        }
                        OperatorStack.push(Input.remove().toString());
                    }
                } else if (Input.element().equals("(")) {
                    OperatorStack.push((String) Input.remove());
                } else if (Input.element().equals(")")) {
                    while (!OperatorStack.peek().equals("(")) {
                        op2 = Output.pop();
                        op1 = Output.pop();
                        Output.push(calcBool(op1, op2,(String) OperatorStack.pop()));
                    }
                    OperatorStack.pop();
                    Input.remove();
                } else {
                    throw new IllegalArgumentException("illegal operator");
                }

            }
        }
        while (OperatorStack.size() > 0) {
            op2 = Output.pop();
            op1 = Output.pop();
            Output.push(calcBool(op1, op2, OperatorStack.pop()));
        }
        return (boolean) Output.pop();
    }

    /**
     *  solves String concat operations given in the Input Queue and returns the solution
     *  (uses shunting yard algorithm + solves them in Output stack)
     * @return
     */
    private String solveStringExpr() {
        assert (!Input.isEmpty());
        String op1;
        String op2;
        if (!OperatorStack.isEmpty()) System.out.println(OperatorStack.peek() + "error123");
        if (!Output.isEmpty()) System.out.println(Output.peek() + "error132");
        while (!Input.isEmpty()) {
            if (Input.element() instanceof String || Input.element() instanceof Float) {
                Output.push(Input.remove());
                if (!OperatorStack.isEmpty()) {
                    op2 = (String) Output.pop();
                    op1 = (String) Output.pop();
                    op1 = op1 + op2;
                    Output.push(op1);
                }
            } else if (Input.element() instanceof String) {
                if (Input.element().equals("+")) {
                    OperatorStack.push((String) Input.remove());
                } else {
                    throw new InputMismatchException("unexpected String: " + Input.element() + "\nexpected: +" ); //maybe change
                }
            } else {
                throw new IllegalArgumentException("illegal operator"); //falls illegale operator benutzt werden
            }
        }
        System.out.println(Output.size());
        if (Output.size() == 1) { //change maybe
            op1 = (String) Output.pop();
        } else {
            // Handle other cases, e.g., invalid input
            throw new IllegalArgumentException("Invalid input detected.");
        }
        return op1;
    }

    /**
     * solves expressions by first deciding which kind of operations are possible with the given state.
     * @return
     */
    public Object solveExpr() {
        Object output = switch (type) {
            case "Float" -> solveMathExpr();
            case "Boolean" -> solveBoolExpr();
            case "String" -> solveStringExpr();
            default -> null;
        };
        type = "";
        return output;
    }

    /**
     *  Receives either a float, String(/Char) or boolean Value and adds that Value to the Input Queue.
     *  Updates the state in order to switch between the mathematical, logical and concat operations.
     * @param a
     */
    public void add(Object a) {
        updateState(a);
        Input.add(a);
    }

}
