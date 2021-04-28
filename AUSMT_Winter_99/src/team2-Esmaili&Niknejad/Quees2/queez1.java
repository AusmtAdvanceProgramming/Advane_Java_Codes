/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class queez1 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        int num1 ;
        int num2 ;
        int cntr1 ;
        int cntr2 ;
        int tmpo1=0 ;
        int tmpo2=0 ;
        int gcd=0 ;
        int a=1 , b=1 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter your \"First Number\" please : ") ;
        num1=input.nextInt () ;
        System.out.print ("Enter your \"Second Number\" please : ") ;
        num2=input.nextInt () ;
        System.out.println ("____") ;
        //*
        if (num1>num2) {
            cntr1=num1 ;
            cntr2=num2 ;
        }
        else {
            cntr1=num2 ;
            cntr2=num1 ;            
        }
        //*
        for (a=1;a<=cntr1;a++) {
            if (cntr1%a==0) {
                tmpo1=a ;
            }
            for (b=1;b<=cntr2;b++) {
                if (cntr2%b==0) {
                    tmpo2=b ;
                    if (tmpo1==tmpo2) {
                        gcd=b ;
                    }
                }
            }
        }
        //*
        System.out.println ("The Greater Common Divisor of \""+cntr1+"\" and \""+cntr2+"\" is : "+gcd) ;
        System.out.println ("________") ;
    }
}
