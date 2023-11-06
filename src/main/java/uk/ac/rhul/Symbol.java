package uk.ac.rhul;

public enum Symbol {

    LEFT_BRACKET("("),
    RIGHT_BRACKET(")"),
    TIMES("*"),
    DIVIDE("/"),
    PLUS("+"),
    MINUS("-"),
    INVALID("invalid");

    private final String string;

    private Symbol(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

}
