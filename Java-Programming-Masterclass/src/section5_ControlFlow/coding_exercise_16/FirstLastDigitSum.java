package section5_ControlFlow.coding_exercise_16;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int lastdigit = number % 10;

        int firstdigit = number;
        while (firstdigit >= 10) {
            firstdigit /= 10;
        }

        return firstdigit + lastdigit;
    }
}
