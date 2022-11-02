package section5_ControlFlow.coding_exercise_27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while(scan.hasNextLine()){
            try{
                int number = Integer.parseInt(scan.nextLine());
                sum+=number;
                counter++;
            }catch(Exception e){
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/counter));
                return;
            }
        }
    }
}
