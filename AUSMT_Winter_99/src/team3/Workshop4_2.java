/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Workshop4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arraySize;
        
        String size = JOptionPane.showInputDialog(null,"Please enter number of names:",
                                                  "Specifying List size",
                                                  JOptionPane.QUESTION_MESSAGE);
        
        arraySize = Integer.parseInt(size);
        
        String[] myList =new String[arraySize];
        
        for (int i = 0; i < myList.length; i++){
            
            myList[i] = JOptionPane.showInputDialog(null,String.format("Please enter the name #%d:",i), "#" + i);
            
        }
        
        
        for(int j = 0; j < myList.length; j++ ){
            System.out.println(myList[j]);
        }
        
    }
    
}
