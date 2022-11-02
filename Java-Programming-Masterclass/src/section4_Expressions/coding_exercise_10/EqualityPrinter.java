package section4_Expressions.coding_exercise_10;

public class EqualityPrinter {
    public static void printEqual(int firstNum, int secondNum, int thirdNum){
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0){
            System.out.println("Invalid Value");
        } else if (firstNum == secondNum && secondNum == thirdNum){
            System.out.println("All numbers are equal");
        } else if (firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum){
            System.out.println("All numbers are different");
        } else if ((firstNum == secondNum && secondNum != thirdNum) || (firstNum != secondNum && secondNum == thirdNum)
        || (firstNum == thirdNum && secondNum != firstNum)){
            System.out.println("Neither all are equal or different");
        }
    }
}
