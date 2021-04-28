/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz2;

/**
 *
 * @amirali ghaumi
 * @naser riazi
 * team3
 */
import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */

    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double deposit ;
        double profit ;
        double wholeSalary ;
        double extraMoney ;
        int year=0 ;
       
        
        System.out.print ("Enter the  amount of your deposit please : $") ;
        
        deposit = input.nextDouble () ;
        
        System.out.print ("Enter the profit on your deposit please : %") ;
        
        profit = input.nextDouble () ;
        
        
        
        wholeSalary = deposit*2 ;
       
        while (deposit<wholeSalary) {
            deposit = deposit + (( deposit * profit) / 100) ;
            year++ ;
        }//end of while
        
        extraMoney = (int)((deposit - wholeSalary) * 100) / 100 ;
        
        System.out.println ("After \"" + year + "\" years your deposit will double") ;
        
        if (extraMoney > 0) {
            System.out.println ("Now you have \"$" + extraMoney + "\" more than double your deposit") ;
        }//end of if
        
        System.out.println ("End of programm") ;
    }//end of method
    
}//end of class