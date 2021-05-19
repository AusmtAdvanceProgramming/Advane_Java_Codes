/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.quiz3;

import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Q4_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int amountOfShift = 0;
        int jahatShift = 0;
        
        System.out.println("enter the amount of shift: ");
        amountOfShift = input.nextInt();
        
        System.out.println("Enter the direction of shift(1 for right 2 for left):");
        jahatShift = input.nextInt();
        
        int[] arr = makeArray();
        
        System.out.println("array before shift is:");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        if (jahatShift == 1) {
            shiftToRight(arr, amountOfShift);
        } else if (jahatShift == 2 ) {
            shiftToLeft(arr, amountOfShift);
        }
    } //end of main
    
        public static int[] makeArray() {      
        int length = 10;
        int[] arr = new int[length];
        int number;
        
        for (int i = 0; i < length; i++) {
            number = (int) ( Math.random() * 100 );
            arr[i] = number;
        }
        
        return arr;
    } //end of makearray

    public static void shiftToRight(int[] arr, int amountOfShift) {
        
               for(int i = 0; i < amountOfShift; i++){    
                    int j, last;    
                    //Stores the last element of array    
                    last = arr[arr.length-1];    

                    for( j = arr.length - 1; j > 0; j--){    
                        //Shift element of array by one    
                        arr[j] = arr[ j - 1];    
                    }    
                    //Last element of array will be added to the start of array.    
                    arr[0] = last;    
                }
               System.out.println("\n array after " + amountOfShift + " shift to raight is : ");
               for (int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i] + " ");
               }
    }//end of shift to right
    
        public static void shiftToLeft(int[] arr, int amountOfShift) {
        
               for(int i = 0; i < amountOfShift; i++){  
                    int j, first;  
                    //Stores the first element of the array  
                    first = arr[0];  
                    for(j = 0; j < arr.length-1; j++){  
                        //Shift element of array by one  
                        arr[j] = arr[j+1];  
                    }  
                    //First element of array will be added to the end  
                    arr[j] = first;  
                }  
               
               System.out.println("\n array after " + amountOfShift + " shift to left is : ");
               for (int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i] + " ");
               }
    }//end of shift to Left
    
}//end of class
