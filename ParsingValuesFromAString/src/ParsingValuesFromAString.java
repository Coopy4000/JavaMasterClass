public class ParsingValuesFromAString {

    public static void main(String [] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String decimalAsString = "2018.123456789";
        System.out.println("decimalAsString = " + decimalAsString);

        double decimal = Double.parseDouble(decimalAsString);
        System.out.println("decimal = " + decimal);

        decimalAsString += 1;
        decimal += 1;

        System.out.println("decimalAsString = " + decimalAsString);
        System.out.println("decimal = " + decimal);
    }
}
