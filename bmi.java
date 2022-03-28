// I was asked to make a bmi calculator
// 3/28/21
// I'm going to be completely transparent when I say I stole a lot of this code from a tutorial
// NOTE: this uses metric units only

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }

    private static void calculateBMI() throws Exception {
        System.out.print("Enter weight in kilograms: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Enter Height in cm: ");
        float height = s.nextFloat();
        s.close();

        // cm to m convert
        float bmi = (100*100*weight)/(height*height);

        System.out.println("BMI: "+bmi);
        printBMICategory(bmi);
    }

    // BMI category
    private static void printBMICategory(float bmi){
        if(bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal Pills");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Holy shit I didn't know that you were Fat Albert from Bill Cosby");
        }
    }
}