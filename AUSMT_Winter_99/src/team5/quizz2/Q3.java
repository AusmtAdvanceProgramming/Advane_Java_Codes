/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quizz2;

import java.util.Scanner;

/**
 *
 * @author mohammdreza movaheadniya& ashkan rasuli
 */
public class Q3 {
        
    public static void main(String[] args){
    
                Scanner input=new Scanner (System.in) ;
        //***
        double deposit ;
        double profit ;
        double storage ;
        double extra ;
        int year=0 ;
        //***
        System.out.print ("Enter the initial amount of your deposit please : $") ;
        deposit=input.nextDouble () ;
        System.out.print ("Enter the interest on your deposit please : %") ;
        profit=input.nextDouble () ;
        //***
        storage=deposit*2 ;
        //***
        while (deposit<storage) {
            deposit=deposit+((deposit*profit)/100) ;
            year++ ;
        }
        //***
        extra=deposit-storage ;
        //***
        System.out.println ("After "+year+" years your deposit will double") ;
        //***
        if (extra>0) {
            System.out.println ("Now you have $"+extra+" more than double your deposit") ;
        }
        //***
        
    }//end of main() method
}//end of class
