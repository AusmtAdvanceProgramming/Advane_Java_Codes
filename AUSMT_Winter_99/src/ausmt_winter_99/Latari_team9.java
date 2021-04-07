/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9;

/**
 *@author Ali asghar ranjbar
 *@author Zeynab karimi zad
 */

import java.util.Scanner ;
//*
public class Latari_team9 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        int code ;
        int codeDigit1 , codeDigit2 , codeDigit3 ;
        int lottery = (int) (Math.random ()*1000) ;
        int lotteryDigit1 , lotteryDigit2 , lotteryDigit3 ;
        //*
        System.out.println ("_______") ;
        System.out.print ("Enter your \"Lottery Code\" please (Three Digits) : ") ;
        code=input.nextInt () ;
        System.out.println ("____") ;
        System.out.println ("The \"Lottery Number\" is : "+lottery) ;
        System.out.println ("Your \"Lottery Code\" is : "+code) ;
        System.out.println ("____") ;
        //*
        codeDigit1=code/100 ;
        codeDigit2=((code%100)/10) ;
        codeDigit3=code%10 ;
        lotteryDigit1=lottery/100 ;
        lotteryDigit2=((lottery%100)/10) ;
        lotteryDigit3=lottery%10 ;
        //*
        if (code==lottery) {
            System.out.println ("Exact Match : You Win $100,000") ;
        }
        else if (((codeDigit1==lotteryDigit2)||(codeDigit1==lotteryDigit3))&&((codeDigit2==lotteryDigit1)||(codeDigit2==lotteryDigit3))&&((codeDigit3==lotteryDigit1)||(codeDigit3==lotteryDigit2))) {
            System.out.println ("Match All Digits : You Win $80,000") ;
        }
        else if (((codeDigit1==lotteryDigit1)&&(codeDigit2==lotteryDigit2))||((codeDigit1==lotteryDigit1)&&(codeDigit3==lotteryDigit3))||((codeDigit2==lotteryDigit2)&&(codeDigit3==lotteryDigit3))) {
            System.out.println ("Match Two Digits With Correct Order : You Win $50,000") ;
        }
        else if (((codeDigit3==lotteryDigit1)&&(codeDigit2==lotteryDigit3))||((codeDigit3==lotteryDigit2)&&(codeDigit1==lotteryDigit3))||((codeDigit1==lotteryDigit2)&&(codeDigit2==lotteryDigit1))) {
            System.out.println ("Match Two Digits Without Correct Order : You Win $10,000") ;
        }
        else if ((codeDigit1==lotteryDigit1)||(codeDigit1==lotteryDigit2)||(codeDigit1==lotteryDigit3)||(codeDigit2==lotteryDigit1)||(codeDigit2==lotteryDigit2)||(codeDigit2==lotteryDigit3)||(codeDigit3==lotteryDigit1)||(codeDigit3==lotteryDigit2)||(codeDigit3==lotteryDigit3)) {
            System.out.println ("Match One Digit : You Win $500") ;
        }
        else {
            System.out.println ("Sorry , No Match") ;
        }
        System.out.println ("________") ;
    }   
}