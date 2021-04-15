/*
 Haniyeh Hadiyan - Hossein Rahi
 
 */
package team1.quizz1;

import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
    
    
        double pay;
        
        
        int cahngecounter1=0;
        int cahngecounter2=0;
        int cahngecounter3=0;
        int cahngecounter4=0;
        int cahngecounter5=0;
        int cahngecounter6=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your pay, make it less than 100,000 tomans:");
        
        pay = input.nextDouble();
        
           if (pay % 50000 == 0){
              pay /=50000;
              System.out.println(" your chnage in 50000 = " + pay);  
           }
           else if (pay % 50000 != 0){
            while (pay > 50000){
                   pay -=50000;
                   cahngecounter1++;
               }
            System.out.println("your change in 50000 = " + cahngecounter1);
           }
        
           if (pay % 10000 == 0){
              pay /=10000;
              System.out.println(" your chnage in 10000 = " + pay);  
           }
           else if (pay % 10000 != 0){
            while (pay > 10000){
                   pay -=10000;
                   cahngecounter2++;
               }
            System.out.println("your change in 10000 = " + cahngecounter2);
           }
        
        
           if (pay % 5000 == 0){
              pay /=5000;
              System.out.println(" your chnage in 5000 = " + pay);  
           }
           else if (pay % 5000 != 0){
            while (pay > 5000){
                   pay -=5000;
                   cahngecounter3++;
               }
            System.out.println("your change in 5000 = " + cahngecounter3);
           }
        
           if (pay % 2000 == 0){
              pay /=2000;
              System.out.println(" your chnage in 2000 = " + pay);  
           }
           else if (pay % 2000 != 0){
            while (pay > 2000){
                   pay -=2000;
                   cahngecounter4++;
               }
            System.out.println("your change in 1000 = " + cahngecounter4);
           }
        
        
        
           if (pay % 1000 == 0){
              pay /=1000;
              System.out.println(" your chnage in 1000 = " + pay);  
           }
           else if (pay % 1000 != 0){
            while (pay > 1000){
                   pay -=1000;
                   cahngecounter5++;
               }
            System.out.println("your change in 1000 = " + cahngecounter5);
           }
        
        
       
           if (pay % 500 == 0){
              pay /=500;
              System.out.println(" your chnage in 500 = " + pay);  
           }
           else if (pay % 500 != 0){
            while (pay > 500){
                   pay -=500;
                   cahngecounter6++;
               }
            System.out.println("your change in 500 = " + cahngecounter6);
           }
        
    }
    
}