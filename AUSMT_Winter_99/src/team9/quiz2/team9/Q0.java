/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2.team9;
  
/**
 * @author ali asghar ranjbar & zeynab karimi zad
 */
import java.util.Scanner ;

public class Q0 {
    public static void main (String[] args){
    Scanner input=new Scanner (System.in) ;

        String series ;
        String temp ;
        int length ;
        int counter=0 ;
        int a=0 , b=0 ;


        System.out.print ("Enter your desired \"String\" please : ") ;
        series=input.next () ;
        temp=series ;

        length=series.length () ;
        series=series.toLowerCase () ;
        temp=temp.toLowerCase () ;
        
        for (a=0;a<length;a++) {
            if (series.charAt (a)=='*') {
                continue ;
            }
            for (b=0;b<length;b++) {
                if (series.charAt (a)==series.charAt (b)) {
                    counter++ ;
                }
            }

            if (counter>=2) {
                series=series.replace (series.charAt (a),'*') ;
            }

            System.out.println ("------") ;

            System.out.println ("The letter \""+temp.charAt (a)+"\" is repeated \""+counter+"\" times in \""+temp+"\" series ") ;

            counter=0 ;
        }
}
}