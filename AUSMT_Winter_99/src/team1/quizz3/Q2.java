/*
  Haniyeh Hadiyaqn _ Hossein Rahi

 */
package team1.quizz3;

import javax.swing.JOptionPane ;


public class Q2 {

    public static void main (String[] args) {
        int adad ;
        int random ;
        int i=1 ;
        
        String input=JOptionPane.showInputDialog (null,"lotfan tedad adad reshte ra vared konid :","vorodi adad",JOptionPane.QUESTION_MESSAGE) ;
        adad=Integer.parseInt (input) ;
        
        
        System.out.print ("reshte shoma : ") ;
        
        for (i=1; i<=adad; i++) {
            random=(int) (Math.random ()*3) ;
            
            switch (random) {
                case 0 :
                    System.out.print ((int) (Math.random ()*10)) ;
                    break ;
                case 1 :
                    System.out.print ((char) ('a'+Math.random ()*('z'-'a'+1))) ;
                    break ;
                case 2 :
                    System.out.print ((char) ('A'+Math.random ()*('Z'-'A'+1))) ;
                    break ;
                } 
        } 
    }
} //The end
    

