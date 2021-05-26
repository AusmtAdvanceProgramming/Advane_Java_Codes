/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.quiz3;
/**
*/
import javax.swing.JOptionPane ;


public class Q0 {
    public static void main (String[] args) {
        char confirm='y' ;
        double number=0 ;
        double maximum=0 ;
        double minimum=0 ;
        double total=0 ;
        int i=1 ;
       
        
        while (confirm=='y') {
            String input1=JOptionPane.showInputDialog (null,"Enter your desired number please :","Number input",JOptionPane.QUESTION_MESSAGE) ;
            number=Double.parseDouble (input1) ;
          
            
            if (i!=0) {
                i=0 ;
                maximum=number ;
                minimum=number ;
            }
            
            total+=number ;
            if (number>=maximum) {
                maximum=number ;
            } 
            if (number<=minimum) {
                minimum=number ;
            } 
           
            
            String input2=JOptionPane.showInputDialog (null,"Do you want to continue ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
            input2=input2.toLowerCase () ;
            confirm=input2.charAt (0) ;
        }
        
        
        System.out.println ("____________________") ;
        System.out.println ("The largest number among the numbers entered is \""+maximum+"\"") ;
        System.out.println ("__________") ;
        System.out.println ("The smallest number among the numbers entered is \""+minimum+"\"") ;
        System.out.println ("__________") ;
        System.out.println ("The sum of the numbers entered is \""+total+"\"") ;
        System.out.println ("____________________") ;
    } 
}