/*team17.Quiz2.Q5
Salari & Sh'abani
@Author : Salari
This program calculate 40 prime numbers and sort it by 5 rows & 8 columns.*/
package team17.Quiz2;

import java.util.Scanner;

public class Q5 {
        public static void main (String[] args) {
        Scanner input=new Scanner (System.in);
        //declarations...
        int column=0;
        int c=0; //Step counter
        int i=2,j=1;
        //This for() loop is for detecing and counting forty prime numbers.
        for (i=2;i<=200;i++) {
            for (j=1;j<=i;j++) {
                if (i%j==0) {
                    c++ ;
                }
            }
            if (c==2) {
                System.out.print(i+"   ");
                column++ ;
                //This term sort eight columns and after that change to new line...
                if (column%8==0) {
                    System.out.println();
                }//this if() check the condition of 8 column in 1 row.
            }
            //reset step
            c=0 ;   
            //This if() control columns...
            if (column==40) {
                break ;
            }//this if() check the condition of the 40 numbers displayed in the output.
        }//end of 1st for() loop.
    }//end of main() method 
}//end of Class