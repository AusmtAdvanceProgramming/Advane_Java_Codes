
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
public class workshop2 {
     public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        double a1 , b1 ;
        double a2 , b2 ;
        double a3 , b3 ;
        double n , m , w ;
        double N , M , W ;
        //*
        System.out.println ("________") ;
        System.out.println ("Enter the coordinates of the first point : ") ;
        System.out.print ("a : ") ;
        a1=input.nextDouble () ;
        System.out.print ("b : ") ;
        b1=input.nextDouble () ;
        System.out.println ("____") ;
        System.out.println ("Enter the coordinates of the second point : ") ;
        System.out.print ("a : ") ;
        a2=input.nextDouble () ;
        System.out.print ("b : ") ;
        b2=input.nextDouble () ;  
        System.out.println ("____") ;
        System.out.println ("Enter the coordinates of the third point : ") ;
        System.out.print ("a : ") ;
        a3=input.nextDouble () ;
        System.out.print ("b : ") ;
        b3=input.nextDouble () ;  
        System.out.println ("____") ;        
        //*
        n=Math.pow ((Math.pow ((a2-a1),2))+(Math.pow ((b2-b1),2)),0.5) ;
        m=Math.pow ((Math.pow ((a3-a1),2))+(Math.pow ((b3-b1),2)),0.5) ;
        w=Math.pow ((Math.pow ((a3-a2),2))+(Math.pow ((b3-b2),2)),0.5) ;
        //*
        n=(int)(n*100)/100.0 ;
        m=(int)(m*100)/100.0 ;
        w=(int)(w*100)/100.0 ;
        //*
        N=Math.acos ((n*n-m*m-w*w)/(-2*m*w)) ;
        M=Math.acos ((m*m-n*n-w*w)/(-2*n*w)) ;
        W=Math.acos ((w*w-m*m-n*n)/(-2*n*m)) ;
        //*
        N=(int)(N*100)/100.0 ;
        M=(int)(M*100)/100.0 ;
        W=(int)(W*100)/100.0 ;        
        //*
        System.out.println (n+","+m+","+w) ;
        System.out.println (N+","+M+","+W) ;
        //*
        System.out.print ("The type of triangle is equal to : ") ;
        //*
        if (n==m && n==w && m==w) {
            System.out.println ("Equilateral triangle") ;
        }
        else if (n==m || n==w || m==w) {
            System.out.println ("Isosceles triangle") ;
        }
        else if (N==Math.PI/2 || M==Math.PI/2 || W==Math.PI/2) {
            System.out.println ("Right triangle") ;
        }
        else {
            System.out.println ("Different side triangles") ;
        }
        System.out.println ("________") ;
    }
}
