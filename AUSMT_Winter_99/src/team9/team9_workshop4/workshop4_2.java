/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9_workshop4;

/**
 *
 * @author searchland
 */
 import javax.swing.JOptionPane ;

public class workshop4_2 {
   
    
    public static void main(String[] args) {
    int arraySize;
    String size = JOptionPane.showInputDialog(null, 
            "Please enter number of names:",
            "Specifying List Size", 
            JOptionPane.QUESTION_MESSAGE);

    arraySize = Integer.parseInt(size);

    String[] myList = new String [arraySize];

    for(int i = 0; i < myList.length; i++) {
       
        myList[i] = JOptionPane.showInputDialog(null, 
            String.format("Please enter the name #%d:",i),
            "#" + 1);
    }

    for(int i = 0; i < myList.length; i++){

        System.out.println (myList[i]);

        }
    }  
}