/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6;

import java.util.Scanner;
/**
 *
 * @author Mahdi Adabi & hasan mousavi tabar 
 */
public class Lottery_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int guess;
        int lotteryDigit1, lotteryDigit2, lotteryDigit3;
        int guessDigit1, guessDigit2, guessDigit3;
        
        Scanner input = new Scanner (System.in);
        
        int lottery = (int) (Math.random() * 1000 );
        
        System.out.print("Enter your lottery pick (three digits): ");  
        guess = input.nextInt();
        
        lotteryDigit1 = lottery / 100;
        lotteryDigit2 = ((lottery % 100) / 10);
        lotteryDigit3 = lottery % 10;
        
        guessDigit1 = guess / 100;
        guessDigit2 = ((guess % 100) / 10);
        guessDigit3 = guess % 10;
        
        System.out.println("The lottery number is " + lottery);
        
        if (guess == lottery){
            System.out.println("Exact macth: you win 100,000");
        }
        
        else if ((guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2) && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3 ) && (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)){
            System.out.println("Macth three digits(unordered): you win 80,000");    
        }
        
        else if (((guessDigit1==lotteryDigit1)&&(guessDigit2==lotteryDigit2))||((guessDigit1==lotteryDigit1)&&(guessDigit3==lotteryDigit3))||((guessDigit2==lotteryDigit2)&&(guessDigit3==lotteryDigit3))){
            System.out.println("Macth two digits(ordered): you win 50,000");
        }
        else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3)|| (guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit1)|| (guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit2)|| (guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)|| (guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit1)){
           System.out.println("Macth two digits(unordered): you win 10,000"); 
        }
        else if ((guessDigit1 == lotteryDigit2)||(guessDigit1 == lotteryDigit3)||(guessDigit2 == lotteryDigit1)||(guessDigit2 == lotteryDigit3)||(guessDigit3 == lotteryDigit1)||(guessDigit3 == lotteryDigit2)||(guessDigit1 == lotteryDigit1)||(guessDigit2 == lotteryDigit2)||(guessDigit3 == lotteryDigit3))   {
           System.out.println("Macth one digits: you win 500");  
        } 
        else System.out.println("No Match"); 
        }
}
