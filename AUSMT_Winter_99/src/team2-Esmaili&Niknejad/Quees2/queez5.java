
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
public class queez5 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        String jomle ;
        char harf ;
        int tol ;
        int counter=0 ;
        int i=0 , j=0 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        jomle=input.next () ;
        //*
        tol=jomle.length () ;
        jomle=jomle.toLowerCase () ;
        //*
        for (i=0;i<tol;i++) {
            for (j=0;j<tol;j++) {
                if (jomle.charAt (i)==jomle.charAt (j)) {
                    counter++ ;
                }
            }
            //*
            System.out.println ("____") ;
            System.out.println ("The letter \""+jomle.charAt (i)+"\" is repeated \""+counter+"\" times in \""+jomle+"\" series ") ;
            //*
            counter=0 ;
        }
        System.out.println ("________") ;
    }
}

    

