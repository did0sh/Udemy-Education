package section5_ControlFlow.coding_exercise_18;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99){
            return false;
        }

        String secondNumString = String.valueOf(secondNum);
        while (firstNum > 0){
            int digit = firstNum % 10;
            firstNum /= 10;
            if (secondNumString.contains(String.valueOf(digit))){
                return true;
            }
        }
        return false;
    }
}
