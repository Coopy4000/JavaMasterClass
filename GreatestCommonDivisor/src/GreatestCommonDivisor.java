public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(100, 105));
        System.out.println(getGreatestCommonDivisorExpanded(100, 105));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }

    public static int getGreatestCommonDivisorExpanded(int num1, int num2){

        if(num1 < 10 || num2 < 10){
            return -1;
        }

        int biggestNumber = Math.max(num1, num2); //same as num1 > num2 ? num1 : num2
        int smallestNumber = Math.min(num1, num2); // same as num1 > num2 ? num2 : num1
        int divisor = smallestNumber;

        while(divisor > 0){
            if(biggestNumber % divisor == 0 && smallestNumber % divisor == 0){
                return divisor;
            }
            divisor--;

        }
        return 0;
    }
}