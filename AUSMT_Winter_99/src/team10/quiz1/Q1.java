/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team10.quiz1;

/**
 * @author Sina GholiZade
 * @author Amir Mohamnmad Rasuli
 */
import java.util.Scanner ;
public class Q1 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        double x , y ;
        double a , b , e ;
        double c , d , f ;
        //***
        System.out.println ("Enter value: ") ;
        System.out.print ("a:") ;
        a=input.nextDouble () ;
        System.out.print ("b:") ;
        b=input.nextDouble () ;
        System.out.print ("e:") ;
        e=input.nextDouble () ;
        System.out.print ("c:") ;
        c=input.nextDouble () ;
        System.out.print ("d:") ;
        d=input.nextDouble () ;
        System.out.print ("f:") ;
        f=input.nextDouble () ;
        //***
        x=((c*e)-(b*f))/((a*e)-(b*d)) ;
        y=((a*f)-(d*c))/((a*e)-(b*d)) ;
        //***
        System.out.println ("x="+x+"\ny="+y) ;
    }
}