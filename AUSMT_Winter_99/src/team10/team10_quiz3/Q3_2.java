// Q3_2.java
package team10.quiz3 ;
// Sina gholizadeh and amir rasuli
import javax.swing.JOptionPane ;

public class Q3_2 {
    public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int i=0 ;
        
        for (i=0;i<array2.length;i++) {
            array2[i]=string.charAt (i) ;
        } 
       
        return array2 ;
    } 
    char[] array3,int number2) {
        char backup1 ;
        int move1=0 ;
        int j=0 ;
        
        for (j=0;j<number2;j++) {
            backup1=array3[array3.length-1] ;
            
            for (move1=array3.length-2;move1>-1;move1--) {
                array3[move1+1]=array3[move1] ;
            } 
           
            array3[0]=backup1 ;
        } 
        
            return array3 ;
    } 
    public static char[] Shift_Left (char[] array4,int number3) {
        char backup2 ;
        int move2=0 ;
        int k=0 ;
        
        for (k=0;k<number3;k++) {
            backup2=array4[0] ;
            
            for (move2=1;move2<array4.length;move2++) {
                array4[move2-1]=array4[move2] ;
            } 
            
            array4[array4.length-1]=backup2 ;
        }
        
        return array4 ;
    } 
    public static void main (String[] args) {
        String input1=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE) ;
        String input2=JOptionPane.showInputDialog (null,"In which direction do you want to create shift ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
        String input3=JOptionPane.showInputDialog (null,"How many shifts do you want to do ?!","Number input",JOptionPane.QUESTION_MESSAGE) ;
        input1=input1.toLowerCase () ;
        input2=input2.toLowerCase () ;
        
        char[] array1=new char[input1.length ()] ;
        char[] output=new char[input1.length ()] ;
        char direction ;
        int number1=0 ;
        int l=1 ;
        int m=1 ;
        
        array1=String_Chop (input1) ;
        direction=input2.charAt (0) ;
        number1=Integer.parseInt (input3) ;
        
        if (direction=='r') {
            output=Shift_Right (array1,number1) ;
           
           System.out.println ("____________________") ;
           System.out.println ("The original array :") ;
           System.out.println ("__________") ;       
           System.out.print ("[ "+input1.charAt (0)) ;
                   
           for (l=1;l<input1.length ();l++) {
               System.out.print (" , "+input1.charAt (l)) ;        
           }   
           
           System.out.print (" ]\n") ;
           System.out.println ("__________") ;
           System.out.println ("The shifted array with \""+number1+"\" shift :") ;
           System.out.println ("__________") ;
           System.out.print ("[ "+output[0]) ;        
           
           for (m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           }     
           
           System.out.print (" ]\n") ;
           System.out.println ("____________________") ;
        }     
        
        else if (direction=='l') {
            output=Shift_Left (array1,number1) ;
           
           System.out.println ("____________________") ;
           System.out.println ("The original array :") ;
           System.out.println ("__________") ;       
           System.out.print ("[ "+input1.charAt (0)) ;
                   
           for (l=1;l<input1.length ();l++) {
               System.out.print (" , "+input1.charAt (l)) ;        
           }   
           
           System.out.print (" ]\n") ;
           System.out.println ("__________") ;
           System.out.println ("The shifted array with \""+number1+"\" shift :") ;
           System.out.println ("__________") ;
           System.out.print ("[ "+output[0]) ;        
          
           for (m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           } 
           
           System.out.print (" ]\n") ;
           System.out.println ("____________________") ;
        } 
        
        else {
            System.out.println ("____________________") ;
            System.out.println ("The entered direction is not valid") ;
            System.out.println ("____________________") ;
        } 
    } 
} 