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

public class Q1 {
     public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        int N1 ;
        int N2 ;
        int C1 ;
        int C2 ;
        int T1=0 ;
        int T2=0 ;
        int gcd=0 ;
        int a=1 , b=1 ;
        
        System.out.println ("**********************************") ;
        System.out.print ("vared konid \" Avalin ADaD \" ra lotfan : ") ;
        N1=input.nextInt () ;
        System.out.print ("vared konid \" Dovomin ADaD \" ra lotfan : ") ;
        N2=input.nextInt () ;
        System.out.println ("------------") ;
        
        if (N1>N2) {
            C1=N1 ;
            C2=N2 ;
        }
        else {
            C1=N2 ;
            C2=N1 ;            
        }
        
        for (a=1;a<=C1;a++) {
            if (C1%a==0) {
                T1=a ;
            }
            for (b=1;b<=C2;b++) {
                if (C2%b==0) {
                    T2=b ;
                    if (T1==T2) {
                        gcd=b ;
                    }
                }
            }
        }
       
        System.out.println ("B.M.M  ADaD \""+C1+"\" va \""+C2+"\" hast : "+gcd) ;
        System.out.println ("*******************************") ;
    }
}