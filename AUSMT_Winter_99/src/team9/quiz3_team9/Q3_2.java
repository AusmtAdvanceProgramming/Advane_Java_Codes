/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_team9;
/**
 * @author Aliasghar ranjbar
 * @author zeynab karimizad
 */
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
    public static char[] Shift_Right (char[] array3,int number2) {
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
        String input2=JOptionPane.showInputDialog (null,"In which direction do you want to create shift ?","Letter input",JOptionPane.QUESTION_MESSAGE) ;
        String input3=JOptionPane.showInputDialog (null,"How many shifts do you want to do ?","Number input",JOptionPane.QUESTION_MESSAGE) ;
        input1=input1.toLowerCase () ;
        input2=input2.toLowerCase () ;
       
        char[] array1=new char[input1.length ()] ;
        char[] output=new char[input1.length ()] ;
        char direction ;
        int number1=0 ;
        int x=1 ;
        int y=1 ;
        
        array1=String_Chop (input1) ;
        direction=input2.charAt (0) ;
        number1=Integer.parseInt (input3) ;
        
        if (direction=='r') {
            output=Shift_Right (array1,number1) ;
           
           System.out.println ("The original array :") ;       
           System.out.print ("[ "+input1.charAt (0)) ;
               
           for (x=1;x<input1.length ();x++) {
               System.out.print (" , "+input1.charAt (x)) ;        
           }
           System.out.print (" ]\n") ;
           System.out.println ("~~~~~~~~~~~~~~~") ;
           System.out.println ("The shifted array :") ;
           
           System.out.print ("[ "+output[0]) ;        
           
           for (y=1;y<output.length;y++) {
               System.out.print (" , "+output[y]) ;
           } 
           System.out.print (" ]\n") ;
           System.out.print ("\n") ;
        }
        else if (direction=='l') {
            output=Shift_Left (array1,number1) ;
           System.out.println ("The original array :") ;     
           System.out.print ("[ "+input1.charAt (0)) ;
           
           for (x=1;x<input1.length ();x++) {
               System.out.print (" , "+input1.charAt (x)) ;        
           }
           System.out.print (" ]\n") ;
           System.out.println ("~~~~~~~~~~~~~~~") ;
           System.out.println ("The shifted array :") ;
           System.out.print ("[ "+output[0]) ;        
           
           for (y=1;y<output.length;y++) {
               System.out.print (" , "+output[y]) ;
           } 
           System.out.print (" ]\n") ;
           System.out.print ("\n") ;
        } 
        else {
            System.out.println ("~~~~~~~~~~~~~~~") ;
            System.out.println ("The entered direction is not valid") ;
            System.out.print ("\n") ;
        } 
    } 
} 