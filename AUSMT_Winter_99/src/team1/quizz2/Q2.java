/*
  Haniyeh Hadiyan - Hossein Rahi
*/
package team1.quizz2;

import java.util.Scanner;

public class Q2 {
    
         public static void main(String[] args) {
            
        Scanner input=new Scanner (System.in) ;
        //*
        int number_1 ;
        int number_2 ;
        int counter1 ;
        int counter2 ;
        int Divisor_1=0 ;
        int Divisor_2=0 ;
        int gcd=0 ;
        int i=1 , j=1 ;
        
        //----------------------------------------------------------
        
        System.out.print ("Enter your First number : ") ;
        number_1=input.nextInt () ;
        System.out.print ("Enter your Second number please : ") ;
        number_2=input.nextInt () ;
        
        //--------------------------------------------------
        
        if (number_1>number_2) {
            counter1=number_1 ;
            counter2=number_2 ;
        }
        else {
            counter1=number_2 ;
            counter2=number_1 ;            
        }
        //-----------------------------------------------------
        
        for (i=1; i<=counter1; i++) {
            if (counter1%i==0) {
                Divisor_1=i ;
            }
            for (j=1;j<=counter2;j++) {
                if (counter2%j==0) {
                    Divisor_2=j ;
                    
                    if (Divisor_1==Divisor_2) {
                        gcd=j ;
                    }
                }
            }
        }
        //-----------------------------------------------------
        
        System.out.println ("The Greater Common Divisor of "+counter1+" and "+counter2+" is : "+gcd) ;
       
    }
} //The end

