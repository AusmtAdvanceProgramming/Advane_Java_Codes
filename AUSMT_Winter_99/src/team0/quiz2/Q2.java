package team0.quiz2;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
        
        double deposit;
        double profit;
        double storage;
        int year=0;
        
        System.out.println("Please enter your despot amount:");
        deposit=input.nextDouble();
        
        System.out.print("Please enter the profit:");
        profit=input.nextDouble();
        
        storage=deposit*2;
        
        while(storage>deposit){
            deposit=deposit+((deposit*profit)/100);
            year++;           
        }
        
        System.out.println("After "+year+" years your deposit will be double.");
       
    }
    
}    
