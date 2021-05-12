/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9;

/**
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;

public class workshop3_2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        String string ;
        char word ;
        int length ;
        int counter=0 ;
        
        System.out.println ("************************************") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        string=input.next () ;
        System.out.println ("************************************") ;
        System.out.print ("Enter your desired \"word\" please : ") ;
        word=input.next ().charAt (0) ;
        System.out.println ("************************************") ;
        
        length=string.length () ;
        string=string.toLowerCase () ;
        word=Character.toLowerCase (word) ;
        
        for (int j=0 ; j<length ; j++) {
            if (string.charAt (j)==word) {
                counter++ ;
            }
        }
        
        System.out.println ("The word \""+word+"\" is used \""+counter+"\" times in \""+string+"\"") ;
        System.out.println ("************************************") ;
    }
}