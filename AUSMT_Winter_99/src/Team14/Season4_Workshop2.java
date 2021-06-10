package team14 ;

import java.util.Scanner ;

public class Season4_Workshop2 {
    public static void main (String[] args) {

        Scanner input=new Scanner (System.in) ;
        
        double x1 , y1 ;
        double x2 , y2 ;
        double x3 , y3 ;
        double a , b , c ;
        double A , B , C ;
        
        System.out.println ("____________________") ;


       
        double pointx1 , pointy1 ;
        double pointx2 , pointy2 ;
        double pointx3 , pointy3 ;
        double pointa , pointb , pointc ;
        double pointA , pointB , pointC ;
        
        

        System.out.println ("Enter the coordinates of the first point : ") ;
        System.out.print ("x : ") ;
        x1=input.nextDouble () ;
        System.out.print ("y : ") ;
        y1=input.nextDouble () ;
        
        
        System.out.println ("Enter the coordinates of the second point : ") ;
        System.out.print ("x : ") ;
        x2=input.nextDouble () ;
        System.out.print ("y : ") ;
        y2=input.nextDouble () ;  
        
        
        System.out.println ("Enter the coordinates of the third point : ") ;
        System.out.print ("x : ") ;
        x3=input.nextDouble () ;
        System.out.print ("y : ") ;

        y3=input.nextDouble () ;  
        System.out.println ("__________") ;        
        
        a=Math.pow ((Math.pow ((x2-x1),2))+(Math.pow ((y2-y1),2)),0.5) ;
        b=Math.pow ((Math.pow ((x3-x1),2))+(Math.pow ((y3-y1),2)),0.5) ;
        c=Math.pow ((Math.pow ((x3-x2),2))+(Math.pow ((y3-y2),2)),0.5) ;
        
        a=(int)(a*100)/100.0 ;
        b=(int)(b*100)/100.0 ;
        c=(int)(c*100)/100.0 ;
        
        A=Math.acos ((a*a-b*b-c*c)/(-2*b*c)) ;
        B=Math.acos ((b*b-a*a-c*c)/(-2*a*c)) ;
        C=Math.acos ((c*c-b*b-a*a)/(-2*a*b)) ;
        
        A=(int)(A*100)/100.0 ;
        B=(int)(B*100)/100.0 ;
        C=(int)(C*100)/100.0 ;        
        

        pointy3=input.nextDouble () ;  
        
        
        pointa=Math.pow ((Math.pow ((x2-x1),2))+(Math.pow ((y2-y1),2)),0.5) ;
        pointb=Math.pow ((Math.pow ((x3-x1),2))+(Math.pow ((y3-y1),2)),0.5) ;
        pointc=Math.pow ((Math.pow ((x3-x2),2))+(Math.pow ((pointy3-y2),2)),0.5) ;
        
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
