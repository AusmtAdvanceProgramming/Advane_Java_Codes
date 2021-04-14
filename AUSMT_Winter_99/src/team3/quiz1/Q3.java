/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz1;
import java.util.Scanner;
/**
 *
 * @amirali ghaumi
 * naser riazi
 * team3
 */
public class Q3 {

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double price;        
        int cahngecounter1=0;
        int cahngecounter2=0;
        int cahngecounter3=0;
        int cahngecounter4=0;
        int cahngecounter5=0;
        int cahngecounter6=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your price, make it less than 100,000 tomans:");
        
        price = input.nextDouble();
        
           if (price % 50000 == 0){
              price /=50000;
              System.out.println(" your chnage in 50000 = " + price);  
           }
           else if (price % 50000 != 0){
            while (price > 50000){
                   price -=50000;
                   cahngecounter1++;
               }
            System.out.println("your change in 50000 = " + cahngecounter1);
           }
        
           if (price % 10000 == 0){
              price /=10000;
              System.out.println(" your chnage in 10000 = " + price);  
           }
           else if (price % 10000 != 0){
            while (price > 10000){
                   price -=10000;
                   cahngecounter2++;
               }
            System.out.println("your change in 10000 = " + cahngecounter2);
           }
        
        
           if (price % 5000 == 0){
              price /=5000;
              System.out.println(" your chnage in 5000 = " + price);  
           }
           else if (price % 5000 != 0){
            while (price > 5000){
                   price -=5000;
                   cahngecounter3++;
               }
            System.out.println("your change in 5000 = " + cahngecounter3);
           }
        
           if (price % 2000 == 0){
              price /=2000;
              System.out.println(" your chnage in 2000 = " + price);  
           }
           else if (price % 2000 != 0){
            while (price > 2000){
                   price -=2000;
                   cahngecounter4++;
               }
            System.out.println("your change in 1000 = " + cahngecounter4);
           }
        
        
        
           if (price % 1000 == 0){
              price /=1000;
              System.out.println(" your chnage in 1000 = " + price);  
           }
           else if (price % 1000 != 0){
            while (price > 1000){
                   price -=1000;
                   cahngecounter5++;
               }
            System.out.println("your change in 1000 = " + cahngecounter5);
           }
        
        
       
           if (price % 500 == 0){
              price /=500;
              System.out.println(" your chnage in 500 = " + price);  
           }
           else if (price % 500 != 0){
            while (price > 500){
                   price -=500;
                   cahngecounter6++;
               }
            System.out.println("your change in 500 = " + cahngecounter6);
           }
        
    }
    
}
