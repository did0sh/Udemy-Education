package section5_ControlFlow.coding_exercise_26;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int x = 1; x <= number; x++) {
                if ((x == 1) || (x == number) || (x == i) || (i == 1) || (i == number) || (i == (number - (x - 1)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
