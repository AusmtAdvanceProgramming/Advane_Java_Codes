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
//*
public class Q0 {
    public static void main (String[] args) {
  
        String string;
        int length ;
        int counter = 0 ;
         
         Scanner input=new Scanner (System.in) ;
        
        System.out.print ("Enter your desired \"String\" please : ") ;
        string=input.next () ;
       
        length=string.length () ;
        string=string.toLowerCase () ;
        
        for (int i = 0;i < length; i++) {
            
            for (int j = 0;j < length; j++) {
                
                if (string.charAt (i) == string.charAt (j)) {
                    counter++;
                }
            }//end of j
            
            
            System.out.println ("The letter \""+string.charAt (i)+ "\" is repeated \"" + counter +"\" times in \"" + string + "\" series ") ;
            
            counter = 0 ;
        }//end of i
        System.out.println ("End of programm.") ;
    }//end of method
    
}//end of class