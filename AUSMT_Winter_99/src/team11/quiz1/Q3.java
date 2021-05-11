/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11.quiz1;
import java.util.Scanner;
/**
 *
 * @author Parsley
 */
public class Q3 {
    
     public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int amount, fiftyThousandTomans, tenThousandTomans, fiveThousandTomans, twoThousandTomans, oneThousandTomans, fiveHundredTomans;
        
        System.out.println("Enter the amount(less than 100,000 Toman):");
        
        amount = input.nextInt();
        
        fiftyThousandTomans = amount / 50000;
        tenThousandTomans = (amount % 50000) / 10000 ;
        fiveThousandTomans = (amount % 10000) / 5000;
        twoThousandTomans = (amount % 5000) / 2000 ;
        oneThousandTomans = (amount % 2000) / 1000 ;
        fiveHundredTomans = (amount % 1000) / 500 ;
        System.out.println("The amount you entered includes " +  fiftyThousandTomans + ", 50000 tomans and " + tenThousandTomans + ", 10000 tomans and " + fiveThousandTomans + ", 5000 tomans and " + twoThousandTomans + ", 2000 tomans and " + oneThousandTomans + ", 1000 toamns and " + fiveHundredTomans + ", 500 tomans .");

        
        
                
        
        
        
        
        
        
    }
    
}
