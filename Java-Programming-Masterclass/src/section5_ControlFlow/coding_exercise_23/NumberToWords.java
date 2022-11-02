package section5_ControlFlow.coding_exercise_23;

public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNum = reverse(number);
        String word = "";
        while (reverseNum > 0){
            switch (reverseNum%10){
                case 0:
                    word += "ZERO ";
                    break;
                case 1:
                    word += "ONE ";
                    break;
                case 2:
                    word += "TWO ";
                    break;
                case 3:
                    word += "THREE ";
                    break;
                case 4:
                    word += "FOUR ";
                    break;
                case 5:
                    word += "FIVE ";
                    break;
                case 6:
                    word += "SIX ";
                    break;
                case 7:
                    word += "SEVEN ";
                    break;
                case 8:
                    word += "EIGHT ";
                    break;
                case 9:
                    word += "NINE ";
                    break;
            }
            reverseNum /= 10;
        }

        System.out.println(word);
    }

    public static int reverse(int number){
        int reverseNum = 0;
        while(number > 0)
        {
            reverseNum = reverseNum * 10 + number % 10;
            number = number / 10;
        }
        return reverseNum;
    }
}
