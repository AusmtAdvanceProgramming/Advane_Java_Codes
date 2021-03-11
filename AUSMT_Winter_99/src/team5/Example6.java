/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;
import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numberOfYear;
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double loanAmount;
        double totalPayment;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Please enter number of years desire anuual rate (eg. 4.5:)");
        annualInterestRate= input.nextDouble();
        
        System.out.print("Please enter number of years as an integer:");
        numberOfYear=input.nextInt();
        
        System.out.print("Please enter your desire loan amount:");
        loanAmount=input.nextDouble();
        
        monthlyInterestRate=annualInterestRate/1200;
        
        monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYear*12));
        
        totalPayment=monthlyPayment*numberOfYear*12;
        
        System.out.println("The monthly payment is"+(int)(monthlyPayment*100)/100.0);
        System.out.println("The total payment is"+(int)(totalPayment*100)/100.0);
        
        
    }
    
}
