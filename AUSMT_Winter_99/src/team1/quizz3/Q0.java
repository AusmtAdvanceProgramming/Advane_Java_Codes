/*
Haniyeh Hadiyan _Hossein Rahi
 */
package team1.quizz3;

import javax.swing.JOptionPane ;

public class Q0 {
 
    public static void main (String[] args) {
        
        char confirm='y' ;
        double number=0 ;
        double max=0 ;
        double min=0 ;
        double total=0 ;
        int i=1 ;
        //...
        while (confirm=='y') {
            String input1=JOptionPane.showInputDialog (null,"adade khod ra vared konid :","adade vorodi",JOptionPane.QUESTION_MESSAGE) ;
            number=Double.parseDouble (input1) ;
            
            if (i!=0) {
                i=0 ;
                max=number ;
                min=number ;
            } 
            total+=number ;
            
            //------------------------------------------------------
 
            if (number>=max) {
                max=number ;
            } 
            
            //------------------------------------------------------
            
            if (number<=min) {
                min=number ;
            } 
            
            //------------------------------------------------------
            
            String input2=JOptionPane.showInputDialog (null,"Do you want to continue ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
            input2=input2.toLowerCase () ;
            confirm=input2.charAt (0) ;
        } // end of first while
        //...
        
        System.out.println ("The largest number among the numbers entered is \""+max+"\"") ;
        
        System.out.println ("The smallest number among the numbers entered is \""+min+"\"") ;
        
        System.out.println ("The sum of the numbers entered is \""+total+"\"") ;
        
    } 
} 
           
        

 
   

    
    

