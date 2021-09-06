public class TeenNumberChecker {
    public static boolean hasTeen(int AgeOne, int AgeTwo, int AgeThree) {
        if(AgeOne >= 13 && AgeOne <= 19) {
            return true;
        } else if(AgeTwo >= 13 && AgeTwo <= 19) {
            return true;
        } else return AgeThree >= 13 && AgeThree <= 19;
    }

    public static boolean isTeen(int myAge) {
        return myAge >= 13 && myAge <= 19;
    }
}
