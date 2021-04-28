/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz2;

import java.util.Scanner;

public class Tamrin2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int firstNumber = 0, secondNumber = 0, divider = 0;
        
        System.out.println("Enter the first number: ");
        firstNumber = input.nextInt();
    
        System.out.println("Enter the second number: ");
        secondNumber = input.nextInt();
    
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                divider = i;
            }
        }
    System.out.println("The greatest divisor of " + firstNumber + " and " + secondNumber + " is " + divider + " .");
    }
    
}
