package section4_Expressions.coding_exercise_7;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return isTeen(firstAge) ||
                isTeen(secondAge) ||
                isTeen(thirdAge);
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
