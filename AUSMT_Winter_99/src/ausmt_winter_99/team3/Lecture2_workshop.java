/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausmt_winter_99.team3;
import java.util.Scanner;
/**
 *
 * @amirali ghaumi
 * naser riazi
 * team3
 */
public class Lecture2_workshop {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        double x1 , y1 ;
        double x2 , y2 ;
        double x3 , y3 ;
        double side1 , side2 , side3 ;
        double degree1 , degree2 , degree3 ;
        //*
        
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
        System.out.println ("") ;
        System.out.println ("Enter the coordinates of the third point : ") ;
        System.out.print ("x : ") ;
        x3=input.nextDouble () ;
        System.out.print ("y : ") ;
        y3=input.nextDouble () ;  
               
        //*
        side1 = Math.pow ((Math.pow ((x2 - x1) , 2))+(Math.pow ((y2 - y1) ,2)) , 0.5) ;
        side2 = Math.pow ((Math.pow ((x3 - x1) , 2))+(Math.pow ((y3 - y1) , 2)) , 0.5) ;
        side3 = Math.pow ((Math.pow ((x3 - x2), 2))+ (Math.pow ((y3 - y2) , 2)) , 0.5) ;
        //*
        side1=(int)(side1 * 100) / 100.0 ;
        side2=(int)(side2 * 100) / 100.0 ;
        side3=(int)(side3 * 100) / 100.0 ;
        //*
        degree1 = Math.acos ((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3)) ;
        degree2 = Math.acos ((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3)) ;
        degree3 = Math.acos ((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2)) ;
        //*
        degree1=(int)(degree1 * 100) / 100.0 ;
        degree2=(int)(degree2 * 100) / 100.0 ;
        degree3=(int)(degree3 * 100) / 100.0 ;        
        //*
        System.out.println ("sides" + side1 + "," + side2 + "," + side3) ;
        
        System.out.println ("degrees in radian " + degree1 + "," + degree2 + ","+ degree3) ;
        
        //*
        
        System.out.print ("The type of triangle is equal to : ") ;
        
        //*
        if (side1==side2 && side1==side3 && side2==side3) {
            System.out.println ("Equilateral triangle") ;
        }
        else if (side1==side2|| side1==side3 || side2==side3) {
            System.out.println ("Isosceles triangle") ;
        }
        else if (degree1==Math.PI/2 || degree2==Math.PI/2 || degree3==Math.PI/2) {
            System.out.println ("Right triangle") ;
        }
        else {
            System.out.println ("Different side triangles") ;
        }
        
    }
}
