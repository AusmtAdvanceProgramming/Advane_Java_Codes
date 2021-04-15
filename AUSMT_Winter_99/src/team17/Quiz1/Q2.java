/*team17.Quiz1.Q2
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int m,n,yield;
        Scanner input=new Scanner(System.in);
        System.out.println("How many days a week is today?(m=1 => Saturday)");
        m=input.nextInt();
        System.out.println("How many more days do you have?");
        n=input.nextInt();
        //My magic formula!
        yield=((n%7)+m)-1;
        if (yield%7==0) {
           System.out.println("Saturday!");
        }
        else if (yield%7==1) {
           System.out.println("Sunday!"); 
        }
        else if (yield%7==2) {
           System.out.println("Monday!");
        }
        else if (yield%7==3) {
           System.out.println("Tuesday!");
        }
        else if (yield%7==4) {
           System.out.println("Wednesday!");
        }
         else if (yield%7==5) {
           System.out.println("Thursday!");
        }
        else if (yield%7==6) {
           System.out.println("Friday!");
        }
    }//end of main() method 
    
}//end of Class


