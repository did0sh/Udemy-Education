package section4_Expressions.coding_exercise_5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return ((int) (firstNumber*1000) == (int) (secondNumber*1000));
    }
}
