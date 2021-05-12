/*
 * Workshop4_1.java
 */
package team4 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import javax.swing.JOptionPane ;
//***
public class Workshop4_1 {
    public static void main (String[] args) {
        String input=JOptionPane.showInputDialog ("Enter the array size please :") ;
        int arraySize=Integer.parseInt (input) ;
        int[] myList=new int[arraySize] ;
        //***
        for (int i=0;i<myList.length;i++) {
            myList[i]=(int) (Math.random ()*100) ;
        } // end of first for
        //***
        System.out.println ("____________________") ;
        System.out.print (myList[0]) ;
        for (int j=1;j<myList.length;j++) {
            System.out.print (" , "+myList[j]) ;
        } // end of second for
        System.out.println ("\n____________________") ;
    } // end of main () method
} // end of Workshop4_1 class