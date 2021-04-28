/*team17.Quiz2.Q1
Salari & Sh'abani
@Author : Salari
This program displays the number of characters in entrance string.*/
package team17.Quiz2;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        //This term get string from user...
        System.out.println("Please enter your desired string :");
        Scanner input = new Scanner(System.in);
        int length;
        int i,j,k;
        String str = input.nextLine();
        // extract chars at string
        length= str.length();
        for (i = 0; i < length; i++) {
            //This term counts characters in string...
            int counter1=0;
            for (j = 0; j < length; j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    counter1++;
                }
            }//end of 2nd for()
            // integrates counting...
            int counter2 = 0;
            for (k = 0; k < i; k++) {
                if (str.charAt(i)==str.charAt(k)) {
                    counter2++;
                }
            }//end of 3rd for()
            //This term show output... 
            if (counter2 == 0) {
                System.out.print("The character  "+str.charAt(i)+"  is repeated  ");
                System.out.print(counter1+"  times");
                System.out.print("\n");
            }
        }//end of first for() loop.
    }//end of main() method
}//end of Class