/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_team9;
/**
 * @author Aliasghar ranjbar
 * @author zeynab karimizad
 */
import java.util.Scanner;
public class Q0 {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isFirst = true;
        double min = 0;
        double max = 0;
        double sum = 0 ;
        double number ;
          System.out.println("Enter your first number");
        for (int i = 0; i>=0 ; i++) {
            System.out.print("Number [" + (i + 1) + "]: ");
            number = input.nextDouble();
            System.out.println("~~~~~~~~~~~~~~~");
             sum += number;
          
            if (isFirst) {
                min = number;
                max = number;
                isFirst = false;
            }
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        System.out.println("Do you want to continue ? 1:+ 2:-");
             String chek=input.next();
             System.out.println("~~~~~~~~~~~~~~~");
             if(chek.equals("+")) {
            } else  
                break;
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + (sum));
    }
}  