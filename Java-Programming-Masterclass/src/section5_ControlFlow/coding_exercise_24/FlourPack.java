package section5_ControlFlow.coding_exercise_24;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigBagsNeeded = goal / 5;
        goal -= (bigBagsNeeded <= bigCount) ? (bigBagsNeeded * 5) : (bigCount * 5);
        return goal <= smallCount ? true : false;
    }
}
