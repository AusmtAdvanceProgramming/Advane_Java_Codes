/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.quiz3;

/**
 */
import javax.swing.JOptionPane ;


public class Q3_1 {
    public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int i=0 ;
        
        
        for (i=0;i<array2.length;i++) {
            array2[i]=string.charAt (i) ;
        } 
        
        
        return array2 ;
    } 
    public static char[] Shuffle (char[] array4) {
        char backup ;
        int random1=0 ;
        int random2=0 ;
        int j=0 ;
       
        
        for (j=0;j<array4.length;j++) {
            random1=(int) (Math.random ()*array4.length) ;
            random2=(int) (Math.random ()*array4.length) ;
            //...
            backup=array4[random1] ;
            array4[random1]=array4[random2] ;
            array4[random2]=backup ;
        } 
        
        
        return array4 ;
    } 
    public static void main (String[] args) {
        String input=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE) ;
        input=input.toLowerCase () ;
       
        
        char[] array1=new char[input.length ()] ;
        char[] array3=new char[input.length ()] ;
        int k=1 ;
        int l=1 ;
        
        
        array1=String_Chop (input) ;
        array3=Shuffle (array1) ;
       
        
        System.out.println ("____________________") ;
        System.out.println ("The original array :") ;
        System.out.println ("__________") ;
        System.out.print ("[ "+input.charAt (0)) ;
        
        
        for (k=1;k<input.length ();k++) {
            System.out.print (" , "+input.charAt (k)) ;
        } 
        
        
        System.out.print (" ]\n") ;
        System.out.println ("__________") ;
        System.out.println ("The shuffled array :") ;
        System.out.println ("__________") ;
        System.out.print ("[ "+array3[0]) ;
        
        
        for (l=1;l<array3.length;l++) {
            System.out.print (" , "+array3[l]) ;
        } 
        
        
        System.out.print (" ]\n") ;
        System.out.println ("____________________") ;
    } 
} 