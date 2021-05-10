/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2.team9;

/**
 *
 * @author ali asghar ranjbar & zeynab karimi zad
 */
import java.util.Scanner ;

public class Q4 {
     public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        int flag=0 ;
        int number=0 ;
        int a=1 , b=1 ;
        
        for (a=1;flag<40;a++) {
            for (b=1;b<=a;b++) {
                if (a%b==0) {
                    number++ ;
                }
            }
            
            if (number==2) {
                System.out.print (a+"\t") ; 
                flag++ ;
                
                if (flag % 8 == 0) {
                    System.out.println () ;
                }
            }
            
            number=0 ;   
           
            }
        }
    }