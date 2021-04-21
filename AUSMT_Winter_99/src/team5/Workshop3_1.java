/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;
import java.util.Scanner;
/**
 *
 * @author mohammdreza
 */
public class Workshop3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guess=-1;
        int number;
        Scanner input=new Scanner(System.in);
        number=(int)(Math.random()*101);
        System.out.println(" pleas guess anumber between 0 and 100 " );
        System.out.print(" what is your first guess?");
        
        for(int counter=0;counter<=3;++counter){
        System.out.println(" enter your guess");
          guess=input.nextInt();
          if (number==guess)
          System.out.println(" your guess is ture");
          else if (guess<number)
          System.out.println (" your guess is low, ") ;     
           else if(guess>number)
           System.out.println(" your guess is high ,")   ;                               }
    }
        
        
        
        
        
   
 
               
               
}
