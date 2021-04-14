/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.Quizz1;
import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class Q4 {
    public static void main(String[] args){
    
             Scanner input = new Scanner (System.in);
        
        int amount,n1,n2,n3,n4,n5,n6;
        
        System.out.println("Please enter your amount(less than 100,000 Toman):");
        
        amount = input.nextInt();
        
        System.out.println("__________________________________________");
        n1=amount/50000;
         System.out.println("Your amount includes "+n1+" times 50,000 Toman.");
        
        n2=amount/10000;
        System.out.println("Your amount includes "+n2+" times 10,000 Toman.");
        
        n3=amount/5000;
        System.out.println("Your amount includes "+n3+" times 5,000 Toman.");
        
        n4=amount/2000;
        System.out.println("Your amount includes "+n4+" times 2,000 Toman.");
        
        n5=amount/1000;
        System.out.println("Your amount includes "+n5+" times 1,000 Toman.");
        
        n6=amount/500;
        System.out.println("Your amount includes "+n6+" times 500 Toman.");
        System.out.println("__________________________________________");   
    }
    
        
    }  

