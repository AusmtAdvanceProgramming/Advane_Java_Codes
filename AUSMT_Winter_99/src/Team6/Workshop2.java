package Team6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Mahdi
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
                Scanner input = new Scanner(System.in);

        double x1, y1;
        double x2, y2;
        double x3, y3;
        double L1, L2, L3;
        double T1, T2, T3;

        
        System.out.println ("Please input the coordinates of the first point : ");
        System.out.print ("x1: ");
        x1 = input.nextDouble ();
        System.out.print ("y1: ");
        y1 = input.nextDouble ();

        
        System.out.println ("Please input the coordinates of the second point: ");
        System.out.print ("x2: ");
        x2 = input.nextDouble () ;
        System.out.print ("y2: ");
        y2 = input.nextDouble ();  

        
        System.out.println ("Please input the coordinates of the third point: ");
        System.out.print ("x3: ");
        x3=input.nextDouble () ;
        System.out.print ("y3: ");
        y3=input.nextDouble ();  
                
        L1 = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2 - y1), 2)));
        L2 = Math.sqrt((Math.pow((x3-x1), 2))+(Math.pow((y3 - y1), 2)));
        L3 = Math.sqrt((Math.pow((x3-x2), 2))+(Math.pow((y3 - y2), 2)));

        
        L1 = (int)(L1 * 100) / 100.0;
        L2 = (int)(L2 * 100) / 100.0;
        L3 = (int)(L3 * 100) / 100.0;

        
        T1 = Math.acos ((L1 * L1 - L2 * L2 - L3 * L3)/(-2 * L2 * L3));
        T2 = Math.acos ((L2 * L2 - L1 * L1 - L3 * L3)/(-2 * L1 * L3));
        T3 = Math.acos ((L3 * L3 - L2 * L2 - L1 * L1)/(-2 * L1 * L2));

        
        T1 = (int)(T1 * 100) / 100.0;
        T2 = (int)(T2 * 100) / 100.0;
        T3 = (int)(T3 * 100) / 100.0;        

        
        System.out.print("Triangle type is: ");

        if (L1 == L2 && L1 == L3 && L2 == L3) {
            System.out.println("Equilateral triangle");
        }
        else if (L1 == L2 || L1 == L3 || L2 == L3) {
            System.out.println("Isosceles triangle");
        }
        else if (Math.toDegrees(T1) == 90 || Math.toDegrees(T2) == 90 || Math.toDegrees(T3) == 90) {
            System.out.println("Straight triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }

    }
}
