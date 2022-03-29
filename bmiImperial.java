import java.util.Scanner;

public class bmiImperial {
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }

    private static void calculateBMI() throws Exception {
        System.out.print("Enter weight in pounds: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = s.nextFloat();
        s.close();

        // main formula
        float bmi = (703*weight)/(height*height);

        // display
        System.out.println("Your BMI is: "+ bmi);
        printBMICategory(bmi);
    }

    // BMI category 
    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are average weight");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("Variable Debug 4");
        }
    }
}