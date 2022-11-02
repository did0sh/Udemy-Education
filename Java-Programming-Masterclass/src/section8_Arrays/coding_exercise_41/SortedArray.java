package section8_Arrays.coding_exercise_41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        printArray(numbers);
        int[] sorted = sortArray(numbers);
        printArray(sorted);

    }

    private static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers:");
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static void printArray(int[] array){
        System.out.println("Printed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + ", value: " + array[i]);
        }
    }

    private static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);
        int index = -1;
        for (int i = array.length - 1; i >= 0 ; i--) {
            index++;
            sortedArray[index] = array[i];
        }
        return sortedArray;
    }
}
