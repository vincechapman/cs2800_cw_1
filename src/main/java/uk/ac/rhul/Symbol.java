package uk.ac.rhul;

public enum Symbol {
    LEFT_BRACKET,
    RIGHT_BRACKET,
    TIMES,
    DIVIDE,
    PLUS,
    MINUS,
    INVALID;

    public String toString() {
        return switch (this.name()) {
            case "LEFT_BRACKET" -> "(";
            case "RIGHT_BRACKET" -> ")";
            case "TIMES" -> "*";
            case "DIVIDE" -> "/";
            case "PLUS" -> "+";
            case "MINUS" -> "-";
            case "INVALID" -> "invalid";
            default -> this.name();
        };
    }

}
