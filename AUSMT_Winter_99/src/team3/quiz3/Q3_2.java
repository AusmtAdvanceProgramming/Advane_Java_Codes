/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author amirali ghaumi
 * @author naser riasi
 * team3 
 * 
 * 
 */
public class Q3_2 {

    /**
     * @param args the command line arguments
     */
        public static void main (String[] args) {
            
        String input1=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE);
        String input2=JOptionPane.showInputDialog (null,"In which side do you want to create shift right or left ?","Letter input",JOptionPane.QUESTION_MESSAGE);
        String input3=JOptionPane.showInputDialog (null,"How many shifts do you want to do ?","Number input",JOptionPane.QUESTION_MESSAGE);
        
        input1=input1.toLowerCase();
        input2=input2.toLowerCase();
        //...
        char[] array1 = new char[input1.length()];
        char[] output = new char[input1.length()];
        char side;
        
        int number1 = 0;
       
        array1 = String_Chop(input1);
        side = input2.charAt(0);
        number1 = Integer.parseInt(input3);
        
        if (side=='r') {
            output = Shift_Right(array1,number1);
         
           System.out.println ("****************************");
           
           System.out.println ("The original array :");
           
           System.out.println ("****************************"); 
           
           System.out.print ("[ "+input1.charAt (0));
                  
           for ( int l = 1;l < input1.length(); l++) {
               System.out.print (" , " + input1.charAt(l));        
           } 
          
           System.out.print (" ]\n") ;
           
           System.out.println ("***************************") ;
           
           System.out.println ("The shifted array in " + number1 + " times");
           
           System.out.println ("*******************************") ;
           
           System.out.print ("[ "+output[0]) ;        
           
           for (int m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           } 
           
           System.out.print (" ]\n") ;
           System.out.println ("****************************") ;
        } 
        
        else if (side=='l') {
            output = Shift_Left (array1,number1) ;
           
           System.out.println ("********************************");
           
           System.out.println ("The original array :") ;
           System.out.println ("*******************************");
           
           System.out.print ("[ "+input1.charAt (0)) ;
                   
           for (int l=1;l<input1.length ();l++) {
               System.out.print (" , "+input1.charAt (l)) ;        
           }
          
           System.out.print (" ]\n") ;
           System.out.println ("******************************");
           
           System.out.println ("The shifted array in " + number1 + " times");
           
           System.out.println ("********************************");
           
           System.out.print ("[ "+output[0]) ;        
           
           for (int m=1;m<output.length;m++) {
               System.out.print (" , "+output[m]) ;
           } 
           
           System.out.print (" ]\n") ;
           System.out.println ("******************************");
        } 
        
        else {
            System.out.println ("*************************************");
            
            System.out.println ("The entered direction is not valid");
            
            System.out.println ("**************************************");
        } 
    } // end of main () method
        
      public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int i=0 ;
        
        for (i=0; i<array2.length; i++) {
            array2[i] = string.charAt(i) ;
        } 
        
        return array2;
        
    } // end of String_Chop () method
    public static char[] Shift_Right(char[] array3,int number2) {
        char backup1 ;
        int move1 = 0 ;
        
       
        for (int j=0 ;j < number2; j++) {
            backup1=array3[array3.length-1] ;
           
            for (move1 = array3.length-2; move1 >-1 ; move1--) {
                array3[move1+1]=array3[move1] ;
            } 
            
            array3[0]=backup1 ;
        } 
       
        return array3 ;
    } // end of Shift_Right () method
    
    public static char[] Shift_Left(char[] array4,int number3) {
        char backup2 ;
        int move2=0 ;
        
        
        for (int k = 0 ;k < number3; k++) {
            backup2=array4[0] ;
            
            for (move2 = 1; move2 < array4.length; move2++) {
                array4[move2-1] = array4[move2] ;
            } 
            
            array4[array4.length-1]= backup2 ;
        } 
        
        return array4 ;
    } // end of Shift_Left () method

} 
