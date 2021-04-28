/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Hossein Rahi - Hanie Hadian
 */
public class workshop3_1 {
    public static void main(String[] args) {
        int guess = -1;
        int number;
        int counter = 0;
        
        Scanner input = new Scanner (System.in);
        
        number = (int)(Math.random() * 101);
        
        System.out.println("please guess your number you only have three guesses.");
        System.out.print("Enter your first guess:");
        
        while (counter != 3){
            
            guess = input.nextInt();
            
            if (guess == number){
                
                System.out.println(" your guess was right");
                     
            }
            else if(guess > number){
                System.out.println("your guess was higher than the  number please try again.\n");
                
            }
            else if (guess < number){
                System.out.println("your guess was lower than the number please try again.\n ");
            }
            
            counter++;
                    
        }
        System.out.println("your out of guesses.");
        
        
    }
    
}
    

