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
public class tamrin2_lecture1 {

public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    double a,b,c,d,e,f,x,y;
    
    System.out.println("Finding x and y ");
    System.out.println("ax+by=c\ncx+dy=f\n______________");
    
    System.out.println("Please enter a,b,c in order: ");
    
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    
    System.out.println("Please enter d,e,f in order: ");
    
    d = input.nextDouble();
    e = input.nextDouble();
    f = input.nextDouble();
    
    y=(((a*f)-(d*c))/((a*e)-(d*b)));
    x=(((c*e)-(b*f))/((a*e)-(d*b)));
    
    System.out.println("x="+x+",y="+y);

    
    
    
}    
}
