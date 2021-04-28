/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz2;

import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int number1;
        int number2;
        int GCD;
       
       
        Scanner input = new Scanner (System.in);
       
        System.out.println("Please enter the two numbers you for G.C.D :");
       
        number1 = input.nextInt();
        number2 = input.nextInt();
       
        if (number1 > number2 )  
           
        GCD = number2; 
        else
        GCD = number1; 
       
        while (number1 % GCD != 0 || number2 % GCD !=0 ){
           
        GCD--;
        }
        
        
        System.out.println(" G.C.D of these two number is " + GCD );
       

        // TODO code application logic here
    }
}
