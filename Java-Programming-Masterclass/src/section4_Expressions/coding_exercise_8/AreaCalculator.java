package section4_Expressions.coding_exercise_8;

public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double width, double height){
        if (width < 0 || height < 0){
            return -1;
        }
        return width * height;
    }
}
