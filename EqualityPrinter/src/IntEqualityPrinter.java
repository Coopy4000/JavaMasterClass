public class IntEqualityPrinter {
    public static void printEqual (int myFirst, int mySecond, int myThird) {
        if(myFirst < 0 || mySecond < 0 || myThird < 0) {
            System.out.println("Invalid Value");
        } else if(myFirst == mySecond && mySecond == myThird) {
            System.out.println("All numbers are equal");
        } else if(myFirst != mySecond && myFirst != myThird && mySecond != myThird) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
