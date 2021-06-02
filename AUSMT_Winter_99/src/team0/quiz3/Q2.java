package team0.quiz3;
import javax.swing.JOptionPane ;
public class Q2 {
public static void main (String[] args) {
        int number ;
        int random ;
        int i=1 ;
        
        String input=JOptionPane.showInputDialog (null,"Enter the desired number of characters please :","Number input",JOptionPane.QUESTION_MESSAGE) ;
        number=Integer.parseInt (input) ;
        
        System.out.println ("____________________") ; 
        System.out.print ("Your string is : ") ;
        
        for (i=1;i<=number;i++) {
            random=(int) (Math.random ()*3) ;
            
            switch (random) {
                case 0 :
                    System.out.print ((int) (Math.random ()*10)) ;
                    break ;
                case 1 :
                    System.out.print ((char) ('a'+Math.random ()*('z'-'a'+1))) ;
                    break ;
                case 2 :
                    System.out.print ((char) ('A'+Math.random ()*('Z'-'A'+1))) ;
                    break ;
                }
        }
        System.out.println ("\n____________________") ;
    }
}
