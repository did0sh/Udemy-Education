package section4_Expressions.coding_exercise_9;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
          long days = (minutes / (24 * 60));
          long year = days / 365;
          long remainingDays = days % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
