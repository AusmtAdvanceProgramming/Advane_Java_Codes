/*team17.Quiz3.Q3
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz3;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main (String[] args) {
        int length ;
        int rnd ;
        String input=JOptionPane.showInputDialog (null,"Please enter your desired string length :","Number input",JOptionPane.QUESTION_MESSAGE) ;
        length=Integer.parseInt (input) ;

        System.out.print ("Your accidently string is: ") ;

        for (int i=0 ;i<length; i++) {
            rnd=(int)(Math.random ()*3) ;

            switch (rnd) {
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

        }// end of 1st for() loop
        System.out.println("");
    }//end of main() method
}//end of Class