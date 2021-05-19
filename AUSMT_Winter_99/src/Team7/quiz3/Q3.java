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
public class Q3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int lengthOfStr = 0;
        
        System.out.println("Enter the length of your String");
        lengthOfStr = input.nextInt();
        
        stringGenerator(lengthOfStr);
//        int i = 0;
//        while ( i < 100) {
//        System.out.println( (int) (Math.random() * 120));
//        i++;
    
        
    } // end if main
    
    public static void stringGenerator(int lengthOfStr) {
      char[] string = new char[lengthOfStr];
      int number = 0;
      int counter = 0;
      
      do {
          number = (int) (Math.random() * 122);
          if ( (number > 47 && number < 58) || (number > 64 && number < 91) || (number > 96)  ) {
              string[counter] = (char) number;
              counter++;
          }
      } while(counter < lengthOfStr);
      
      for (int i = 0; i < string.length; i++) {
          System.out.print(string[i]);
      }
    
    } //end
}//end of class
