/*
 * Q3.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q3 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        int dec ;
        int storage ;
        int[] hex={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
        int counter=0 ;
        int i=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired number please : ") ;
        dec=input.nextInt () ;
        System.out.println ("__________") ;
        //***
        storage=dec ;
        //***
        while (dec>0) {
            hex[i]=dec%16 ;
            dec/=16 ;
            counter++ ;
            i++ ;
        }
        //***
        System.out.print ("The number \""+storage+"\" in Decimal base is equal to \"") ;
        //***
        for (i=counter-1;i>=0;i--) {
            switch (hex[i]) {
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
                    System.out.print (hex[i]) ;
            }   
        }
        //***
        System.out.print ("\" in Hexadecimal base\n") ;
        System.out.println ("__________") ;
        System.out.println ("The Hexadecimal function that defined in \"Java\" answers : "+Integer.toHexString (storage).toUpperCase ()) ;
        System.out.println ("____________________") ;
    }
}