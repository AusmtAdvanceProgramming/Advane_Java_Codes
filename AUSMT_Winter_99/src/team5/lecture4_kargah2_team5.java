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
public class lecture4_kargah2_team5 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double x1,y1,x2,y2,x3,y3,a,b,c,A,B,C;
        
        System.out.println("Please enter the first point coordination:");
        System.out.println("x1: ");
        x1=input.nextDouble();
        System.out.println("y1:");
        y1=input.nextDouble();
        
        System.out.println("Please enter the second point coordination:");
        System.out.println("x2: ");
        x2=input.nextDouble();
        System.out.println("y2:");
        y2=input.nextDouble();
        
        System.out.println("Please enter the third point coordination:");
        System.out.println("x3: ");
        x3=input.nextDouble();
        System.out.println("y3:");
        y3=input.nextDouble();
        
        a=Math.sqrt(Math.pow((x2-x3), 2)+Math.pow(y2-y3, 2));
        b=Math.sqrt(Math.pow((x1-x3), 2)+Math.pow(y1-y3, 2));
        c=Math.sqrt(Math.pow((x1-x2), 2)+Math.pow(y1-y2, 2));
        
        A=Math.toDegrees(Math.acos((a*a - b*b - c*c)/(-2*b*c)));
        B=Math.toDegrees(Math.acos((b*b - a*a - c*c)/(-2*a*c)));
        C=Math.toDegrees(Math.acos((c*c - b*b - a*a)/(-2*a*b)));
        
        A=Math.round(A*100)/100.0;
        B=Math.round(B*100)/100.0;
        C=Math.round(C*100)/100.0;
        
        if(a==b&&b==c&&a==c&&A==B&&B==C&&C==A)
            System.out.println("Equilateral tringle.");
        else if(A==90||B==90||C==90)
            System.out.println("Right triangle.");
        else if(a==b&&A==B||a==c&&A==C||c==b&&C==B)
            System.out.println("Isosceles triangle.");
        else
            System.out.println("Irregular triangle.");
    }
    
}
