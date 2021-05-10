/* team 13
*  quiz 2
*  parvin akbari
*  amir hosein abdolahi
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get decimal
        System.out.println("Enter your decimal number :");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        // convert decimal to hex 
        char[] hexadecimal = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String _hexadecimal_ = "";
        for (int i = 0; i <= decimal; i++) {
            int x = decimal % 16;
            if (x == 0) {
                _hexadecimal_ += '0';
                decimal /= 16;
                decimal += 16;
            }
            else if (x > 0) {
                _hexadecimal_ += hexadecimal[x - 1];
                decimal /= 16;
            }
            else {
                System.out.println("I can\'t negative decimal convert to HEX");
                break;
            }
        }
        // reverc the _hexadecimal_
        String result = "";
        for (int a = _hexadecimal_.length()-1; a >= 0; a--) {
            result += _hexadecimal_.charAt(a);
        }
        // show the hex
        System.out.println(result);
    }
}