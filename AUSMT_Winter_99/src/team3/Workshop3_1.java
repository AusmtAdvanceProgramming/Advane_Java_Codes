/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3_0;

import java.util.Scanner;

/**
 *
 * @author amirali ghaumi
 * @author naser riazi
 */
public class Workshop3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guess = -1;
        int number;
        int counter = 0;
        
        Scanner input = new Scanner (System.in);
        
        number = (int)(Math.random() * 101);
        
        System.out.println("please guess your number you only have three guesses.");
        System.out.print("Enter your  guess:");
        
        while (counter != 3){
            
            guess = input.nextInt();
            
            if (guess == number){
                
                System.out.println("congratulations your guess was right!!!");
                     
            }
            
            else if(guess > number){
                
                System.out.println("your guess was higher than the  number.");
                
            }
            
            else if (guess < number){
                
                System.out.println("your guess was lower than the number. ");
                
            }
            
            counter++;
                    
        }
        
        System.out.println("your out of guesses.");
        
        
    }
    
}
