/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;
import java.util.Scanner;

/**
 *
 * @amiraliGhaumi
 * @naserRiazi
 * team3
 */
public class Q0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0;
        double max = 0;
        double min = 0;
        double number;
        int quit = 1;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("**********************************");
       System.out.println("Enter 1 if you want to continue the programm \nor -1 if you want to finish it:");
             quit = input.nextInt();
        if(quit==1){
             
         System.out.println("Enter your number:");
            number = input.nextDouble();
            max = number;
            sum += number;
            min = number;
        
        
        while(quit != -1){
            
            System.out.println("Enter 1 if you want to continue the programm \nor -1 if you want to finish it:");
             quit = input.nextInt();
            if(quit == 1){
                
            System.out.println("Enter your number:");
            number = input.nextDouble();
            sum += number;
            
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
            
            }
        }

            System.out.println("**********************************");
            
        System.out.println("The sum of the double values you put in is " + sum);
        
        System.out.println("The maximum of the double values you put in is " + max);
        
        System.out.println("The minimum of the double values you put in is " + min);
        
        System.out.println("**********************************");
        }
    else
        {
            System.out.println("You didn't put an entry");
        }
    }
    
    
    
   }

