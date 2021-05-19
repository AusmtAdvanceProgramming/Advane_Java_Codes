/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9_workshop4;

/**
 *
 * @author searchland
 */
import javax.swing.JOptionPane ;

public class workshop4_1 {
    
   

    public static void main(String[] args) {

       int arraySize;

       String size = JOptionPane.showInputDialog("Please enter the array size:");
       arraySize = Integer.parseInt (size);

       int[] myList = new int [arraySize];
 
       for (int i = 0; i < myList.length; i++) {

            myList[i] = (int) (Math.random() * 100);

        }
        for(int j = 0; j <myList.length; j++ ){
            System.out.println(myList[j]);
    }
    }
}