/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz2;

/**
 *
 * @author PC
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;         
        int start = 2 , end = 10000, i;
        boolean isPrime = true;
        
        
        while(start < end && counter < 40) {
            
            isPrime = true;
         
            for (i = 2; i < start ; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }//end of for
    
        
        if (isPrime){ 
                    System.out.print(start + "\t" );
                    counter++;
                    if(counter % 8 == 0){
                        System.out.println();
                        
                    }//end of if counter
                    
                }//end of if(isPrime)
        
            start++;
            
        }//end of while
    
    }//end of method
    
}//end of class