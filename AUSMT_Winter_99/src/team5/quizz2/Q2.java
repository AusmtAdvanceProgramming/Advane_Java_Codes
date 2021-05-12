/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quizz2;
import java.util.Scanner;

/**
 * 
 *
 * @author mohammdreza movaheadniya & Ashkan rasuli
 */
public class Q2 {
        
    public static void main(String[] args){
    Scanner input=new Scanner (System.in) ;
        //
        int num1 ;
        int num2 ;
        int digit1 ;
        int digit2 ;
        int tempo1=0 ;
        int tempo2=0;
        int GCD = 0 ;
        int i,j;
        //
        System.out.print ("enter your first number  : ") ;
        num1=input.nextInt () ;
        System.out.print ("enter your second number  : ") ;
        num2=input.nextInt () ;
        //        
           if (num1>num2) {
            digit1=num1 ;
            digit2=num2 ;
        }
        else {
            digit1=num2 ;
            digit2=num1 ;            
        }
        //
                for (i=1;i<=digit1;i++) {//start for 1
            if (digit1%i==0) {// start if 1
                tempo1=i ;
            }//end if 1
            for (j=1;j<=digit2;j++) {//start for 2
                if (digit2%j==0) {//start if 2
                    tempo2=j ;
                    if (tempo1==tempo2) {// start if 3
                        GCD=tempo2;
                    }//end of if 3
                }//end of if 2
            }//end of for 2
        }//end of for 1
        System.out.println ("The GCD of "+digit1+" and "+digit2+" is : "+GCD) ;

    }//end of main() method
}//end of class
