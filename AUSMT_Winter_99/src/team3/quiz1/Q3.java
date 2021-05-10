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
        
        int price;        
        int changecounter1=0;
        int changecounter2=0;
        int changecounter3=0;
        int changecounter4=0;
        int changecounter5=0;
        int changecounter6=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your price, make it less than 100,000 tomans:");
        
        price = input.nextInt();
        
           if (price % 50000 == 0){
              price /=50000;
              System.out.println(" your change in 50000 = " + price);  
           }
           else if (price % 50000 != 0){
            while (price > 50000){
                   price -=50000;
                   changecounter1++;
               }
            System.out.println("your change in 50000 = " + changecounter1);
           }
        
           if (price % 10000 == 0){
              price /=10000;
              System.out.println(" your change in 10000 = " + price);  
           }
           else if (price % 10000 != 0){
            while (price > 10000){
                   price -=10000;
                   changecounter2++;
               }
            System.out.println("your change in 10000 = " + changecounter2);
           }
        
        
           if (price % 5000 == 0){
              price /=5000;
              System.out.println(" your change in 5000 = " + price);  
           }
           else if (price % 5000 != 0){
            while (price > 5000){
                   price -=5000;
                   changecounter3++;
               }
            System.out.println("your change in 5000 = " + changecounter3);
           }
        
           if (price % 2000 == 0){
              price /=2000;
              System.out.println(" your change in 2000 = " + price);  
           }
           else if (price % 2000 != 0){
            while (price > 2000){
                   price -=2000;
                   changecounter4++;
               }
            System.out.println("your change in 2000 = " + changecounter4);
           }
        
        
        
           if (price % 1000 == 0){
              price /=1000;
              System.out.println(" your change in 1000 = " + price);  
           }
           else if (price % 1000 != 0){
            while (price > 1000){
                   price -=1000;
                   changecounter5++;
               }
            System.out.println("your change in 1000 = " + changecounter5);
           }
        
        
       
           if (price % 500 == 0){
              price /=500;
              System.out.println(" your change in 500 = " + price);  
           }
           else if (price % 500 != 0){
            while (price > 500){
                   price -=500;
                   changecounter6++;
               }
            System.out.println("your change in 500 = " + changecounter6);
           }
        
    }
    
}
