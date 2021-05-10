/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz2;
import java.util.Scanner;
/**
 *
 * @amirali ghaumi
 * @naser riazi
 * team3
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in) ;
       
        int decimal ;
        int temp ;
        int[] hexdecimal = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
        int counter = 0 ;
        int i = 0 ;
        
        
        System.out.print ("Enter your number to convert to hexdecimal : ") ;
        decimal = input.nextInt () ;
        
        
        temp = decimal ;
        
        while (decimal > 0) {
            
            hexdecimal[i] =  decimal % 16 ;
            decimal /= 16 ;
            counter++ ;
            i++ ;
        }//end of while
       
        System.out.print ("The number \"" + temp + "\" in Decimal base is equal to \"") ;
      
        for (i = counter - 1; i>=0; i--) {
            switch (hexdecimal[i]) {
                case 10 :
                    System.out.print ("A") ;
                    break ;
                case 11 :
                    System.out.print ("B") ;
                    break ;
                case 12 :
                    System.out.print ("C") ;
                    break ;
                case 13 :
                    System.out.print ("D") ;
                    break ;
                case 14 :
                    System.out.print ("E") ;
                    break ;
                case 15 :
                    System.out.print ("F") ;
                    break ;                    
                default :
                    System.out.print (hexdecimal[i]) ;
            }//end of switch
            
        }//end of for
        
        System.out.print ("\" in Hexadecimal base\n") ;
        
        System.out.println ("The Hexadecimal function that defined in \"Java\" answers : "+Integer.toHexString (temp).toUpperCase ()) ;
        
        System.out.println("The program ended");
        
        System.out.println("**************************");
    }//end of method
    
}//end of class
