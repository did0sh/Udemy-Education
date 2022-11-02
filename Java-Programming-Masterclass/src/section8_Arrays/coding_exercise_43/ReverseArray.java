package section8_Arrays.coding_exercise_43;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count of numbers: ");
        int count = scanner.nextInt();
        int[] numbers = readIntegers(count);
        reverse(numbers);
    }

    private static int[] readIntegers(int count){
        System.out.println("Enter " + count + " numbers:");
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    
    private static void reverse(int[] array){
        System.out.println("Array: " + Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
