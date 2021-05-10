/*team17.Quiz2.Q2
Salari & Sh'abani
@Author : Salari
This program displays the Greater Common Divisor and Least Common Multiple.*/
package team17.Quiz2;

import java.util.Scanner;

public class Q2 {
        public static void main (String[] args) {
        Scanner input=new Scanner (System.in);
        //declarations...
        int num1,num2;
        int c1,c2;
        int k1=0,k2=0;
        int LCM,GCD=0;
        int i=1,j=1;
        //This term gets two numbers from user...
        System.out.print ("Please enter your desired first number: ");
        num1=input.nextInt();
        System.out.print ("Please enter your desired second number: ");
        num2=input.nextInt();
        //To create GCD algorithm c1=high &  c2=low...
        if (num1>num2) {
            c1=num1;
            c2=num2;
        }//end of 1st if()
        else {
            c1=num2;
            c2=num1;            
        }
        //This for() loop begins from higher to lower number and chek statements...
        for (i=1;i<=c1;i++) {
            if (c1%i==0) {
                k1=i;
            }//end of 2nd if()
            for (j=1;j<=c2;j++) {
                if (c2%j==0) {
                    k2=j;
                    //this if()is a condition for the equality of the k1 & k2. 
                    if (k1==k2) {
                        GCD=j;
                    }//end of 3rd if()
                }//end of 2nd if() 
            }//end of 2nd for()
        }//end of 1st for()
        //Calculates the Least Common Multiple(LCM)...
        LCM=(num1*num2/GCD);
        //This term displays the GCD... 
        System.out.println ("The Greater Common Divisor between \""+c1+"\" and \""+c2+"\" is : "+GCD);
        System.out.println ("The Least Common Multiple between \""+c1+"\" and \""+c2+"\" is : "+LCM);
    }//end of main() method
}//end of Class