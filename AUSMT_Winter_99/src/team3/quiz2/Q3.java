/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz2;
import java.util.Scanner;
/**
 *
 * @amirali ghaumi
 * @naser riazi
 * team3
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] hex = {0,0,0,0,0,0,0,0,0,0};
        int counter = 0;
        int decimal;
        int i = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number you want to convert to hexdecimal: ");
        decimal = input.nextInt();
        
        while (decimal > 0){
            //this while is for dividing the decimal number into hex by using array
           //the remaininig of decimal number will be saved into hex in will also divide it self
           //into 16 every time
            hex[i] = decimal % 16;
            decimal /= 16;
            counter++;
            i++;
            
        }//end of while
     
        for (i = counter - 1; i >= 0; i--){
            switch(hex[i]){
                //using switch to determine the remaining or quotient
                //because in hexdecimal numbers between 10 to 15 is letters A to F
                case 10 :
                    System.out.print("A");
                    break;
                case 11 :
                    System.out.print("B");
                    break;
                case 12 :
                    System.out.print("C");
                case 13 :
                    System.out.print("D");
                case 14 :
                    System.out.print("E");
                case 15 :
                    System.out.print("F");
                default :
                    System.out.print(hex[i]);
                
            }//end of switch
            
        }//end of for 
        
    }//end of method
    
}//end of class
