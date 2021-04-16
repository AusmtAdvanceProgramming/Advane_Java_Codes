/*
 Haniyeh Hadiyan - Hossein Rahi
 */
package team2;

import java.util.Scanner;

public class workshop2 {
    
    public static void main (String[] args) {
          Scanner input=new Scanner (System.in) ;
       
        double pointx1 , pointy1 ;
        double pointx2 , pointy2 ;
        double pointx3 , pointy3 ;
        double pointa , pointb , pointc ;
        double pointA , pointB , pointC ;
        
        
        System.out.println ("Enter the coordinates of the first point : ") ;
        System.out.print ("x : ") ;
        pointx1=input.nextDouble () ;
        System.out.print ("y : ") ;
        pointy1=input.nextDouble () ;
        
        
        System.out.println ("Enter the coordinates of the second point : ") ;
        System.out.print ("x : ") ;
        pointx2=input.nextDouble () ;
        System.out.print ("y : ") ;
        pointy2=input.nextDouble () ;  
        
        
        System.out.println ("Enter the coordinates of the third point : ") ;
        System.out.print ("x : ") ;
        pointx3=input.nextDouble () ;
        System.out.print ("y : ") ;
        pointy3=input.nextDouble () ;  
        
        
        pointa=Math.pow ((Math.pow ((pointx2-pointx1),2))+(Math.pow ((pointy2-pointy1),2)),0.5) ;
        pointb=Math.pow ((Math.pow ((pointx3-pointx1),2))+(Math.pow ((pointy3-pointy1),2)),0.5) ;
        pointc=Math.pow ((Math.pow ((pointx3-pointx2),2))+(Math.pow ((pointy3-pointy2),2)),0.5) ;
        
        pointa=(int)(pointa*100)/100.0 ;
        pointb=(int)(pointb*100)/100.0 ;
        pointc=(int)(pointc*100)/100.0 ;
        
        pointA=Math.acos ((pointa*pointa-pointb*pointb-pointc*pointc)/(-2*pointb*pointc)) ;
        pointB=Math.acos ((pointb*pointb-pointa*pointa-pointc*pointc)/(-2*pointa*pointc)) ;
        pointC=Math.acos ((pointc*pointc-pointb*pointb-pointa*pointa)/(-2*pointa*pointb)) ;
        
        pointA=(int)(pointA*100)/100.0 ;
        pointB=(int)(pointB*100)/100.0 ;
        pointC=(int)(pointC*100)/100.0 ;        
        
        System.out.println (pointa+","+pointb+","+pointc) ;
        System.out.println (pointA+","+pointB+","+pointC) ;
        
        System.out.print ("The type of triangle is equal to : ") ;
        
        if (pointa==pointb && pointa==pointc && pointb==pointc) {
            System.out.println ("Equilateral triangle") ;
        }
        else if (pointa==pointb || pointa==pointc || pointb==pointc) {
            System.out.println ("Isosceles triangle") ;
        }
        else if (pointA==Math.PI/2 || pointB==Math.PI/2 || pointC==Math.PI/2) {
            System.out.println ("Right triangle") ;
        }
        else {
            System.out.println ("Different side triangles") ;
        } 
    }
} //The end
