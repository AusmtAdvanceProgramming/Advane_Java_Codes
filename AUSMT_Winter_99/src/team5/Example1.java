/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;

import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double average;
        
        System.out.print("Please enter first number:");
        number1 = input.nextDouble();
        
        System.out.print("Please enter second number:");
        number2 = input.nextDouble();
        
        System.out.print("Please enter third number:");
        number3 = input.nextDouble();
        
        average=(number1+number2+number3)/3;
        System.out.println("For these 3 ["+ number1+","+number2+","+number3+"] numbers the average are "+average);
    }
    
}
