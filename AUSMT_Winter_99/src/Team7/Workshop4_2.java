/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7;

import javax.swing.JOptionPane;

/**
 *
 * @author Team7
 */
public class Workshop4_2 {
    
    public static void main(String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog(null, 
                "Please enter number of names:",
                "Specifying List Size",
                JOptionPane.QUESTION_MESSAGE);
        
        arraySize = Integer.parseInt(size);
        
        String[] myList = new String[arraySize];
        
        for(int i = 0; i < myList.length; i++){
            
            myList[i] = JOptionPane.showInputDialog(null, 
                    String.format("Please enter the name #%d:", i), 
                    "#" + i);
            
        }
    
        for(int i = 0; i < myList.length; i++){
            
            System.out.println(myList[i]);
            
        }
    }
    
}
