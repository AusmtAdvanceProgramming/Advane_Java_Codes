/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team13.quiz1;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
        public class Q2 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();
       
        System.out.println("Enter the value of b:");
        double b = input.nextDouble();
        
        System.out.println("Enter the value of c:");
        double c = input.nextDouble();
        
        System.out.println("Enter the value of d:");
        double d = input.nextDouble();
    
        System.out.println("Enter the value of e:");
        double e = input.nextDouble();
    
        System.out.println("Enter the value of f:");
        double f = input.nextDouble();
         
        double x = (f*b-d*e)/(c*b-a*d);
        double y = (e-a*x)/b;
        
        System.out.println("The value of the x:"+x+"\n"+"The value of the y:"+y);
    
    
    
    


    }//end of main() method
    
}//end of class
