package section6_OOP1.coding_exercise_29;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    /**
     * Sets new secondNumber.
     *
     * @param secondNumber New value of secondNumber.
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Gets firstNumber.
     *
     * @return Value of firstNumber.
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Gets secondNumber.
     *
     * @return Value of secondNumber.
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Sets new firstNumber.
     *
     * @param firstNumber New value of firstNumber.
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        return secondNumber == 0 ? 0 : this.firstNumber / this.secondNumber;
    }
}
