/*
 * Q2.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        double deposit ;
        double profit ;
        double storage ;
        double extra ;
        int year=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter the initial amount of your deposit please : $") ;
        deposit=input.nextDouble () ;
        System.out.print ("Enter the interest on your deposit please : %") ;
        profit=input.nextDouble () ;
        System.out.println ("__________") ;
        //***
        storage=deposit*2 ;
        //***
        while (deposit<storage) {
            deposit=deposit+((deposit*profit)/100) ;
            year++ ;
        }
        //***
        extra=deposit-storage ;
        //***
        System.out.println ("After \""+year+"\" years your deposit will double") ;
        //***
        if (extra>0) {
            System.out.println ("Now you have \"$"+extra+"\" more than double your deposit") ;
        }
        //***
        System.out.println ("____________________") ;
    }
}