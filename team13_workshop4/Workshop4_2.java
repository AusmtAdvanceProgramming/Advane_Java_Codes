/*
  
 *Workshop4_2 
 */
package workshop4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author matrix
 */
public class Workshop4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog(null, //parent of dialog box 
                "Please enter number of names:", // input message
                "Specifying List Size ",//input title
                JOptionPane.QUESTION_MESSAGE);//message type
        
        arraySize = Integer.parseInt(size);
        
        String[] myList = new String[arraySize];
        
        for(int i = 0; i < myList.length; i++){
            
            myList[i] = JOptionPane.showInputDialog(null, String.format("Please enter the name #%d:",i), "#" + i);
            
        }
        
        for (int i = 0; i < myList.length; i++){
            
            System.out.println(myList[i]);
        }
        
            
    
}
}

