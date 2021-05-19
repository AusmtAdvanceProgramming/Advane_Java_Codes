/*
 Haniyeh Hadiyan _ Hossein Rahi
 */
package team1.quizz2;

import java.util.Scanner;

public class Q4 {
    
     public static void main (String[] args) {
         
        Scanner input=new Scanner (System.in) ;
        
        int Base_number_10 ;
        int Fixed ;
        int[] Number_of_divisions={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
        int Number_of_division_numbers=0 ;
        int Presentation_houses=0 ;
        
        //---------------------------------------------------------
        
        System.out.print ("Please enter your desired number : ") ;
        Base_number_10=input.nextInt () ;
        
        Fixed=Base_number_10 ;
        
        while (Base_number_10 > 0) {
            Number_of_divisions[ Presentation_houses ]=Base_number_10%16 ;
            Base_number_10/=16 ;
            Number_of_division_numbers++ ;
            Presentation_houses++ ;
        }
       
        System.out.print ("The number is based on 10 : "+Fixed+"So the number is based on 16") ;
        
        //-----------------------------------------------------------
       
        for ( Presentation_houses = Number_of_division_numbers-1;  Presentation_houses>=0;  Presentation_houses-- ) {
            switch (Number_of_divisions[Presentation_houses]) {
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
                    System.out.print (Number_of_divisions[Presentation_houses]) ;
            }   
        }
    }
} // The end