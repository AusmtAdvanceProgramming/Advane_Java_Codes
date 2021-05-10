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
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
       
        double deposit ;
        double profit ;
        double year ;
        int provision1 ;
        int provision2 ;
        
        
        System.out.print ("Enter the  amount of your deposit please : $") ;
        
        deposit=input.nextDouble () ;
        
        System.out.print ("Enter the profit on your deposit please : %") ;
        
        profit=input.nextDouble () ;
        
        profit = 1 + (profit/100) ;
        
        year=(int) (((Math.log(2)) / (Math.log(profit))) * 10) / 10.0 ;//the formula for obtaning
        //year using log in method math
        
        provision1=(int) year ;
        
        provision2 = (int)((year - provision1) * 10) ;
        
        provision2 = (int)(provision2 * 12 / 10) ;
       
        System.out.println ("After " + provision1 + " years and " + provision2 + " months your deposit will double") ;
        
        System.out.println ("End of programm") ;
        
        System.out.println("****************************");
    }
}