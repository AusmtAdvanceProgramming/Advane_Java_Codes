/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7;

import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Workshop3_1 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int guess = -1;
        int number;

        Scanner input = new Scanner(System.in);

        number = (int)(Math.random() * 101);
        
        System.out.println("Please guess a number between include 0 to 100.");
        System.out.print("What is your first guess: ");
        
        int times = 0;
        while (times < 3){

            guess = input.nextInt();

            if (guess == number){

                System.out.printf("Congradulation, The number is %d \n", guess);

            } else if(guess < number){
                
                System.out.print("Your guess is too low, your new guess? ");

            } else if (guess > number){
                System.out.println("Your guess is too high, your new guess? ");
            }

            times++;

        }
        System.out.println("\nSorry, Your have no more guesses! The number was "
        + number + " !");



    }
}