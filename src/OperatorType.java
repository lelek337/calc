public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    DIVIDE("/"),
    MULTIPLY("*");

    private String sign;

    public String getSign() {
        return sign;
    }

    OperatorType(String sign) {
        this.sign = sign;
    }

    public static OperatorType findOperationType(String value) throws Exception {
        for (OperatorType type: OperatorType.values()) {
            if (type.getSign().equals(value)) {
                return type;
            }
        }
        Main.exit = false;
        throw new Exception(ExceptionsText.OPERATOR.getText());
    }

    public int calculate(int num1, int num2) {
        return switch (this) {
            case PLUS -> num1 + num2;
            case MINUS -> num1 - num2;
            case DIVIDE -> num1 / num2;
            case MULTIPLY -> num1 * num2;
        };
    }
}
