/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2.team9;

/**
 *
 * @author ali asghar ranjbar & zeynab karimi zad
 */
import java.util.Scanner ;

public class Q3 {
     public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        int dec ;
        int storage ;
        int[] hex={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
        int counter=0 ;
        int a=0 ;
        
        System.out.println ("******************************") ;
        System.out.print ("lotfan adad ra vared konid : ") ;
        dec=input.nextInt () ;
        System.out.println ("----------") ;
        
        storage=dec ;
        
        while (dec>0) {
            hex[a]=dec%16 ;
            dec/=16 ;
            counter++ ;
            a++ ;
        }
        
        System.out.print ("adade \""+storage+"\" mabnay 10  barabar ast ba \"") ;
        
        for (a=counter-1;a>=0;a--) {
            switch (hex[a]) {
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
                    System.out.print (hex[a]) ;
            }   
        }
        
        System.out.print ("\" dar mabnay 16\n") ;
        System.out.println ("******************************") ;
    }
}