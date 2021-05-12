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
public class Q0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input=new Scanner (System.in) ;

        String str;
        String temp;
        int length;
        int counter = 0;
        int i= 0, j= 0;


        System.out.print ("Enter your desired \"String\" please : ");
        str=input.next () ;
        temp=str ;

        length=str.length () ;
        str=str.toLowerCase () ;
        temp=temp.toLowerCase () ;

        for (i=0; i < length; i++) {
            if (str.charAt (i) == '&') {
                continue;
            }
            for (j=0; j < length; j++) {
                if (str.charAt (i) == str.charAt (j)) {
                    counter++;
                }
            }

            if (counter >= 2) {
                str=str.replace (str.charAt (i),'&');
            }



            System.out.println ("The letter  "+temp.charAt (i)+"  is repeated  "+counter+"  times in  "+temp+"  series ") ;

            counter = 0;
        }
        // TODO code application logic here
    }
}
