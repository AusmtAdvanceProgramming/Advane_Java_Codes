/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team7;

import java.util.Scanner;
/**
 *
 * @author Team 7
 */
public class Lecture3_Example6 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){ 
        
        int guess;
        int lottoryDigit1, lottoryDigit2, lottoryDigit3;
        int guessDigit1, guessDigit2, guessDigit3;
        
        Scanner input = new Scanner(System.in);
        
        int lottory = (int)(Math.random() * 1000);
        
        System.out.print("Enter your lottory pick (three digits): ");
        guess = input.nextInt();
        
        lottoryDigit1 =  lottory / 100;
        lottoryDigit2 = (lottory / 10) % 10;
        lottoryDigit3 =  lottory % 10;
        
        guessDigit1 =  guess / 100;
        guessDigit2 = (guess / 10) % 10;
        guessDigit3 =  guess % 10;
        
        System.out.print("\nThe lottory number is " + lottory);
        
        if (guess == lottory)
            System.out.print("\nExact match: You win 100,000");
        
        else if (guessDigit1 == lottoryDigit1 && guessDigit2 == lottoryDigit3 &&
                 guessDigit3 == lottoryDigit2 || guessDigit2 == lottoryDigit2 &&
                 guessDigit3 == lottoryDigit1 && guessDigit1 == lottoryDigit3 || 
                 guessDigit3 == lottoryDigit3 && guessDigit2 == lottoryDigit1 && 
                 guessDigit1 == lottoryDigit2)
            System.out.print("\nMatch all digits without order: You win 80,000");
        
        else if (guessDigit1 == lottoryDigit1 && guessDigit2 == lottoryDigit2 ||
                 guessDigit2 == lottoryDigit2 && guessDigit3 == lottoryDigit3)
            System.out.print("\nMatch two digits with order: You win 50,000");

        else if (guessDigit1 == lottoryDigit2 && guessDigit2 == lottoryDigit1 ||
                 guessDigit1 == lottoryDigit2 && guessDigit2 == lottoryDigit3 ||
                 guessDigit1 == lottoryDigit2 && guessDigit3 == lottoryDigit1 ||
                 guessDigit1 == lottoryDigit3 && guessDigit3 == lottoryDigit1 ||
                 guessDigit1 == lottoryDigit3 && guessDigit2 == lottoryDigit1 ||
                 guessDigit1 == lottoryDigit3 && guessDigit3 == lottoryDigit2 ||
                 guessDigit2 == lottoryDigit1 && guessDigit3 == lottoryDigit2 ||
                 guessDigit2 == lottoryDigit3 && guessDigit3 == lottoryDigit2 ||
                 guessDigit2 == lottoryDigit3 && guessDigit3 == lottoryDigit1 )
            System.out.print("\nMatch two digits without order: You win 10,000");
        
        else if (guessDigit1 == lottoryDigit1 || guessDigit2 == lottoryDigit1 ||
                 guessDigit3 == lottoryDigit1 || guessDigit1 == lottoryDigit2 || 
                 guessDigit2 == lottoryDigit2 || guessDigit3 == lottoryDigit2 || 
                 guessDigit1 == lottoryDigit3 || guessDigit2 == lottoryDigit3 || 
                 guessDigit3 == lottoryDigit3)
            System.out.print("\nMatch one digit: You win 500");
        
        else
            System.out.print("\nSorry, no match!");
                
        
        
        
    
    }
}
