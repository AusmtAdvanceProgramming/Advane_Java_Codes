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
public class Q1 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[100];
        double number;
        int index = 0;
        
        System.out.println("Enter bunch of numbers(0 to stop):");
        do {
            number = input.nextDouble();
            if (number != 0) {
                numbers[index] = number;
            }
            index++;
        } while (number != 0);
        System.out.println(max(numbers));
        System.out.println(min(numbers));
        System.out.println(sum(numbers));
//        for (int j = 0; j < numbers.length; j++) {
//            System.out.println(numbers[j]);
//            
//        }
    } //end of main
    
    public static double max(double [] array) {
        double max = array[0];
        
        for (int i = 0; i <array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    } //end of max
    
    public static double min(double [] array) {
        double min = array[0];
        
        for (int i = 0; i <array.length; i++){
            if (array[i] < min && array[i] > 0) { //shart 0 barraye bartaraf kardan bug
                min = array[i];
            }
        }
        return min;
    } //end of min

    public static double sum(double [] array) {
        double sum = 0;
        
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        return sum;
    }//end of sum
    
}// end of class