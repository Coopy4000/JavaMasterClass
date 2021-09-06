public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindromeExpanded(202));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int stored = number;
        while (stored != 0) {
            int digit = stored % 10; // extract the lest-significant digit
            reverse = (reverse * 10) + digit; // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }
        return number == reverse;
    }

    public static boolean isPalindromeExpanded(int number){
        int isNegative = number < 0 ? -1 : 1;
        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(Math.abs(number)));
        return Integer.parseInt(str.reverse().toString()) * (isNegative) == number;
    }

}