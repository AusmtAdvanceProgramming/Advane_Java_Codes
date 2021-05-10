/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4_1;
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class Workshop4_1 {
    public static void main(String[] args) {
        
        int arraySize;
        
        String Size=JOptionPane.showInputDialog("Please enter a array size:");
        
        arraySize=Integer.parseInt(Size);
        int[] myList=new int[arraySize];
        
        for(int i=0;i<myList.length;i++){
            myList[i]=(int)(Math.random()*100);
        }
    }
    
}
