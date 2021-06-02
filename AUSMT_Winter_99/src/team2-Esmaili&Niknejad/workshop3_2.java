
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class workshop3_2 {
        public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        String seri ;
        char lttr ;
        int tol ;
        int cntr=0 ;
        int a=0 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        seri=input.next () ;
        System.out.println ("____") ;
        System.out.print ("Enter your desired \"Letter\" please : ") ;
        lttr=input.next ().charAt (0) ;
        System.out.println ("____") ;
        //*
        tol=seri.length () ;
        seri=seri.toLowerCase () ;
        lttr=Character.toLowerCase (lttr) ;
        //*
        for (a=0;a<tol;a++) {
            if (seri.charAt (a)==lttr) {
                cntr++ ;
            }
        }
        //*
        System.out.println ("The Letter \""+lttr+"\" is used \""+cntr+"\" times in \""+seri+"\"") ;
        System.out.println ("________") ;
    }
}
    

