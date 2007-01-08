/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;

import java.util.Scanner;
/**
 *
 * @author Rayamin
 */
public class lecture3_Example6_Team5 {
    
    public static void main(String[] args) {
        int guess;
        int lotteryDigit1, lotteryDigit2,lotteryDigit3;
        int guessDigit1,guessDigit2,guessDigit3;
        
        Scanner input = new Scanner(System.in);
        
        int lottery = (int)(Math.random() *1000);
        
        System.out.print("Enter your lottery pick(tree digits): ");
        guess=input.nextInt();
        
        lotteryDigit1=lottery/100;
        lotteryDigit2=(lottery%100)/10;
        lotteryDigit3=lottery%10;
        
        guessDigit1=guess/100;
        guessDigit2=(guess%100)/10;
        guessDigit3=guess%10;
        
        System.out.println("The lottery number is " +lottery);
        
        if(guess==lottery)
          
            System.out.println("Exact match: You won 100,000$");
        else if(guessDigit3==lotteryDigit3||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit1&&guessDigit2==lotteryDigit3||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit1&&guessDigit1==lotteryDigit3||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit1)
           
            System.out.println("Match all digits: You won 80,000$");
        else if(guessDigit1==lotteryDigit1&&guessDigit2==lotteryDigit2||guessDigit1==lotteryDigit1&&guessDigit3==lotteryDigit3||guessDigit2==lotteryDigit2&&guessDigit3==lotteryDigit3)
           
            System.out.println("Two digits match by order: You won 50,000$");
        else if(guessDigit1==lotteryDigit1||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit3&&guessDigit2==lotteryDigit1||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit3||guessDigit1==lotteryDigit1||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit3&&guessDigit3==lotteryDigit1||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit3||guessDigit2==lotteryDigit1||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit3&&guessDigit3==lotteryDigit1||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit3)
            
            System.out.println("Two digits match: You won 1,000$");
        else if(guessDigit1==lotteryDigit1||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit3||guessDigit2==lotteryDigit1||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit3||guessDigit3==lotteryDigit1||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit3)
        
            System.out.print("One digit matches: You won 500$");
        else
            System.out.println("Sorry,no match");
                
                
        
        
    }
}
