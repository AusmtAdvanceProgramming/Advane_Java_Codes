package team17;

/*team17.Kargah2
Salari & Sh'abani
@Author : Salari*/

import java.util.Scanner;

public class Workshop2 {
    public static void main(String[] args) {
        double x1, y1;   //Point 1 coordination
        double x2, y2;   //Point 2 coordination
        double x3, y3;   //Point 3 coordination
        double a, b, c;  //Triangle sides
        double A, B, C;  //Triangle angels
        //Getting points from user...
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter the first point coordination: ");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        
        System.out.println("Please enter the second point coordination: ");
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();   
        
        System.out.println("Please enter the third point coordination: ");
        System.out.print("x3: ");
        x3 = input.nextDouble();
        System.out.print("y3: ");
        y3 = input.nextDouble();
        //Side size calculations
        a = Math.sqrt(Math.pow((x2-x3), 2)+Math.pow((y2-y3), 2));
        b = Math.sqrt(Math.pow((x1-x3), 2)+Math.pow((y1-y3), 2));
        c = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
        //Calculations related to angles
        A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
        //Rounding numbers...
        A = Math.round(A*100)/100.0;
        B = Math.round(B*100)/100.0;
        C = Math.round(C*100)/100.0;
        //Shows angles...
        System.out.println("angle of A is: "+A);
        System.out.println("angle of B is: "+B);
        System.out.println("angle of C is: "+C);
        //
        if (A+B+C==180) {
            if (A==B && A==C && B==C) 
                System.out.println("Your Triangle is [Equilateral triangle.] ");
            if (A==B || A==C || B==C) 
                System.out.println("Your Triangle is [Isosceles triangle.] ");
            if (A==90 || B==90 || C==90)
                System.out.println("Your Triangle is [Right triangle.] ");
            if ((A==B || A==C || B==C)&&(A==90 || B==90 || C==90))
                System.out.println("Your Triangle is [An isosceles right triangle.] ");
            else 
                System.out.println("Your Triangle is [Different angle triangle.] ");
       
            }
        else
            System.out.println("These points do not form a triangle!!!");
    }//end of main() method 
}//end of Class
