package uk.ac.rhul;

public enum Type {

    STRING("STRING"),
    NUMBER("NUMBER"),
    SYMBOL("SYMBOL"),
    INVALID("INVALID");

    private final String type;

    private Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
