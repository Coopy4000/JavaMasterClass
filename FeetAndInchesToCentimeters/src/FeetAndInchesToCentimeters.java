public class FeetAndInchesToCentimeters {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,6);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double centimeters = ((feet * 12) + inches)*2.54;
        System.out.println(feet + " Feet," + inches + " Inches equals " + centimeters + " Centimeters");
        return centimeters;
    }
    
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches equals " + feet + " Feet, " + remainingInches + " Inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
