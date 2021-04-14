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
        int choice;
        int change1 = 50_000;
        int change2 = 10_000;
        int change3 = 5000;
        int change4 = 2000;
        int change5 = 1000;
        int change6 = 500;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your price, make it less than 100,000 tomans:");
        
        price = input.nextDouble();
        
        System.out.println("Choose the change you want enter 1 for 50000\n"
                + "2 for 10000 , 3 for 5000 ,4 for 2000 , 5 for 1000 and 6 for 500");
        
        choice = input.nextInt();
        
        if (choice == 1){
            
            price =(price / change1);
            System.out.println("your number of change in 50000 is " + price);   
        }
        
        if (choice == 2){
            price /= change2;
            System.out.println("Your number of change in 10,000 tomans is " + price );
        }
        
        if (choice == 3){
             price /= change3;
            System.out.println("Your number of change in 5000 tomans is " + price );
        }
        
        if (choice == 4){
             price /= change4;
            System.out.println("Your number of change in 2000 tomans is " + price );
        }
        
        if (choice == 5){
            price /= change5;
            System.out.println("Your number of change in 1000 tomans is " + price );
        }
        
        if (choice == 6){
            price /= change6;
            System.out.println("Your number of change in 500 tomans is " + price );
        }
        
    }
    
}
