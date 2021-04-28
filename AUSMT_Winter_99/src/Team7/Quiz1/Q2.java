/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz1;

import java.util.Scanner ;
/**
 *
 * @author ACER
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double x , y ;
        double a , b , e ;
        double c , d , f ;
             
        System.out.println ("ax + by = e") ;
        System.out.println ("cx + dy = f") ;
        
        System.out.println ("adad hara vared konid: ") ;
        
        System.out.print ("a : ") ;
        a = input.nextDouble () ;
        
        System.out.print ("b : ") ;
        b = input.nextDouble () ;
        
        System.out.print ("e : ") ;
        e = input.nextDouble () ;
        
        System.out.print ("c : ") ;
        c = input.nextDouble () ;
        
        System.out.print ("d : ") ;
        d = input.nextDouble () ;
        
        System.out.print ("f : ") ;
        f = input.nextDouble () ;
        
        x = ((c*e)-(b*f))/((a*e)-(b*d)) ;
        y = ((a*f)-(d*c))/((a*e)-(b*d)) ;
        //***
        System.out.println ("x=" + x ) ;
        System.out.println ("y=" + y ) ;
       
    }
    
}
