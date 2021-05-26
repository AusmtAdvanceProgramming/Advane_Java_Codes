
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;

import java.util.Scanner;

/**
 *
 * @amiraliGhaumi
 * @naserRiazi
 * team3
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arraySize = 100;
        int[] array = new int[arraySize];
        int key, result,hold;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < arraySize; i++){
            array[i] = (int)(Math.random() * 100);
        }//giving value to array elements
        
        for (int pass = 0; pass < arraySize -1; pass++)
            
            for(int i = 0; i < arraySize -1;i++)
                
                if(array[i] > array[i + 1]){
                    hold = array[i];
                    array[i] = array[i+1];
                    array[i+1] = hold;
                }//for orgenizing the array elements for binary search
        
        
        System.out.println("************************************************");
        
        System.out.println("Enter your number for the binary search:");
        key = input.nextInt();
        
        result = binarySearch(array, key, 0, arraySize - 1);
        
        if (result != -1){
            System.out.println(key + " was found in index " + result);
        }
        else
            System.out.println(key + " was not found in this array");
        
             System.out.println ("The designed array :") ;
             
        System.out.println ("*******************************") ;
        
        for (int m=0;m<array.length;m++) {
            if (m%10==0) {
                System.out.println () ;
            } 
                      
            System.out.print(array[m]+"\t") ;
              
    }
        System.out.println("\n*****************************************");
        
        System.out.println("End of programm");
 }
    
    public static int binarySearch(int[] array, int searchKey,int low,int high){
        int middle;
        
        while(low <= high){
            middle =(low + high) / 2;
            
            if(searchKey == array[middle])
                return middle;
            
            else if (searchKey < array[middle])
                high = middle - 1;
            
            else  
                low = middle + 1; 
        }
        return -1;
    }
    
}
