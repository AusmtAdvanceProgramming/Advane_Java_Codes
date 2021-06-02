
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class queez4 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        int flag=0 ;
        int cntr=0 ;
        int i=1 , j=1 ;
        //*
        for (i=1;i<=1000;i++) {
            for (j=1;j<=i;j++) {
                if (i%j==0) {
                    cntr++ ;
                }
            }
            //*
            if (cntr==2) {
                System.out.print (i+" ") ;
                flag++ ;
                //*
                if (flag%8==0) {
                    System.out.println () ;
                }
            }
            //*
            cntr=0 ;   
            //*
            if (flag==40) {
                break ;
            }
        }
    }
}
