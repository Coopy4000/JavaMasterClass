public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int total = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
                }
            System.out.println("Even number " + number);
            
            total++;
            if(total == 5) {
                break;
            }

            System.out.println("Total even numbers " + total);
        }
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
