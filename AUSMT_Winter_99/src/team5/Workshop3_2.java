/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;
import java.util.Scanner;
/**
 *
 * @author mohammdreza
 */
public class Workshop3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in) ;
    String  series ;
    char letter ;
    int length ;
    int counter=0 ;
    int i=0 ;
    System.out.print ("Enter your desired \"String\" please : ") ;
    series=input.next () ;
    System.out.print ("Enter your desired \"Letter\" please : ") ;
    letter=input.next ().charAt (0) ;
    length=series.length () ;
    series=series.toLowerCase () ;
    letter=Character.toLowerCase (letter) ;
    for (i=0;i<length;i++) {
        if (series.charAt (i)==letter) {
            counter++ ;
        }//en if
    }//end for
    System.out.println ("The Letter \""+letter+"\" is used \""+counter+"\" times in \""+series+"\"") ;
    }//end of main method() method
}//end of class
    
