/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1.team9;

/**
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;

public class Q3 {
    public static void main(String[] args) {
    
   
        
        double pay;
        int ELX1=0;
        int ELX2=0;
        int ELX3=0;
        int ELX4=0;
        int ELX5=0;
        int ELX6=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("mablaq ra vared konid , kamtar az 100000 toman bashad :");
        
        pay = input.nextDouble();
        
           if (pay % 50000 == 0){
              pay /=50000;
              System.out.println(" tedad  50000 hezar tomani ha = " + pay);  
           }
           else if (pay % 50000 != 0){
            while (pay > 50000){
                   pay -=50000;
                   ELX1++;
               }
            System.out.println("tedad  50000 hezar tomani ha = " + ELX1);
           }
        
           if (pay % 10000 == 0){
              pay /=10000;
              System.out.println(" tedad  10000 hezar tomani ha = " + pay);  
           }
           else if (pay % 10000 != 0){
            while (pay > 10000){
                   pay -=10000;
                   ELX2++;
               }
            System.out.println("tedad  10000 hezar tomani ha = " + ELX2);
           }
        
        
           if (pay % 5000 == 0){
              pay /=5000;
              System.out.println(" tedad  5000 hezar tomani ha = " + pay);  
           }
           else if (pay % 5000 != 0){
            while (pay > 5000){
                   pay -=5000;
                   ELX3++;
               }
            System.out.println("tedad  5000 hezar tomani ha = " + ELX3);
           }
        
           if (pay % 2000 == 0){
              pay /=2000;
              System.out.println(" tedad  2000 hezar tomani ha = " + pay);  
           }
           else if (pay % 2000 != 0){
            while (pay > 2000){
                   pay -=2000;
                   ELX4++;
               }
            System.out.println("tedad  2000 hezar tomani ha = " + ELX4);
           }
        
        
        
           if (pay % 1000 == 0){
              pay /=1000;
              System.out.println(" tedad  1000 hezar tomani ha = " + pay);  
           }
           else if (pay % 1000 != 0){
            while (pay > 1000){
                   pay -=1000;
                   ELX5++;
               }
            System.out.println("tedad  1000 hezar tomani ha = " + ELX5);
           }
        
        
       
           if (pay % 500 == 0){
              pay /=500;
              System.out.println(" tedad  500 hezar tomani ha = " + pay);  
           }
           else if (pay % 500 != 0){
            while (pay > 500){
                   pay -=500;
                   ELX6++;
               }
            System.out.println("tedad  500 hezar tomani ha = " + ELX6);
           }
        
    }
    
}
