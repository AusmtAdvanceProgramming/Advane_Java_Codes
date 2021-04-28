/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz2;

import java.util.Scanner;

public class Tamrin4 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       int decimal = 0;
       int remainder;
       String hex = "";
       char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
       
       System.out.println("Enter a decimal number: ");
       decimal = input.nextInt();
       
       while (decimal > 0 ) {
           remainder = decimal % 16;
           hex = hexChars[remainder] + hex;
           decimal = decimal / 16;
       }
    System.out.println("Hexadecimal of " + decimal + " is: "+ hex);  
    }
    
}
