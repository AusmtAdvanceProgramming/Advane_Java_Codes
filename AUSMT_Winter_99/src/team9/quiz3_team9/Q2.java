/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_team9;
/**
 * @author Aliasghar ranjbar
 * @author zeynab karimizad
 */
import java.util.Scanner;
public class Q2 {
    
   public static void main (String[] args) {
         Scanner input = new Scanner(System.in);
        int number ;
        int random ;
        int i=1 ;
        System.out.print("Enter the length of the string: ");
        number = input.nextInt();
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~") ; 
        System.out.print ("Your string is : ") ;
        for (i=1;i<=number;i++) {
            random=(int) (Math.random ()*3) ;
            
            switch (random) {
                case 0 :
                    System.out.print ((int) (Math.random ()*10)) ;
                    break ;
                case 1 :
                    System.out.print ((char) ('a'+Math.random ()*('z'-'a'+1))) ;
                    break ;
                case 2 :
                    System.out.print ((char) ('A'+Math.random ()*('Z'-'A'+1))) ;
                    break ;
                } 
        } 
        System.out.println ("\n~~~~~~~~~~~~~~~~~~~~~~~~") ;
} 
}