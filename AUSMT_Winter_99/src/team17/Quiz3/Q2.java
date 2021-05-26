/*team17.Quiz3.Q2
Salari & Sh'abani
@Author : Salari
This program convert numbers from "Hexadecimal" to "Decimal"*/
package team17.Quiz3;

import java.util.Scanner;

public class Q2 {
    //Function to convert hexadecimal to decimal
    public static int hex2dec(String hexVal) {
        int len = hexVal.length();
        //initializing base value to 1, i.e 16^0
        int base = 1;
        int decVal = 0;
        //Extracting characters as digiits from last character.
        for (int i = len -1; i >= 0; i--) {
            /*if character lies in '0'-'9', converting it to
            integral 0-9 by subtracting 48 from ASCII value.
            */
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
                decVal += (hexVal.charAt(i) - 48) * base;
                //incrementing base by power.
                base = base * 16;                
            }
            /*if character lies in 'A'-'F', converting it to
            integral 10-15 by subtracting 55 from ASCII value.
            */
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') {
                decVal += (hexVal.charAt(i) - 55) * base;
                //incrementing base by power.
                base = base * 16;
            }
            else {
                //this for() loop is for preventing iteration of display input error.
                /*int counter = 0;
                for (int j = 0; j < i; j++){
                    counter++;
                }
                if (counter == 0) {  
                }*/
                return -1;
            }
        }//end of for() loop
        return decVal;
    }//end of hex2dec(String hexVal) function
    //driver program
    public static void main(String[] args) {
        System.out.println("Please enter your desired Hexadecimal value: ");
        Scanner input = new Scanner(System.in);
        String hexNum = input.nextLine();
        hexNum = hexNum.trim();
        hexNum = hexNum.toUpperCase();
        int decimal = hex2dec(hexNum);
        if (decimal < 0) {
        System.out.println("You entered invalid value! ");
        }
        else {
        System.out.println("Your entrance number on the basis of \"Decimal\" is equal to: "+decimal);
        }
    }//end of main() method
}//end of Class