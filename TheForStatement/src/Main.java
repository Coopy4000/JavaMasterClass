public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(double i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000,i)));
        }

        for(double i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000,i)));
        }

        int count = 0;
        for(int i=0; i<10000; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                System.out.println("There are 3 prime numbers");
                break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }
        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
