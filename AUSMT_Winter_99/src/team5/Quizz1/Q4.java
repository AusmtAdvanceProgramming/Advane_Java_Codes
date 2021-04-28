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
        
        int amount,cash,n1,n2,n3,n4,n5,n6;
        
        System.out.println("Please enter your amount(less than 100,000 Toman):");
        
        amount = input.nextInt();
        
        System.out.println("How do you want your cash(press the numbers below)?");
        System.out.print("1-----50,000$\n2-----10,000$\n3-----5,000$\n4-----2,000$\n5-----1,000$\n6-----500$\n");
        
        cash = input.nextInt();
        
        switch(cash){
            case 1 :
                n1=amount/50000;
                System.out.println(n1+" to 50,000$");
                break;
                
            case 2:    
                n2=amount/10000;
                System.out.println(n2+" to 10,000$");
                break;
                
            case 3:
                n3=amount/5000;
                System.out.println(n3+" to 5,000$");
                break;
            
            case 4:
                n4=amount/2000;
                System.out.println(n4+" to 2,000$");
                break;
                
            case 5:
                n5=amount/1000;
                System.out.println(n5+" to 1,000$");
                break;
                
            case 6:
                n6=amount/500;
                System.out.println(n6+" to 5000$");
                break;
                
            default:System.out.println("Please try again.");





        }
        
    }
    
        
    }  

