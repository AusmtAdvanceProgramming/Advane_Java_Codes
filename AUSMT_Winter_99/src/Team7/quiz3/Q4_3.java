/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.quiz3;

/**
 *
 * @author team7
 */
public class Q4_3 {
    
    public static void main(String[] args) {
        
        int[] arr = makeArray();
        System.out.println("An array of 100 intgers has been genrated.");
        
        int average = average(arr);
        
        System.out.println("average is " + average);
        
        aboveAverage(arr, average);
        
        
    } //end of main
    
    
     public static int[] makeArray() {      
        int length = 100;
        int[] arr = new int[length];
        int number;
        
        for (int i = 0; i < length; i++) {
            number = (int) ( Math.random() * 100 );
            arr[i] = number;
        }
        
        return arr;
    } //end of makearray
     
     public static int average(int[] arr) {
         int average = 0;
         int sum = 0 ;
         
         for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
         }
         
         average = sum / arr.length;
         
         return average;
     } //end of average
     
     public static void aboveAverage(int[] arr, int average) {
      
         int index = 0;
         int [] aboveAverageArr = new int[100];
         
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > average) {
                 aboveAverageArr[index] = arr[i];
                 index++;
             }
         }
         System.out.println("these numbers are above average: ");
         for (int i = 0; i < index; i++) {
             System.out.println(aboveAverageArr[i]);
         }
     } //end of aboveAverage
     
}
