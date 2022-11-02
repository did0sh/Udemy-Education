package section5_ControlFlow.coding_exercise_17;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            if (number % 2 == 0) {
                sum+=lastDigit;
            }
            number /= 10;
        }

        return sum;
    }
}
