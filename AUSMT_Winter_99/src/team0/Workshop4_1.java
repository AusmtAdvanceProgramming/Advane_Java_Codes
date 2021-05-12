
package team0;

import javax.swing.JOptionPane;

public class Workshop4_1 {


    
    public static void main(String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog ("Please enter a array size: ");
        arraySize = Integer.parseInt(size);
        int[] myList = new int [arraySize];
        for (int i = 0 ; i < myList.length; i++){
            myList[i] = (int) (Math.random() * 100);
        }
    }
}
