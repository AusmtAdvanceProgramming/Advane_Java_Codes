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
public class Jalase_4om {
        public static void main(String[] args) {

        //Example 6
        
        int guess;
        int lotteryDigit1, lotteryDigit2, lotteryDigit3;
        int guessDigit1, guessDigit2, guessDigit3;
        
        Scanner input = new Scanner(System.in);
        
        //Generate a lottery number 
        int lottery = (int) (Math.random() * (1000 - 100) + 100);
        //Baraye Test e karam code line 43 ro be line 29 montaghel kardam, baraye takmile code line 29 pak khahad shod !!!
        System.out.println("The lottery number is " + lottery);
        System.out.print("Enter your lottery pick (three digits) :  ");
        guess = input.nextInt();
        
        //Get digits from lottery
        lotteryDigit1 = lottery / 100;
        lotteryDigit2 = (lottery % 100) / 10;
        lotteryDigit3 = lottery % 10;
        
        //Get digits from guess
        guessDigit1 = guess / 100;
        guessDigit2 = (guess % 100) / 10;
        guessDigit3 = guess % 10;
        
        //System.out.println("The lottery number is " + lottery);
        
        //Check the guess
               if (guess==lottery) 
            System.out.println ("Exact match : you win 100,000") ;
        
        else if (((guessDigit1==lotteryDigit2)||(guessDigit1==lotteryDigit3))&&((guessDigit2==lotteryDigit1)||(guessDigit2==lotteryDigit3))&&((guessDigit3==lotteryDigit1)||(guessDigit3==lotteryDigit2))) 
            System.out.println ("Match all digits : you win 80,000") ;
        
        else if (((guessDigit1==lotteryDigit1)&&(guessDigit2==lotteryDigit2))||((guessDigit1==lotteryDigit1)&&(guessDigit3==lotteryDigit3))||((guessDigit2==lotteryDigit2)&&(guessDigit3==lotteryDigit3))) 
            System.out.println ("Match two numbers in order : you win 50,000") ;
        
        else if (((guessDigit3==lotteryDigit1)&&(guessDigit2==lotteryDigit3))||((guessDigit3==lotteryDigit2)&&(guessDigit1==lotteryDigit3))||((guessDigit1==lotteryDigit2)&&(guessDigit2==lotteryDigit1))) 
            System.out.println ("Match two numbers without order : you win 10,000") ;
        
        else if ((guessDigit1==lotteryDigit1)||(guessDigit1==lotteryDigit2)||(guessDigit1==lotteryDigit3)||(guessDigit2==lotteryDigit1)||(guessDigit2==lotteryDigit2)||(guessDigit2==lotteryDigit3)||(guessDigit3==lotteryDigit1)||(guessDigit3==lotteryDigit2)||(guessDigit3==lotteryDigit3)) 
            System.out.println ("Match one number : you win 500 ") ;
        
        else 
            System.out.println ("Sorry , No Match") ;
        
        
        // in code hanoz moshkel dare va agar mitoonid behem komak konid moshkelesh ro peida konam, to ghesmate check the guess moshkelam hast, mamnoon
        

        }
}
