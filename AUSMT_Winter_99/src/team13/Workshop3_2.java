/*
 * Workshop3_2
 */
package team13;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Workshop3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        // get string and char
        System.out.println("Enter your string :");
        
        Scanner input = new Scanner(System.in);
        
        String selected_str = input.nextLine();
        
        System.out.println("Enter your char for search :");
        
        String selected_char = input.nextLine();
       
        // get number of char in string
       
        int length_of_string = selected_str.length();
        int number_of_char = 0;
        
        for (int i = 0; i < length_of_string; i++) {
            if (selected_str.charAt(i) == selected_char.charAt(0)) {
                number_of_char++;
            }
        }
        // print result
        System.out.print(selected_char.charAt(0) + " : ");
       
        for (int g = 0; g < number_of_char; g++) {
            System.out.print("# ");
        }
    }
}



