package section6_OOP1.coding_exercise_35;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
