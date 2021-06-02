
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class quees2 {
    
public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        /*
            ax+by=c
            dx+ey=f
        */
        double a, b, c, d, e, f, x, y;
        
        System.out.println("\tax+by=c \n\tdx+ey=f \nzareb a b c d e f ra vared konid: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (d * c)) / ((a * e) - (b * d));
        
        System.out.println("x = " + x + "y = " + y );
        
    }
}
