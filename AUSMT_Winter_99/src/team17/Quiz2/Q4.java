/*team17.Quiz2.Q4
Salari & Sh'abani
@Author : Salari
This program convert numbers from "Decimal" to "Hexadecimal"*/
package team17.Quiz2;

import java.util.Scanner;

public class Q4 {
    public static void main (String[] args) {
        System.out.println("Please enter your desired DECIMAL number: ");
        Scanner input=new Scanner (System.in) ;
        //declarations...
        int number;
        int r;
        String hex="";
        number=input.nextInt();
        //Start of decimal to hexadecimal algorithm...
        while (number!=0) {
            r=number%16;
            switch(r) {
            case 10:
                hex='A'+hex;
            break;
            case 11:
                hex='B'+hex;
            break;
            case 12:
                hex='C'+hex;
            break;
            case 13:
                hex='D'+hex;
            break;
            case 14:
                hex='E'+hex;
            break;
            case 15:
                hex='F'+hex;
            break;
            default:
                hex=r+hex;
            }//end of switch() case.
            number=number/16;
        }//end of while().
          System.out.println("Your entrance number on the basis of \"Hexadecimal\" is equal to: "+hex);
    }//end of main() method 
}//end of Class
