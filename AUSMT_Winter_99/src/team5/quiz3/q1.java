/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quiz3;

import javax.swing.JOptionPane ;
/**
 *
 * @author mohammdreza
 */
public class q1 {
 
 public static void main(String[]args){
        char confirm='y' ;
        double number ;
         number = 0;
        double maximum=0 ;
        double minimum=0 ;
        double total=0 ;
        int i=1 ;
        //...
        while (confirm=='y') {
            String input1=JOptionPane.showInputDialog (null,"Enter your desired number please :","Number input",JOptionPane.QUESTION_MESSAGE) ;
            number=Double.parseDouble (input1) ;
            //...
            if (i!=0) {
                i=0 ;
                maximum=number ;
                minimum=number ;
            } // end of first if
            //...
            total+=number ;
            if (number>=maximum) {
                maximum=number ;
            } // end of second if
            if (number<=minimum) {
                minimum=number ;
            } // end of third if
            //...
            String input2=JOptionPane.showInputDialog (null,"Do you want to continue ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
            input2=input2.toLowerCase () ;
            confirm=input2.charAt (0) ;
        } // end of first while
        //...
        System.out.println ("The largest number among the numbers entered is \""+maximum+"\"") ;
        System.out.println ("__________") ;
        System.out.println ("The smallest number among the numbers entered is \""+minimum+"\"") ;
        System.out.println ("__________") ;
        System.out.println ("The sum of the numbers entered is \""+total+"\"") ;
        System.out.println ("____________________") ;
    } // end of main () method
} // end of Q0 class
    
    
    
    
    
