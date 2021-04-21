/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7;

import java.util.Scanner;

/**
 *
 * @author team7
 */
public class Workshop3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String userString = "";
        int count = 0;
        char target;
        
        System.out.println("ENTER a string: ");
        userString = input.nextLine();
        
        System.out.println("ENTER a character: ");
        target = input.next().charAt(0);
        
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == target) {
                count++;
            }     
        }
        
        System.out.println(target + " has been repeated " + count + " times in " + userString);
        
    }
    
}
