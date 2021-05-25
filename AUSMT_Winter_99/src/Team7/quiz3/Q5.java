/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.quiz3;


import static java.util.Arrays.binarySearch;
import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Q5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] arr = makeArray();
        System.out.println("A array of 100 intgers has been genrated.");
        
        sortArray(arr);
        
        System.out.println("Enter a number for search in this array: ");
        int number = input.nextInt();
        
        int last = arr.length - 1;
        binarySearch(arr, 0, last, number);
        
    } //end main
    
    public static int[] makeArray() {      
        int length = 100;
        int[] arr = new int[length];
        int number;
        
        for (int i = 0; i < length; i++) {
            number = (int) ( Math.random() * 100 );
            arr[i] = number;
        }
        
        return arr;
    }
    
    public static int[] sortArray(int[] arr) {
           
        for (int i = 0; i < arr.length; i++) {  
            for (int j = i + 1; j < arr.length; j++) {  
                int tmp = 0;  
                if (arr[i] > arr[j]) {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
         
        }  
        return arr;
    }// end of sort array
}