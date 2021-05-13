package team3.quiz2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @amirali ghaumi
 * @naser tabrizi 
 * team3
 */
import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number1;
       int number2;
       int greaterCommonDivisor;
       
       
       Scanner input = new Scanner (System.in);
       
       System.out.println("Please enter the two numbers you for G.C.D :");
       
       number1 = input.nextInt();
       number2 = input.nextInt();
       
       if (number1 > number2 )
           
           greaterCommonDivisor = number1;
       else
           greaterCommonDivisor = number2;
       
       while (number1 % greaterCommonDivisor != 0 || number2 % greaterCommonDivisor != 0 ){
           
          greaterCommonDivisor--;
       }//end of while 
       
       
       System.out.println(" G.C.D of these two number is " + greaterCommonDivisor );
       
       System.out.println("****************************");
       
       
               
    }//end of method
    
}//end of class
