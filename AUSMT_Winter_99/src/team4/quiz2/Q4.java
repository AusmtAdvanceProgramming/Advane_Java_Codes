/*
 * Q4.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q4 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        int flag=0 ;
        int counter=0 ;
        int i=1 , j=1 ;
        //***
        System.out.println ("____________________") ;
        for (i=1;flag<40;i++) {
            for (j=1;j<=i;j++) {
                if (i%j==0) {
                    counter++ ;
                }
            }
            //***
            if (counter==2) {
                System.out.print (i+"\t") ;
                flag++ ;
                //***
                if (flag%8==0) {
                    System.out.println () ;
                }
            }
            //***
            counter=0 ;   
        }
        System.out.println ("____________________") ;
    }
}
