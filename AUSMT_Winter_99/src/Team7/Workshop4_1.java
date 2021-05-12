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
public class Workshop4_1 {
    
    public static void main(String[] args) {
    
        int arraySize;

        String size = JOptionPane.showInputDialog("Please enter an array size: ");

        arraySize = Integer.parseInt(size);

        int[] myList = new int[arraySize];

        for(int i = 0; i < myList.length; i++){

                myList[i] = (int)(Math.random() * 100);
                
                System.out.println(myList[i]);

            }
    }
}
