/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11;

import java.util.Scanner;

/**
 *
 * @author Parsley
 */
public class Jalase_3vom {
    
    public static void main(String[] args) {
        //Exampel 1
        /*
        double number1, number2, number3, average;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        number1 = input.nextDouble();
        
        System.out.println("Enter the second number : ");
        number2 = input.nextDouble();
            
        System.out.println("Enter the third number : ");
        number3 = input.nextDouble();
        
        
        average = ( number1 + number2 + number3 ) / 3 ;
        
        System.out.println("The average of these three numbers [" + number1 + " , " + number2 + " , " + number3 + "] is : " + average );
        
        //End of Example 1
        */
        //Example 2
        /*
        Scanner input = new Scanner(System.in);
        int totalMiliseconds;
        int hours, minutes, seconds, miliseconds;
    
        System.out.println("Enter the total miliseconds passed: ");
        totalMiliseconds = input.nextInt();
        
        miliseconds = totalMiliseconds % 1000;
        seconds = totalMiliseconds /1000;
        minutes = seconds / 60;
        seconds = seconds % 60;
        hours = minutes / 60;
        minutes = minutes % 60;
        
        System.out.print("Total " + totalMiliseconds + " ms means that ");
        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.print(seconds + ":");
        System.out.println(miliseconds + "ms (h:m:s ms) has passed.");
        
        //End of Example 2
        */
        //Example 3
        /*
        double farenheit, celsius;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the tempreture in farenheit : ");
        farenheit = input.nextDouble();
        
        celsius = ( 5.0 /9 ) * ( farenheit - 32 );
        
        System.out.println("Tempreture in " + farenheit + " farenheit is equal to " 
                + celsius + " celsius");
        //End of Example 3
        */
        //Example 6
        /*
        int numberOfYears;
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double loanAmount;
        double totalPayment;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your desired annual ratio (eg. 4.5): ");
        annualInterestRate = input.nextDouble();
        
        System.out.print("Enter the loan time in years as an integer: ");
        numberOfYears = input.nextInt();
        
        System.out.print("Enter your desired loan amount: ");
        loanAmount = input.nextDouble();
        
        monthlyInterestRate = annualInterestRate /1200 ;
        monthlyPayment = loanAmount * monthlyInterestRate / 
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        
        totalPayment = monthlyPayment * numberOfYears * 12;
        
        System.out.println("The monthly payment is " + 
                (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + 
                (int) (totalPayment * 100) / 100.0);
        */
        
}//end of main() method
    
}//end of class
