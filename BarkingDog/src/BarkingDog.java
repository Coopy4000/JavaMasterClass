public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23)return false; //invalid time per army standard

        return(barking && (hourOfDay > 22 || hourOfDay < 8)); //shouldWakeUp when barking after 2200 and before 0800
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,4));
    }
}
