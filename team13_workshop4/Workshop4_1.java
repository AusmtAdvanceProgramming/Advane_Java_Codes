/*
 * Workshop4_1
 */
package workshop4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author matrix
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
    for (int i = 0; i < arraySize; i++){
        
        System.out.println(myList[i]);
    }
    
    }
    
}
