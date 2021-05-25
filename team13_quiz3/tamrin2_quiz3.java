
import java.util.Scanner;

public class tamrin2_quiz3 {
    public static void main(String[] args) throws Exception {
        // get decimal number
        System.out.println("Enter your hex number :");
        Scanner scan = new Scanner(System.in);
        String hex_number = scan.next();
        // ferst_test the decimal number
        int test = test_hex_number(hex_number);
        // convert decimal to hex number & show hex number
        if (test == hex_number.length()) {
           convert_hex_to_dec(hex_number); 
        }
        else {
            System.out.println(" << system error >> ");
        }
    }
    // metod is testing the hex number
    public static int test_hex_number (String hex_number) {
        int test = 0;
        for (int i = 0; i < hex_number.length(); i++) {
            if (65 <= (int) hex_number.charAt(i) && (int) hex_number.charAt(i) <= 70) {
                test++;
            }
            else if (97 <= (int) hex_number.charAt(i) && (int) hex_number.charAt(i) <= 102) {
                test++;
            }
            else if (49 <= (int) hex_number.charAt(i) && (int) hex_number.charAt(i) <= 57) {
                test++;
            }
        }
        return test;
    }
    // metod is converting hex to decimal number
    public static void convert_hex_to_dec (String hex_number) {
        int decimal_number = 0;
            for (int b = 0; b  < hex_number.length(); b++){
                switch (hex_number.charAt(b)) {
                    case '0' :
                        decimal_number += 0 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '1' :
                        decimal_number += 1 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '2' :
                        decimal_number += 2 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '3' :
                        decimal_number += 3 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '4' :
                        decimal_number += 4 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '5' :
                        decimal_number += 5 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '6' :
                        decimal_number += 6 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '7' :
                        decimal_number += 7 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '8' :
                        decimal_number += 8 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case '9' :
                        decimal_number += 9 * Math.pow(16, hex_number.length() - 1 - b); 
                        break;
                    case 'a' :
                    case 'A' :
                        decimal_number += 10 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case 'b' :
                    case 'B' :
                        decimal_number += 11 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case 'c' :
                    case 'C' :
                        decimal_number += 12 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case 'd' :
                    case 'D' :
                        decimal_number += 13 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case 'e' :
                    case 'E' :
                        decimal_number += 14 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                    case 'f' :
                    case 'F' :
                        decimal_number += 15 * Math.pow(16, hex_number.length() - 1 - b);
                        break;
                }
            }
        System.out.println("0d" + hex_number + " -> 0x" + decimal_number);
    }
}