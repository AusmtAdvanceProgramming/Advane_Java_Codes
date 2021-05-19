/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz2;

import java.util.Scanner;

/**
 *
 * @author Mahdi
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);

        int dec;
        int temp;
        int[] hex={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int counter = 0;
        int i = 0;


        System.out.print ("Input your intended number: ");
        dec=input.nextInt ();


        temp = dec;

        while (dec > 0) {
            hex[i]= dec % 16;
            dec /= 16;
            counter++;
            i++;
        }

        System.out.print ("The number " + temp + "  is equal to \"") ;

        for (i = counter - 1; i >= 0; i--) {
            switch (hex[i]) {
                case 10 :
                    System.out.print ("A");
                    break ;
                case 11 :
                    System.out.print ("B");
                    break ;
                case 12 :
                    System.out.print ("C");
                    break ;
                case 13 :
                    System.out.print ("D");
                    break ;
                case 14 :
                    System.out.print ("E");
                    break ;
                case 15 :
                    System.out.print ("F");
                    break ;                    
                default :
                    System.out.print (hex[i]);
            }   
        }

        System.out.println ("\" in Hexadecimal base.");

    }
}
