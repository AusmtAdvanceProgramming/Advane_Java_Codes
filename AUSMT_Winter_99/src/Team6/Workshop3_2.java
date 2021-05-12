/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6;

    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Workshop3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        String str ;
        char character ;
        int length ;
        int counter=0 ;
        int x=0 ;

        System.out.print ("Enter your intended String: ") ;
        str=input.next () ;

        System.out.print ("Enter your intended Character: ") ;
        character=input.next ().charAt(0) ;


        length=str.length () ;
        str = str.toLowerCase () ;
        character = Character.toLowerCase (character) ;

        for (x = 0; x < length; x++) {
            if (str.charAt(x) == character) {
                counter++ ;
            }
        }

        System.out.println ("The Character \""+character+"\" is used "+counter+" times in \""+str+"\"") ;

        // TODO code application logic 
    }
}
