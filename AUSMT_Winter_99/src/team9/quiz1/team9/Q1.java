/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1.team9;

/**
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;
public class Q1 {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        
        double a, g, k, r, e, v, x, y;
        
        System.out.println("\tax+gy=k \n\trx+ey=v \nin zarayeb ra vared konid  a, g, k, r, e, v sefaresh: ");
        a = input.nextDouble();
        g = input.nextDouble();
        k = input.nextDouble();
        r = input.nextDouble();
        e = input.nextDouble();
        v = input.nextDouble();
        
        x = ((k * e) - (r * v)) / ((a * e) - (g * r));
        y = ((a * v) - (r * k)) / ((a * e) - (g * r));
        
        System.out.println("x = " + x + ", " + "y = " + y );
        
    }
}