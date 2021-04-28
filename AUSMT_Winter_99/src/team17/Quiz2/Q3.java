/*team17.Quiz2.Q3
Salari & Sh'abani
@Author : Salari
This program calculate the compound interest of trustfund*/
package team17.Quiz2;

import java.util.Scanner;

public class Q3 {
        public static void main (String[] args) {
        Scanner input=new Scanner (System.in);
        //declarations...
        double trustfund;
        double benefit;  
        double sum;  //Double trust_fund
        double more;
        int yr=0 ;   //Year of double trust_fund
        //This term get variables from user...
        System.out.print ("Please enter your trust_fund ===> $ : ");
        trustfund=input.nextDouble ();
        System.out.print ("Please enter your benefit (percent=%): ");
        benefit=input.nextDouble ();
        //(real double) trust_fund condition formula.
        sum=trustfund*2 ;
        //Check double trust_fund condition...
        while (trustfund<sum) {
            trustfund=trustfund+((trustfund*benefit)/100) ;
            yr++ ;
        }
        //This term calaculate diffrence between double(estimate) and real double
        more=trustfund-sum;
        System.out.println ("At last in  \""+yr+"\" years your trust_fund will be double and you have \""+more+"\" $  more than your double trust_fund") ;
    }//end of main() method
}//end of Class