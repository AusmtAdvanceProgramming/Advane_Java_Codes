/*
 * Workshop3_2.java
 */
package team3.quiz2 ;
/**
 * @author amirali ghaumi
 * @author naser riazi
 *team3
 */
import java.util.Scanner ;

public class Q0 {
    public static void main (String[] args) {
  
        String string ;
        String letter ;
        int length ;
        int counter = 0 ;
        int i=0 , j=0 ;

        
         Scanner input=new Scanner (System.in) ;

        System.out.print ("Enter your  \"String\" please : ") ;
        
        string = input.next () ;
        
        letter = string ;//because we are replacing the letter with *  if the counter is 
        //more than 2 we have to save it in String letter
        //to shoe it when we want

        length = string.length () ;
        string = string.toLowerCase () ;//for comparing the letters equaly
        letter = letter.toLowerCase () ;//for comparng the letters equaly
        
        for (i = 0;i < length; i++) {
            if (string.charAt (i)=='*') {
                continue ;
            }
            for (j = 0;j < length; j++) {
                
                if (string.charAt (i)==string.charAt (j)) {
                    counter++ ;
                }
            }//end of for j

            if (counter>=2) {
                
                string=string.replace (string.charAt (i),'*') ;
            }//end of if

            System.out.println ("The letter \""+letter.charAt (i)+"\" is repeated \""+counter+"\" times in \""+letter+"\" series ") ;
            counter=0 ;
            
        }//end of for i
        System.out.println("End of programm");
        
        System.out.println("****************************");
    }//end of method
    
}//end of class