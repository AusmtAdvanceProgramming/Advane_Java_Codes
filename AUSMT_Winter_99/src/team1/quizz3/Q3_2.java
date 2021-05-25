/*
  Haniyeh Hadiyaqn _ Hossein Rahi

 */
package team1.quizz3;

import javax.swing.JOptionPane ;

public class Q3_2 {
    
     public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int i=0 ;
        //...
        for (i=0;i<array2.length;i++) {
            array2[i]=string.charAt (i) ;
        } // end of first for
        //...
        return array2 ;
    } // end of String_Chop () method
     
     //----------------------------------------------------------------
     
    public static char[] Shift_Right (char[] reshte_vorodi3,int tedade_harkat2) {
        
        char khane_akhar ;
        int move1=0 ;
        int j=0 ;
        
        for (j=0; j<tedade_harkat2; j++) {
            khane_akhar=reshte_vorodi3[reshte_vorodi3.length-1] ;
            
            for (move1=reshte_vorodi3.length-2; move1>-1; move1--) {
                reshte_vorodi3[move1+1]=reshte_vorodi3[move1] ;
            } 
            
            reshte_vorodi3[0]=khane_akhar ;
        }
        
        return reshte_vorodi3 ;
    } 
    
    //-------------------------------------------------------------
    
    public static char[] Shift_Left (char[] reshte_vorodi4,int number3) {
        char backup2 ;
        int move2=0 ;
        int k=0 ;
        //...
        for (k=0;k<number3;k++) {
            backup2=reshte_vorodi4[0] ;
            //...
            for (move2=1;move2<reshte_vorodi4.length;move2++) {
                reshte_vorodi4[move2-1]=reshte_vorodi4[move2] ;
            } 
            
            reshte_vorodi4[reshte_vorodi4.length-1]=backup2 ;
        } 
        
        return reshte_vorodi4 ;
        
    //--------------------------------------------------------------
    } 
    public static void main (String[] args) {
        String reshte_vorodi=JOptionPane.showInputDialog (null,"reshte khod ra vared konid :","vorod reshte ",JOptionPane.QUESTION_MESSAGE) ;
        String jahate_harkat=JOptionPane.showInputDialog (null,"mikhahid be kodam samt harkat knad?","jahate harkat",JOptionPane.QUESTION_MESSAGE) ;
        String input3=JOptionPane.showInputDialog (null,"mikhahid che tedad harkat konad?","tedade harkat",JOptionPane.QUESTION_MESSAGE) ;
        reshte_vorodi=reshte_vorodi.toLowerCase () ;
        jahate_harkat=jahate_harkat.toLowerCase () ;
        
        char[] array1=new char[reshte_vorodi.length ()] ;
        char[] output=new char[reshte_vorodi.length ()] ;
        char harfe_aval ;
        int tedade_harkat=0 ;
        int l=1 ;
        int m=1 ;
        //...
        array1=String_Chop (reshte_vorodi) ;
        harfe_aval=jahate_harkat.charAt (0) ;
        tedade_harkat=Integer.parseInt (input3) ;
        
        if (harfe_aval=='r') {
            
            output=Shift_Right (array1,tedade_harkat) ;
           
           System.out.println ("reshte vorodi :") ;
           
           System.out.print (+reshte_vorodi.charAt (0)) ;
                 
           for (l=1;l<reshte_vorodi.length ();l++) {
               System.out.print (" , "+reshte_vorodi.charAt (l)) ;        
           } 
           
           
           System.out.println ("reshte harkat karde :") ;
           System.out.print (" "+output[0]) ;        
           
           for (m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           } 
       
        } 
   //-----------------------------------------------------------
        else if (harfe_aval=='l') {
            output=Shift_Left (array1,tedade_harkat) ;
          
          
           System.out.println ("reshte vorodi :") ;
             
           System.out.print ("[ "+reshte_vorodi.charAt (0)) ;
           //...        
           for (l=1;l<reshte_vorodi.length ();l++) {
               System.out.print (" , "+reshte_vorodi.charAt (l)) ;        
           } 
           
          
           System.out.println ("__________") ;
           System.out.println ("reshte harkat karde  :") ;
           
           System.out.print ("[ "+output[0]) ;        
           
           for (m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           }
           
           System.out.print (" \n") ;
           
        }
        
        else {
           
            System.out.println ("in harf vojod nadarad") ;
            
        } 
    } 
} //The end
    

