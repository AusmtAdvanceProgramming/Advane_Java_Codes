/*
 * Season4_Workshop2.java
 */
package team4 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Season4_Workshop2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        double x1 , y1 ;
        double x2 , y2 ;
        double x3 , y3 ;
        double a , b , c ;
        double A , B , C ;
        //***
        System.out.println ("____________________") ;
        System.out.println ("Enter the coordinates of the first point : ") ;
        System.out.print ("x : ") ;
        x1=input.nextDouble () ;
        System.out.print ("y : ") ;
        y1=input.nextDouble () ;
        System.out.println ("__________") ;
        System.out.println ("Enter the coordinates of the second point : ") ;
        System.out.print ("x : ") ;
        x2=input.nextDouble () ;
        System.out.print ("y : ") ;
        y2=input.nextDouble () ;  
        System.out.println ("__________") ;
        System.out.println ("Enter the coordinates of the third point : ") ;
        System.out.print ("x : ") ;
        x3=input.nextDouble () ;
        System.out.print ("y : ") ;
        y3=input.nextDouble () ;  
        System.out.println ("__________") ;        
        //***
        a=Math.pow ((Math.pow ((x2-x1),2))+(Math.pow ((y2-y1),2)),0.5) ;
        b=Math.pow ((Math.pow ((x3-x1),2))+(Math.pow ((y3-y1),2)),0.5) ;
        c=Math.pow ((Math.pow ((x3-x2),2))+(Math.pow ((y3-y2),2)),0.5) ;
        //***
        a=(int)(a*100)/100.0 ;
        b=(int)(b*100)/100.0 ;
        c=(int)(c*100)/100.0 ;
        //***
        A=Math.acos ((a*a-b*b-c*c)/(-2*b*c)) ;
        B=Math.acos ((b*b-a*a-c*c)/(-2*a*c)) ;
        C=Math.acos ((c*c-b*b-a*a)/(-2*a*b)) ;
        //***
        A=(int)(A*100)/100.0 ;
        B=(int)(B*100)/100.0 ;
        C=(int)(C*100)/100.0 ;        
        //***
        System.out.print ("The type of triangle is equal to : ") ;
        //***
        if (a==b && a==c && b==c) {
            System.out.println ("Equilateral triangle") ;
        }
        else if (a==b || a==c || b==c) {
            System.out.println ("Isosceles triangle") ;
        }
        else if (A==Math.PI/2 || B==Math.PI/2 || C==Math.PI/2) {
            System.out.println ("Right triangle") ;
        }
        else {
            System.out.println ("Different side triangles") ;
        }
        System.out.println ("____________________") ;
    }
}