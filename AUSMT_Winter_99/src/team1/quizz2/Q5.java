/*
 Haniyeh Hadiyan _  Hossein Rahi
*/
package team1.quizz2;

import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
    
    int counter = 0 , First_interval = 2 , End_of_interval = 1000, i ;
    boolean Prime = true;
        
    //----------------------------------------------
    
        while(First_interval < End_of_interval && counter < 40) {
            
            Prime = true;
         
            for (i = 2 ; i < First_interval ; i++) {
                if (First_interval % i == 0) {
                    Prime = false;
                    break;
                }
            }
            
    //----------------------------------------------
        
        if (Prime){ 
                    System.out.print(First_interval + "\t" );
                    counter++;
                    if(counter % 8 == 0){
                        System.out.println();
                        
                    }
                }
            First_interval++;    
        }
    }
}// The end 
