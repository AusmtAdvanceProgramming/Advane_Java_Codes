/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Q0.java
 */
package team8.quiz2 ;
/**
 */
import java.util.Scanner ;
//***
public class Q0 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        String series ;
        char letter ;
        int length ;
        int counter=0 ;
        int i=0 , j=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired \"String\" please : ") ;
        series=input.next () ;
        //***
        length=series.length () ;
        series=series.toLowerCase () ;
        //***
        for (i=0;i<length;i++) {
            for (j=0;j<length;j++) {
                if (series.charAt (i)==series.charAt (j)) {
                    counter++ ;
                }
            }
            //***
            System.out.println ("__________") ;
            System.out.println ("The letter \""+series.charAt (i)+"\" is repeated \""+counter+"\" times in \""+series+"\" series ") ;
            //***
            counter=0 ;
        }
        System.out.println ("____________________") ;
    }
}