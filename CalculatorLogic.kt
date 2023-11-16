class CalculatorLogic {
    private var currentInput: StringBuilder = StringBuilder()
    fun appendToExpression(value: String) {
        currentInput.append(value)
    }
    fun clearExpressiom() {
        currentInput = StringBuilder()
    }
    fun evaluateExpression(): Double {

    }
}