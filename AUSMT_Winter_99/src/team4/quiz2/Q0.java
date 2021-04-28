/*
 * Q0.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q0 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        String series ;
        String tempo ;
        int length ;
        int counter=0 ;
        int flag=0 ;
        int i=0 , j=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        series=input.next () ;
        tempo=series ;
        //***
        length=series.length () ;
        series=series.toLowerCase () ;
        tempo=tempo.toLowerCase () ;
        //***
        for (i=0;i<length;i++) {
            if (series.charAt (i)=='*') {
                continue ;
            }
            for (j=0;j<length;j++) {
                if (series.charAt (i)==series.charAt (j)) {
                    counter++ ;
                }
            }
            //***
            if (counter>=2) {
                series=series.replace (series.charAt (i),'*') ;
            }
            //***
            System.out.println ("__________") ;
            System.out.println ("The letter \""+tempo.charAt (i)+"\" is repeated \""+counter+"\" times in \""+tempo+"\" series ") ;
            //***
            counter=0 ;
        }
        System.out.println ("____________________") ;
    }
}
