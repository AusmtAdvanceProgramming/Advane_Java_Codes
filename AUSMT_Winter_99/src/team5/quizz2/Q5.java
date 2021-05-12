/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quizz2;
import java.util.Scanner;
/**
 *
 * @author mohammdreza&ashkan rasuli 
 */
public class Q5 {
    
    public static void main(String[] args){
    
    
      Scanner input=new Scanner (System.in) ;
        //***
        int flag=0 ;
        int counter=0 ;
        int i=1 , j=1 ;
        //***
        for (i=1;i<=5000;i++) {//start for 1
            for (j=1;j<=i;j++) {//start for 2
                if (i%j==0) {
                    counter++ ;
                }//end of if
            }//end of for 2
            //***
            if (counter==2) {//start if 1
                System.out.print (i+" ") ;
                flag++ ;
                //***
                if (flag%8==0) {//start  if 2
                    System.out.println () ;
                }// end of if 2
            }// end of if 1
            //***
            counter=0 ;   
            //***
            if (flag==40) {
                break;
            }//end of if
        }// end of for 1         
    }//end of main() method
       
}//end of class
