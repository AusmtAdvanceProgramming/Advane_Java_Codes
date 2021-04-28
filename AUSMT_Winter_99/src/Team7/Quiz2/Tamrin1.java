/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz2;

import java.util.Scanner;
/**
 *
 * @author alirezaBaqeri, soroushAshkar
 */
public class Tamrin1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String userString = "";
        int targetChar = 0;
        int capitalAscii = 65;
        int lowerAscii = 97;
        int counter = 0;
        
        System.out.println("Enter a sentence: ");
        userString = input.nextLine();
        for (int j = 0; j < 25; j++) {
            for (int i = 0; i < userString.length(); i++) {
                targetChar = (int) userString.charAt(i);
                if (targetChar == capitalAscii || targetChar == lowerAscii ) {
                    counter++;
                }
           }
            if (counter > 0) {
                System.out.println("amount of " + (char) capitalAscii + " or " + (char) lowerAscii + " is " + counter);
            }
            counter = 0;
            lowerAscii++;
            capitalAscii++;
        }
    } 
    
}
