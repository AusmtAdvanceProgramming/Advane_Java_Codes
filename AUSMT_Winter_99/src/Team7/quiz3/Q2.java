/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.quiz3;

import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Q2 {
 
public static String hexChars = "0123456789ABCDEF";

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String hex = "";
        boolean resaults;
        
        
        
        do {
            System.out.println("Enter a valid hexadecimal string:");
            hex = input.next();
            hex = hex.toUpperCase();
            resaults = checkHex(hex);
            if (resaults == false) {
                System.out.println("Your hex number is not valid. enter another one.");
            }
        } while(resaults == false);
        
        System.out.println( "decimal of " + hex + " is " + getDecimal(hex));
        
    }//end of main
    
    public static boolean checkHex(String hex) {
        boolean value = true;
        for (int i = 0; i < hex.length(); i++) {
            for (int j = 0; j < hexChars.length(); j++) {
                if(hex.charAt(i) == hexChars.charAt(j)) {
                    value = true;
                    break;
                } else {value = false;}
            }
        }
      
        return value;
    }
    
    public static int getDecimal(String hex){  
       
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = hexChars.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
}  

    
}//end of class
