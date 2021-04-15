/*
 * Example 6
 */
package team_13;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Exam6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfYears;
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double loanAmount;
        double totalPayment;
        Scanner input = new Scanner(System.in);
        
        //Stage 1: Obtaining required info
        System.out.print("Piease enter  your desire anuual rate (eg. 4.5): ");
        annualInterestRate = input.nextDouble();
        
        System.out.print("Please enter number of years as an integer: ");
        numberOfYears = input.nextInt();
        
        System.out.print("Please enter your desire loan amount: ");
        loanAmount = input.nextDouble();
        //Stage 2: Calculating monthly rate
        monthlyInterestRate = annualInterestRate / 1200;
        //Stage 3: Calculating monthly Payment according to the given formula
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1+ monthlyInterestRate, numberOfYears * 12));
        //Stage 4: Calculating total payment after given years
        totalPayment = monthlyPayment * numberOfYears * 12;
        //Stage 5: Dispaling resualts
        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int)(totalPayment * 100) / 100.0);
        
    }//end of main() method
    
}//end of class
