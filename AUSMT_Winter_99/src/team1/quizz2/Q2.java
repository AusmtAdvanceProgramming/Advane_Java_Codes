/*
  Haniyeh Hadiyan - Hossein Rahi
*/
package team1.quizz2;

import java.util.Scanner;

public class Q2 {
    
        public static void main(String[] args) {
            
          Scanner input = new Scanner (System.in);            
            
          int number_1,number_2 , multiplication ,i=1 ,j=1 ,
          Multiply_the_number1 , Multiply_the_number2 , BMM ;
          
          //---------------------------------------------------  
            
          System.out.print(" Please enter frist number : ");
          number_1 = input.nextInt();
          
          System.out.print(" Please enter second number : ");
          number_2 = input.nextInt();
          
          //---------------------------------------------------
          
          multiplication = number_1 * number_2 ;
          
          //---------------------------------------------------
          
          for(i=1; i>=1; i++){
              Multiply_the_number1=number_1 * i;
              
             for(j=1; j>=1; j++){
                 Multiply_the_number2=number_2 * j;  
              
              if( Multiply_the_number1 == Multiply_the_number2 ){
                  
                  BMM = multiplication / Multiply_the_number1 ;
                  
                  System.out.println(" The largest divisor is common : "+BMM);

              }  
           } 
             break;
        }
          
     } 
} // The end

