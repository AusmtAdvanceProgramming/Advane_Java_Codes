package team0.quiz3;
import javax.swing.JOptionPane;
public class Q0 {
public static void main (String[] args) {
        char confirm='y' ;
        double num=0 ;
        double max=0 ;
        double min=0 ;
        double total=0 ;
        int i=1 ;
        
        while (confirm=='y') {

            String input1=JOptionPane.showInputDialog (null,"Enter your desired number please :",
            "Number input",JOptionPane.QUESTION_MESSAGE) ;
            num=Double.parseDouble (input1) ;
            
            if (i!=0) {
                i=0 ;
                max=num ;
                min=num ;
            }
            
            total+=num ;

            if (num>=max) {
                max=num ;
            }

            if (num<=min) {
                min=num ;
            }
            
            String input2=JOptionPane.showInputDialog (null,"Do you want to continue ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
            input2=input2.toLowerCase () ;
            confirm=input2.charAt (0) ;
        } 
        
        System.out.println ("~~~~~~~~~~~~~~~~~~~") ;
        System.out.println ("The largest number among the numbers entered is \""+max+"\"") ;
        System.out.println ("~~~~~~~~~~") ;
        System.out.println ("The smallest number among the numbers entered is \""+min+"\"") ;
        System.out.println ("~~~~~~~~~~") ;
        System.out.println ("The sum of the numbers entered is \""+total+"\"") ;
        System.out.println ("~~~~~~~~~~~~~~~~~~~") ;
    }
}


