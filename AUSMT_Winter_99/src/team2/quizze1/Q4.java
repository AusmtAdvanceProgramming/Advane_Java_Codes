/*
 Haniyeh Hadiyan - Hossein Rahi
 
 */
package team2.quizze1;

import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
    
    int money;
    int Amounts;
    int money1,money2,money3,money4,money5,money6;
    
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter the amount(The amount entered is less than $ 100,000) :");
    money = input.nextInt();
   
        
    System.out.print("How much money do you want to spend?:(Enter 0 if you want to exit the program)"
              + "\n [1]-50000$ \n [2]-10000 \n [3]-5000 \n [4]-2000 \n [5]-1000 \n [6]-500" );
    
    Amounts = input.nextInt();
    
    switch(Amounts) {
        
        case 1 :
            money1=money/50000;
            System.out.print(money1);
            System.out.print("to $ 50000");
            break;
            
       case 2 :
            money2=money/10000;
            System.out.print(money2);  
            System.out.print("to $ 10000"); 
            break;
            
        case 3 :
            money3=money/5000;
            System.out.print(money3); 
            System.out.print("to $ 5000"); 
            break;
            
        case 4 :
            money4=money/2000;
            System.out.print(money4); 
            System.out.print("to $ 500");
            break;
            
        case 5 :
            money5=money/1000;
            System.out.print(money5); 
            System.out.print("to $ 1000"); 
            break;
            
        case 6 :
            money6=money/500;
            System.out.print(money6); 
            System.out.print("to $ 500"); 
            break;
              
                    
     }   
   }
 } //The end


