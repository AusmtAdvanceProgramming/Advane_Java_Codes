/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;
import javax.swing.JOptionPane;
/**
 *
 * @amiraliGhaumi
 * @naserRiazi
 * team3
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        int number ;
        int random ;
        int i=1 ;
        
        String input=JOptionPane.showInputDialog (null,"Enter the desired number of characters please :","Number input",JOptionPane.QUESTION_MESSAGE) ;
        number=Integer.parseInt (input) ;
        
        System.out.println("***************************");
        System.out.print ("Your string is : ") ;
       
        for (i=1;i<=number;i++) {
            random=(int) (Math.random ()*3) ;
            
            switch (random) {
                case 0 :
                    System.out.print((int)(Math.random () * 10)) ;
                    break ;
                case 1 :
                    System.out.print((char)('a'+Math.random ()*('z'-'a'+1))) ;
                    break ;
                case 2 :
                    System.out.print((char)('A'+Math.random ()*('Z'-'A'+1))) ;
                    break ;
                } 
            
        } 
        
        System.out.println ("\n************************") ;
    } 
} 