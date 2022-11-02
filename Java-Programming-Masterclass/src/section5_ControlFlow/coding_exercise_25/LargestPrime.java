package section5_ControlFlow.coding_exercise_25;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number > 1) {
            for(int i =2; i < number; i++) {
                while(number % i == 0 && number/i != 1) {
                    number /= i;
                }
            }
            return number;
        }
        return -1;
    }
}
