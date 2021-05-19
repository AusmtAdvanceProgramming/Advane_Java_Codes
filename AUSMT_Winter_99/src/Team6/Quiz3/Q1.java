
package team6.quiz3;

/**
 * @author Mahdi
 * 
 */
import java.util.Scanner;

//...
public class Q1 {
    public static boolean Test(String Hex1) {
        String test1 = "0123456789ABCDEF";
        int[] test2 = new int[Hex1.length()];
        int counter = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < Hex1.length(); i++) {
            for (j = 0; j < test1.length(); j++) {
                if (Hex1.charAt(i) == test1.charAt(j)) {
                    counter++;
                } 
            } 
        } 
        if ( counter == Hex1.length()) {
            return true;
        } 
        else {
            return false;
        } 
    } 

    public static void Convert(String Hex2) {
        int[] Hex = new int[Hex2.length()];
        int dec = 0;
        int p = 0;
        int m = 0;
        int n = 0;

        for (p = 0; p < Hex2.length(); p++) {
            switch (Hex2.charAt(p)) {
                case 'A':
                    Hex[p] = 10;
                    break;
                case 'B':
                    Hex[p] = 11;
                    break;
                case 'C':
                    Hex[p] = 12;
                    break;
                case 'D':
                    Hex[p] = 13;
                    break;
                case 'E':
                    Hex[p] = 14;
                    break;
                case 'F':
                    Hex[p] = 15;
                    break;
                default:
                    Hex[p] = Character.getNumericValue(Hex2.charAt(p));
                    break;
            } 
        } 

        for (m = Hex.length - 1; m > -1; m--, n++) {
            dec += (Hex[m] * (Math.pow(16, n)));
        } 

        System.out.println("The number \"" + Hex2 + "\" in Hexadecimal base is\"" + dec + "\" in Decimal base");
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hex;
        boolean check;


        System.out.print("Enter your intended Hexadecimal Number: ");
        hex = input.next();

        hex = hex.toUpperCase();
        check = Test(hex);

        if (check) {
            System.out.println("The string is valid");

            Convert(hex);
        } 

        else {
            System.out.println("The entered string is not valid");
        }

    } 
} 