public class CharSwitch {
    public static void main(String[] args) {
        char switchValue = 'E';

        switch(switchValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Value was not A, B, C, D, or E");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
