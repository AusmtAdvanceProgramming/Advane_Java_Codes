/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.quiz3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Q4_1 {
    
    public static void main(String[] args) {
        
        int ArraySize;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of your array: ");        
        ArraySize = input.nextInt();
                
        int [] myArray = new int[ArraySize];
        System.out.println("Enter the value of each one: ");
        
        for (int j = 0; j < ArraySize; j++){
            myArray[j] = input.nextInt();
        }
       
        System.out.println("Your array before random is: " + Arrays.toString(myArray));
        
        
        for (int i = 0; i < myArray.length; i++){
            int index = (int)(Math.random() * myArray.length);
            
            int temporary  = myArray[i];
            myArray[i] = myArray[index];
            myArray[index] = temporary ;            
        }
        
    System.out.println("Your array after random is: " + Arrays.toString(myArray));
        
    }
}
