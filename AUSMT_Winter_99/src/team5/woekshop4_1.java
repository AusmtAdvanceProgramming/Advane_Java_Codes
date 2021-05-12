/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;

import javax.swing.JOptionPane;

/**
 *
 * @author mohammdreza&ashkanrasuli
 */
public class woekshop4_1 {
    



    
    public static void main(String[] args) {
        
      /*  int arraySize;
        
        String size = JOptionPane.showInputDialog ("Please enter a array size: ");
        arraySize = Integer.parseInt(size);
        
        int[] myList = new int [arraySize];
        
        for (int i = 0 ; i < myList.length; i++){
            myList[i] = (int) (Math.random() * 100);
        }//end of for
    }//end of main method
*/
     int arraySize;
     String size=JOptionPane.showInputDialog("PLese enter a array size");
     arraySize=Integer.parseInt(size);
     int [] myList=new int[arraySize];
     for(int i =0;i<myList.length;i++){
      
        myList[i] = (int)(Math.random()*100);
    }//end of for
    } // end of main
      
      
    
      
}//end of class
