
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
public class tamrin2 {
    public static void main (String[] args) {
        
        int ary_size;
        
        String size = JOptionPane.showInputDialog(null,
                "Please enter number",
                "Specifying List  Size",
                JOptionPane.QUESTION_MESSAGE);
        
        ary_size = Integer.parseInt(size);
        
        String[] list = new String[ary_size];
        
        for(int i=0; i< list.length; i++ ){
            
            list[i] = JOptionPane.showInputDialog(null,
                    String.format("Please enter the name :%d",i),
                    "i" +i);
        }
        
        for(int i=0; i<list.length; i++){
            
           System.out.println(list[i]);
        }      
    }
}

