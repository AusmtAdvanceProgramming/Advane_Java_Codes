/*
 Haniyeh Hadiyan - Hossein Rahi
 */
package team1.workshp4;

import javax.swing.JOptionPane ;

public class workshop4_2 {
    
    public static void main (String[] args) {
        
        int arraySize;
        
        String size = JOptionPane.showInputDialog(null,
                "Please enter number",
                "Specifying List  Size",
                JOptionPane.QUESTION_MESSAGE);
        
        arraySize = Integer.parseInt(size);
        
        String[] myList = new String[arraySize];
        
        for(int i=0; i< myList.length; i++ ){
            
            myList[i] = JOptionPane.showInputDialog(null,
                    String.format("Please enter the name :%d",i),
                    "i" +i);
        }
        
        for(int i=0; i<myList.length; i++){
            
           System.out.println(myList[i]);
        }
                
    }
    
}//The end
