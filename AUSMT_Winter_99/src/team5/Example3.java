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
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        double farenhite;
        double celsius;
        
        System.out.print("Please enter a degree in faranhite:");
        farenhite=input.nextDouble();
        
        celsius=(5.0/9)*(farenhite-32);
        
        System.out.print("Degree in"+farenhite+"farenhite is equal to "+celsius+"celsius");
      
        
    }
    
}
