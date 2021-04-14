/*
 * Q1.java.tamrin01
 */
package team10.quiz1 ;
// 1.Sina gholizadeh 2.Amir Rasuli
import java.util.Scanner ;
//***
public class Q1 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        double x , y ;
        double a , b , e ;
        double c , d , f ;
        //***
        System.out.println ("____________________") ;
        
        System.out.println ("ax+by=e") ;
        
        System.out.println ("cx+dy=f") ;
        
        System.out.println ("__________") ;
        
        System.out.println ("meqdar haye zir ra vared konid : ") ;
        
        System.out.print ("a : ") ;
        
        a=input.nextDouble () ;
        
        System.out.print ("b : ") ;
        
        b=input.nextDouble () ;
        
        System.out.print ("e : ") ;
        
        e=input.nextDouble () ;
        
        System.out.print ("c : ") ;
        
        c=input.nextDouble () ;
        
        System.out.print ("d : ") ;
        
        d=input.nextDouble () ;
        
        System.out.print ("f : ") ;
        
        f=input.nextDouble () ;
        
        System.out.println ("__________") ;
        
        //***
        x=((c*e)-(b*f))/((a*e)-(b*d)) ;
        
        y=((a*f)-(d*c))/((a*e)-(b*d)) ;
        //***
        System.out.println ("x="+x+"\ny="+y) ;
        
        System.out.println ("____________________") ;
    }
}