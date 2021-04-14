/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11.quiz1;
import java.util.Scanner;
/**
 *
 * @author Parsley
 */
public class Question2 {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    double x ,y ,a ,b ,c ,d ,e ,f ;
    
    System.out.println("ax+by=c\ncx+dy=f");
    
    System.out.print("a : ");
    a = input.nextDouble();
    System.out.print("b : ");
    b = input.nextDouble();
    System.out.print("c : ");
    c = input.nextDouble();
    System.out.print("d : ");
    d = input.nextDouble();
    System.out.print("e : ");
    e = input.nextDouble();
    System.out.print("f : ");
    f = input.nextDouble();
    
    x=((( c * e )-( b * f ))/(( a * e )-( d * b )));
    y =((( a * f )-( d * c ))/(( a * e )-( d * b )));
    
    
    System.out.println("x="+x+",y="+y);

    }
}
