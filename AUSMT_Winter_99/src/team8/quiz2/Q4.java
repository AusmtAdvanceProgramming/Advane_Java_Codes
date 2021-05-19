/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Q4.java
 */
package team8.quiz2 ;
/**
 */
import java.util.Scanner ;
//***
public class Q4 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        int flag=0 ;
        int counter=0 ;
        int i=1 , j=1 ;
        //***
        for (i=1;i<=1000;i++) {
            for (j=1;j<=i;j++) {
                if (i%j==0) {
                    counter++ ;
                }
            }
            //***
            if (counter==2) {
                System.out.print (i+" ") ;
                flag++ ;
                //***
                if (flag%8==0) {
                    System.out.println () ;
                }
            }
            //***
            counter=0 ;   
            //***
            if (flag==40) {
                break ;
            }
        }
    }
}