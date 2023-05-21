public enum ExceptionsText {
    MAX("Вы ввели слишком большое выражение. Поробуйте ещё раз"),
    MIN("Вы не всё ввели. Попробуйте ещё раз"),
    OPERATOR("Нужно ввести один оператор (+, -, /, *). Попробуй ещё раз.");

    private String russianText;

    ExceptionsText(String russianText) {
        this.russianText = russianText;
    }
    public  String getText() {
        return russianText;
    }
}
