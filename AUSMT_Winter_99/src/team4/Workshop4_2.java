/*
 * Workshop4_2.java
 */
package team4 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import javax.swing.JOptionPane ;
//***
public class Workshop4_2 {
    public static void main (String[] args) {
        String input=JOptionPane.showInputDialog (null /* parent of dialog box */ , "Enter the number of names please :" /* input message */ , "Specifying List Size" /* input title */ , JOptionPane.QUESTION_MESSAGE /* message type */) ;
        int arraySize=Integer.parseInt (input) ;
        String[] myList=new String[arraySize] ;
        //***
        for (int i=0;i<myList.length;i++) {
            myList[i]=JOptionPane.showInputDialog (null,String.format ("Enter the name please #%d :" , i) , "#"+i) ;
        } // end of first for
        //***
        System.out.println ("____________________") ;
        for (int j=0;j<myList.length;j++) {
            System.out.println ("#"+j+" "+myList[j]) ;
        } // end of second for
        System.out.println ("____________________") ;
    } // end of main () method
} // end of Workshop4_2 class