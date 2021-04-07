/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author rayan1
 */
    public class NewClass {
    public static void main(String[] args) {
    
    double farenheit;
    double celsius;
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Please enter a degree in farenheit: ");
    farenheit = input.nextDouble();
    
    celsius = (5.0 / 9) * (farenheit - 32);
    
    System.out.println("Degree in " + farenheit + "farenheit is equal to" + celsius + "celsius");
    }
    
    
}
