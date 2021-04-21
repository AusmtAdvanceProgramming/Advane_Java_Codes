/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Hossein Rahi - Hanie Hadian
 */
public class workshop3_2 {
      public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        String series ;
        char word ;
        int length ;
        int counter=0 ;
        int i=0 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter your \"String\" please : ") ;
        series=input.next () ;
        System.out.println ("____") ;
        System.out.print ("Enter your \"word\" please : ") ;
        word=input.next ().charAt (0) ;
        System.out.println ("____") ;
        //*
        length=series.length () ;
        series=series.toLowerCase () ;
        word=Character.toLowerCase (word) ;
        //*
        for (i=0;i<length;i++) {
            if (series.charAt (i)==word) {
                counter++ ;
            }
        }
        //*
        System.out.println ("The word \""+word+"\" is used \""+counter+"\" times in \""+series+"\"") ;
        System.out.println ("________") ;
    }
}
    

