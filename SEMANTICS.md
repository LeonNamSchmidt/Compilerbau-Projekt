# Definition der Semantik
## Implizite BOOLEAN-Konvertierung:
Fehler: Implizite Konvertierung ist nicht erlaubt.
Begründung: Implizite Konvertierung sorgt für unsauberen code.
Regeleinhaltung: falls die ausgewertete Expression einen nicht-boolean Wert enthält,
entsteht in exitExpression() eine IllegalArgumentException.
## Operator-Überladen:
Der '+' Operator kann für String Konkatenation in der Form 'String + String' benutzt werden 
oder mit Zahlen als 'String + Zahl' um diese als Strings zu konkatenieren.
Begründung: die Konkatenation soll ähnlich wie in Java funktionieren. 
Regeleinhaltung: falls in
## Neudefinition von Variablen:
Neudefinitionen sind nicht möglich.
Begründung: Neudefinition sorgen für unsauberen Code und Unberechenbarkeit,
da die gleiche Variable an verschiedene Bedeutungen besitzen kann 
Regeleinhaltung: Throw RuntTimeException falls in enterVarDecl die Variable bereits im current Scope existiert
## Shadowing und Scoping:
in inneren Blöcken neudefiniert -> ja
führt zu Shadowing -> ja
Gültigkeitsbereich endet am ende des Blockes
Begründung: einfachere Implementierung
Regeleinhaltung: Falls eine Variable in einem Scope deklariert wird,
wird nicht geprüft ob diese in einem äußeren Scope bereits existiert. (->Neudefinierung)
Variablen werden zuerst im current Scope gesucht (->Shadowing)
Scope wird am Ende des Blockes verworfen (->Gültigkeitsbereich)
## Uninitialisierte Werte:
Werdern als null initialisert -> Error bei Zugriff
Begründung: Falls Werte uninitialisiert sind können sie einfach auf ein null value gemapped werden.
Regeleinhaltung: throw NullpointerException, wenn auf Variablen mit null Wert zugegriffen wird.