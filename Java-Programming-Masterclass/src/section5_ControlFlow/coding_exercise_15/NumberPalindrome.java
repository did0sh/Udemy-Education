package section5_ControlFlow.coding_exercise_15;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }
}
