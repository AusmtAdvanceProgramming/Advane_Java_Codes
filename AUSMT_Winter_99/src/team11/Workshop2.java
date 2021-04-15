/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11;
import java.util.Scanner;
/**
 *
 * @author Parsley
 */
public class Workshop2 {
    
    public static void main(String[] args) {
        
        double x1, y1; //Point1 coordinates
        double x2, y2; //Point2 coordinates
        double x3, y3; //Point3 coordinates
        double a , b , c; //triangle's sides
        double A , B , C; //triangle's angles
        
        Scanner input = new Scanner(System.in);
        
        //Reciving coordiates of points
        System.out.println("Enter the first point's coordinates : ");
        System.out.print("x1 : ");
        x1 = input.nextDouble();
        System.out.print("y1 : ");
        y1 = input.nextDouble();
        
        System.out.println("Enter the second point's coordinates : ");
        System.out.print("x2 : ");
        x2 = input.nextDouble();
        System.out.print("y2 : ");
        y2 = input.nextDouble();
        
        System.out.println("Enter the third point's coordinates : ");
        System.out.print("x3 : ");
        x3 = input.nextDouble();
        System.out.print("y3 : ");
        y3 = input.nextDouble();
        
        //calculating sides
        
        a = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        c = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        //calculating angles
        
        A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / ( -2 * b * c )));
        B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / ( -2 * a * c )));
        C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / ( -2 * a * b )));
        
        //rounding the angles
        
        A = Math.round( A * 100) / 100.0;
        B = Math.round( B * 100) / 100.0;
        C = Math.round( C * 100) / 100.0;
        
        if (a == b && b == c && a == c  || A == B && B == C && A == C )
            System.out.println("The Triangle made within these points is parallelogram. "); 
        else if ( a == b && B == C || a == c && A == B || b == c && A == C)
            System.out.println("The Triangle made within these points is isosceles. ");
        else if ( A == 90 || B == 90 || C == 90)
            System.out.println("The Triangle made within these points is right-angled. ");
        else
            System.out.println("The Triangle made within these points is irregular triangle. ");
        
        
        
        
        
    }
}
