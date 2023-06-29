public enum ExceptionsText {
    MAX("Вы ввели слишком большое выражение. Поробуйте ещё раз"),
    MIN("Вы не всё ввели. Попробуйте ещё раз"),
    FORMAT_ERROR("Введена невалидная строка."),
    NO_VALID("Введите числа"),
    RANGE_ERROR("Можно вводить числа от 0 до 10"),
    OPERATOR("Нужно ввести один оператор (+, -, /, *).");

    private String russianText;

    ExceptionsText(String russianText) {
        this.russianText = russianText;
    }

    public String getText() {
        return russianText;
    }
}
