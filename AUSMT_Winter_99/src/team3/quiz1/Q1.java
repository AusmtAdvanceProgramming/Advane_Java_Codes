/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz1;
import java.util.Scanner;
/**
 *team3
 * @amirali ghaumi 
 * naser riazi
 */
public class Q1 {

    /**
     * @amirali ghaumi
     * naser riazi
     */
public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        /*
            
            
        */
        double a, b, c, d, e, f, x, y;
        
        System.out.println("ax + by = e and cx + dy = f function \n "
                + "Please enter coefficients(zarayeb) \n in a, b, c, d, e, f order: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        // Cramer's Rule
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (d * c)) / ((a * e) - (b * d));
        
        System.out.println("x is " + x + " and y is "  + y );
        
    }
}