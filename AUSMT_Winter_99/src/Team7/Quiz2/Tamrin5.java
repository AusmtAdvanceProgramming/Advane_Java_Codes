/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz2;

public class Tamrin5 {
    
    public static void main(String[] args) {
          
        //***
        
        int counter=0 ;
        int numberCounter = 0 ; 
        
        for (int number = 1; numberCounter < 40; number++) {
            for (int j = 1; j <= number; j++) {
                if ( number % j == 0 ) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.print (number + "\t") ;
                numberCounter++ ;
                //prime
                if ( numberCounter % 8 == 0) { 
                    System.out.println () ;
                    System.out.println("-----------------------------------------------------------");
                } //nextLine darsoorat residan sootoon be 8
            }
            
            counter=0 ; 
        }
    }
}
