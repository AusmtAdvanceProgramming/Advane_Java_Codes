/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team2;


/**
 *
 * @author Win 10
 */

import java.util.Scanner;
public class Lecture3_example6 {
    
    public static void main(String[] args) {
        
        int guess;
        int Luckynumber1,Luckynumber2,Luckynumber3; 
        int guess1,guess2,guess3;
        
        Scanner input = new Scanner (System.in);
        
          int Luckynumber =(int)(Math.random()*1000);
          
        System.out.print("Enter a three-digit lucky number :");
        guess = input.nextInt();
        
        Luckynumber1 = Luckynumber / 10;
        Luckynumber2 = ((Luckynumber % 10)/10) ; 
        Luckynumber3 = Luckynumber /100;
                
                
        guess1 = guess / 10;  
        guess2 = ((guess % 10)/10); 
        guess3 = guess / 100;  
        
        
        System.out.println("The lottery number is :" + Luckynumber);
        
        if (guess == Luckynumber){
            
            System.out.println("You won $10,0000");}
        
        else if ( guess1 == Luckynumber1 && guess2 == Luckynumber2 && guess3 == Luckynumber3){
            
            System.out.println("You won $80000");}
        
         
        else if(guess1 == Luckynumber1 &&  guess2 == Luckynumber2 || guess1 == Luckynumber1 &&  
            guess3 == Luckynumber3 || guess2 == Luckynumber2 &&  guess3 == Luckynumber3 ){
             
             System.out.println("You won $50000"); }
         
         
        else if(guess3 == Luckynumber1 && guess2 == Luckynumber3 ||guess3 == Luckynumber2 && guess1 == Luckynumber3
             || guess1 == Luckynumber2 && guess2 == Luckynumber1 ){
             
            System.out.println("You won $10000"); } 
         
         
        else if(guess1 == Luckynumber1 || guess1 == Luckynumber2 || guess1 == Luckynumber3 ||
             guess2 == Luckynumber1 || guess2 == Luckynumber2 || guess2 == Luckynumber3 ||
             guess3 == Luckynumber1 || guess3 == Luckynumber2 || guess3 == Luckynumber3 ){
             
            System.out.println("You won $500"); } 
        
        else {
            System.out.println("You won $0"); } 
    
    
    }//end of main() method
    
    
}//end of class
