/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6;

    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Workshop3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int guess = -1;
        int RandomNumber;
        int counter = 0;
                
        RandomNumber = (int)(Math.random() * 101);
        
        System.out.println("Please guess the number you only have three guesses.");
        System.out.print("Enter your first guess: ");
        
        while (counter != 3){
            
            guess = input.nextInt();
            
            if (guess == RandomNumber){
                
                System.out.println("GOOD JOB! you guess right!");
                     
            }
            else if(guess > RandomNumber){
                System.out.println("Your guess was higher than the  number please try again.");
                
            }
            else if (guess < RandomNumber){
                System.out.println("Your guess was lower than the number please try again.");
            }
            
            counter++;
                    
        }
        System.out.println("Sorry, out of guesses.");
        

        // TODO code application logic 
    }
}
