
package team6.quiz3 ;
/**
 * @author Mahdi
 * 
 */
import javax.swing.JOptionPane ;

public class Q3_2 {
    public static char[] charArray (String string) {
        char[] array2=new char[string.length ()] ;
        int i=0 ;

        for (i=0;i<array2.length;i++) {
            array2[i]=string.charAt (i) ;
        } 

        return array2 ;
    } 
    public static char[] Shift_Right (char[] array3,int number2) {
        char hold1 ;
        int move=0 ;
        int j=0 ;
        
        for (j=0;j<number2;j++) {
            hold1=array3[array3.length-1] ;
            
            for (move=array3.length-2;move>-1;move--) {
                array3[move+1]=array3[move] ;
            } 
            
            array3[0]=hold1 ;
        } 
        
        return array3 ;
    } 
    public static char[] Shift_Left (char[] array4,int number3) {
        char hold2 ;
        int move=0 ;
        int k=0 ;
        
        for (k=0;k<number3;k++) {
            hold2=array4[0] ;
            
            for (move=1;move<array4.length;move++) {
                array4[move-1]=array4[move] ;
            } 
            
            array4[array4.length-1]=hold2 ;
        } 
        
        return array4 ;
    } 
    public static void main (String[] args) {
        String input1=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE) ;
        String input2=JOptionPane.showInputDialog (null,"In which direction do you want to create shift ?","Letter input",JOptionPane.QUESTION_MESSAGE) ;
        String input3=JOptionPane.showInputDialog (null,"How many shifts do you want to do ?","Number input",JOptionPane.QUESTION_MESSAGE) ;
        input1=input1.toLowerCase () ;
        input2=input2.toLowerCase () ;
        
        char[] array1=new char[input1.length ()] ;
        char[] output=new char[input1.length ()] ;
        char direction ;
        int number1=0 ;
        int l=1 ;
        int m=1 ;
        
        array1=charArray (input1) ;
        direction=input2.charAt (0) ;
        number1=Integer.parseInt (input3) ;
        
        if (direction=='r') {
            output=Shift_Right (array1,number1) ;
           
           System.out.println () ;
           System.out.println ("The original array :") ;
           System.out.println () ;       
           System.out.print ("[ ") ;
                   
           for (l=0;l<input1.length ();l++) {
               System.out.print (input1.charAt (l) + " ") ;        
           }
           
           System.out.print ("]\n") ;
           System.out.println () ;
           System.out.println ("The shifted array :") ;
           System.out.println () ;
           System.out.print ("[ ") ;        
           
           for (m=0;m<output.length;m++) {
               System.out.print (output[m] + " " ) ;
           } 
           
           System.out.print ("]\n") ;
           System.out.println () ;
        } 
        
        else if (direction=='l') {
            output=Shift_Left (array1,number1) ;
           
           System.out.println () ;
           System.out.println ("The original array :") ;
           System.out.println ("__________") ;       
           System.out.print ("[ ") ;
                   
           for (l=0;l<input1.length ();l++) {
               System.out.print (input1.charAt (l) + " ") ;        
           } // end of sixth for
           
           System.out.print ("]\n") ;
           System.out.println () ;
           System.out.println ("The shifted array :") ;
           System.out.println () ;
           System.out.print ("[ ") ;        
           
           for (m=0;m<output.length;m++) {
               System.out.print (output[m] + " ") ;
           } 
           
           System.out.print ("]\n") ;
           System.out.println () ;
        } 
        
        else {
            System.out.println () ;
            System.out.println ("The entered direction is not valid") ;
            System.out.println () ;
        } 
    } 
} 