package section6_OOP1.coding_exercise_34;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double realVal, double imagVal){
        real += realVal;
        imaginary += imagVal;
    }

    public void add(ComplexNumber complexNumber){
        real += complexNumber.getReal();
        imaginary += complexNumber.getImaginary();
    }

    public void subtract(double realVal, double imagVal){
        real -= realVal;
        imaginary -= imagVal;
    }

    public void subtract(ComplexNumber complexNumber){
        real -= complexNumber.getReal();
        imaginary -= complexNumber.getImaginary();
    }
}
