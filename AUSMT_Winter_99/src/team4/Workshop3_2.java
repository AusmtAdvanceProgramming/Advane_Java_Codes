/*
 * Workshop3_2.java
 */
package team4 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Workshop3_2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        String series ;
        char letter ;
        int length ;
        int counter=0 ;
        int i=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        series=input.next () ;
        System.out.println ("__________") ;
        System.out.print ("Enter your desired \"Letter\" please : ") ;
        letter=input.next ().charAt (0) ;
        System.out.println ("__________") ;
        //***
        length=series.length () ;
        series=series.toLowerCase () ;
        letter=Character.toLowerCase (letter) ;
        //***
        for (i=0;i<length;i++) {
            if (series.charAt (i)==letter) {
                counter++ ;
            }
        }
        //***
        System.out.println ("The Letter \""+letter+"\" is used \""+counter+"\" times in \""+series+"\"") ;
        System.out.println ("____________________") ;
    }
}