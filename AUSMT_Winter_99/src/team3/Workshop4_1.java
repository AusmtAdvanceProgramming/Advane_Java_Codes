/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;
import javax.swing.JOptionPane;
/**
 *
 * @amiraliGhaumi
 * @naserRiazi
 * team3
 */
public class Workshop4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog("Please enter an array size:");
        
        arraySize = Integer.parseInt(size);
        
        int[] myList = new int[arraySize];
        
        for(int i = 0; i < myList.length; i++){
            myList[i] = (int)(Math.random() * 100);
            
        }
        
        for(int j = 0; j <myList.length; j++ ){
            System.out.println(myList[j]);
            
    }
    
  }
}