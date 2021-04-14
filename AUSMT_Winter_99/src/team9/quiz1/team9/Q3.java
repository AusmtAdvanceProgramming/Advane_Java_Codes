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
    
    int cash;
    int Amounts;
    int cash1;
    int cash2;
    int cash3;
    int cash4;
    int cash5;
    int cash6;
    
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter the amount(The amount entered is less than $ 100,000) :");
    cash = input.nextInt();
   
        
    System.out.print("How much cash do you want to spend?:(Enter 0 if you want to exit the program)"
              + "\n [1]-50000$ \n [2]-10000 \n [3]-5000 \n [4]-2000 \n [5]-1000 \n [6]-500" );
    
    Amounts = input.nextInt();
    
    switch(Amounts) {
        
        case 1 :
            cash1=cash/50_000;
            System.out.print(cash1);
            System.out.print("to $ 50000");
            break;
            
       case 2 :
            cash2=cash/10_000;
            System.out.print(cash2);  
            System.out.print("to $ 10000"); 
            break;
            
        case 3 :
            cash3=cash/5000;
            System.out.print(cash3); 
            System.out.print("to $ 5000"); 
            break;
            
        case 4 :
            cash4=cash/2000;
            System.out.print(cash4); 
            System.out.print("to $ 500");
            break;
            
        case 5 :
            cash5=cash/1000;
            System.out.print(cash5); 
            System.out.print("to $ 1000"); 
            break;
            
        case 6 :
            cash6=cash/500;
            System.out.print(cash6); 
            System.out.print("to $ 500"); 
            break;
              
                    
     }   
   }
}