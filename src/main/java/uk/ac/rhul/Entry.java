package uk.ac.rhul;

import uk.ac.rhul.exceptions.BadType;

public class Entry {

    // Attributes (all are private to help ensure that the class is immutable)

    private float number;
    private Symbol other;
    private String str;
    private Type type;


    // Constructors

    public Entry(float value) {
        this.type = Type.NUMBER;
    }

    public Entry(String which) {
        this.type = Type.STRING;
        this.str = which;
    }

    public Entry(Symbol op) {
        this.type = Type.SYMBOL;
    }


    // Getter methods

    public Type getType() {
        return type;
    }

    public String getString() throws BadType {
        if (type != Type.STRING) {
            throw new BadType("getString() called on wrong type. This Entry object is of type: " + type);
        } else {
            return str;
        }
    }

    // No setter methods as Entry should be immutable once instantiated
}
