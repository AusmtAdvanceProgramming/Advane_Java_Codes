
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class tamrin1 {
    public static void main (String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog("Please enter the array size :");
                
        arraySize = Integer.parseInt(size);
        
        int[] myList = new int[arraySize];
        
        for(int i= 0 ; i<myList.length; i++)
            
            myList[i] = (int)(Math.random() * 100);
        
    } 
}

