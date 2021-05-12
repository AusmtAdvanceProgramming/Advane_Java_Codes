/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quizz2;

import java.util.Scanner;

/**
 *
 * @author mohammdreza movaheadniya & ashkan rasuli
 */
public class Q1 {
        
    public static void main(String[] args){
    
        Scanner input=new Scanner (System.in) ;
        //***
        String word ;
        char letter ;
        int length ;
        int cont=0 ;
        int i=0 , j=0 ;
        //***
        System.out.print ("enter your  word : ") ;
        word=input.next () ;
        //***
        length=word.length ();
        
        word=word.toUpperCase();
        //***
        for (i=0;i<length;i++) {// for 1
            for (j=0;j<length;j++) {//for 2
                if (word.charAt (i)==word.charAt (j)) { 
                    cont++ ;
                }// end of if
            } // end of for2
            
            System.out.println ("The letter "+word.charAt (i)+" is repeated "+cont+" times in "+word+" series ") ;
            
            cont=0 ;
        }//end of for1
        
    }//end of main() method
}//end of class
