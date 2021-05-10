/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team13;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Workshop2 {
  
        public static void main(String[] args) {
    
                double x1, y1;
		double x2, y2;
		double x3, y3;
		double a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first point coordination:");
		System.out.print("x1:");
		x1 = input.nextDouble();
		System.out.print("y1:");
		y1 = input.nextDouble();
		
		System.out.println("Please enter the second point coordination:");
		System.out.print("x2:");
		x2 = input.nextDouble();
		System.out.print("y2:");
		y2 = input.nextDouble();
		
		System.out.println("Please enter the third point coordination:");
		System.out.print("x3:");
		x3 = input.nextDouble();
		System.out.print("y3:");
		y3 = input.nextDouble();
		
	       a =  Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow(y2 - y3, 2));
 	       b =  Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
	       c =  Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));  
	    
	       if (a == b && b == c)
	       
	        System.out.println("Motesavialazla");
            
	        else if (a == b || b ==c || a == c)
	     
	        System.out.println("Motesaviasaqein");
	    
	        else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a)
	    
	        System.out.println("Qaemalzaviye");
	    
	        else if (a != b  && b != c)
	    
	         System.out.println("Namonazzam");
	    
	    
	 }
}
