/*
 * Q1.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q1 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        int number1 ;
        int number2 ;
        int counter1 ;
        int counter2 ;
        int tempo1=0 ;
        int tempo2=0 ;
        int gcd=0 ;
        int i=1 , j=1 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your \"First Number\" please : ") ;
        number1=input.nextInt () ;
        System.out.print ("Enter your \"Second Number\" please : ") ;
        number2=input.nextInt () ;
        System.out.println ("__________") ;
        //***
        if (number1>number2) {
            counter1=number1 ;
            counter2=number2 ;
        }
        else {
            counter1=number2 ;
            counter2=number1 ;            
        }
        //***
        for (i=1;i<=counter1;i++) {
            if (counter1%i==0) {
                tempo1=i ;
            }
            for (j=1;j<=counter2;j++) {
                if (counter2%j==0) {
                    tempo2=j ;
                    if (tempo1==tempo2) {
                        gcd=j ;
                    }
                }
            }
        }
        //***
        System.out.println ("The Greater Common Divisor of \""+counter1+"\" and \""+counter2+"\" is : "+gcd) ;
        System.out.println ("____________________") ;
    }
}