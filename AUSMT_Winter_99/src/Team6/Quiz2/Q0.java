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
        
        Scanner input = new Scanner (System.in);

        
        String str;
        int length;
        int counter = 0;
        int i, j;

        
        System.out.print ("Input your intended String please : ");
        str = input.next ();

        length = str.length ();
        str = str.toLowerCase ();

        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                if (str.charAt (i) == str.charAt (j)) { 
                    counter++;                               
                }
            }
            
            System.out.println ("The letter "+str.charAt (i)+"\" is repeated "+counter+" times in "+str+" series.") ;

            
            counter = 0;
        }
        
        // TODO code application logic here
    }
}
