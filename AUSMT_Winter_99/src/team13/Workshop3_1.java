/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team13;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Workshop3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int guess = -1;
        int number;
        int count = 1;
        
         Scanner input = new Scanner(System.in);
        
        number = (int)(Math.random() * 101);
        
        System.out.println("Please guess a number between include 0 and 100");
        System.out.print("What is your first guess? ");
                
        
        
        while ( guess != number && count <= 3 ) 
          
        {
            guess = input.nextInt();
            
            count +=1;
            
            if ( guess == number)
            {
                System.out.printf(" Congradulation, the number is %d \n" , guess);
                
            }
            else if ( guess < number )
            {                
             System.out.print(" Your guess is too low , your new guess?");
            }
            else if (guess > number )
            {
                System.out.print("Your guess is too high , your new guess?");
            }
            
             
        }//end if  
    }//end of while
    
}//end of main() method
