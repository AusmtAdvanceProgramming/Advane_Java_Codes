/*
 * Workshop3_2.java
 */
package team3_0 ;
/**
 * @author amirali ghaumi
 * @author naser riazi
 *
 */
import java.util.Scanner ;
//*
public class Workshop3_2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        String series ;
        char word ;
        int length ;
        int counter = 0 ;
        
        
        
        
        System.out.print ("Enter your desired \"String\" please : ") ;
        
        series = input.next () ;
        
        
        
        System.out.print ("Enter your desired \"Letter\" please : ") ;
        
        word = input.next ().charAt (0) ;
        
        
        
        //*
        length = series.length () ;
        
        series = series.toLowerCase () ;
        
        word = Character.toLowerCase (word) ;
        
        //*
        for (int i = 0;i < length ;i++) {
            
            if (series.charAt (i) == word) {
                
                counter++ ;
            }
        }
        //*
        System.out.println ("The Letter \"" + word + "\" is used \"" + counter + "\" times in \"" + series + "\"") ;
        
    }
}