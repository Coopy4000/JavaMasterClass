package com.company;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(" Float Minimum Value = " + myMinFloatValue);
        System.out.println(" Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(" Double Minimum Value = " + myMinDoubleValue);
        System.out.println(" Double Maximum Value = " + myMaxDoubleValue);
        
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        
        double myPoundValue = 200;
        double PoundToKilogramConversion = 0.45359237;
        double myKilogramValue = (myPoundValue * PoundToKilogramConversion);
        System.out.println("Coverted Kilograms = " + myKilogramValue + " Kilograms");

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println("pi = " + pi);
        System.out.println(anotherNumber);
        
    }
}
