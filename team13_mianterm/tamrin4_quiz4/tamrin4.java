import java.util.Scanner;

/**
 * tamrin4
 */
public class tamrin4 {

    public static void main(String[] args) {
        // get string to test
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string :");
        String palindromString = scan.next();
        // test string
        int test = 0;
        for (int i = 0; i < (int) (palindromString.length() / 2); i++) {
            if (palindromString.charAt(i) != palindromString.charAt(palindromString.length() - 1 - i)) {
                test++;
            }
        }
        // give the result
        if (test == 0) {
            System.out.println("Your string is a palindrom");
        }
        else {
            System.out.println("Your string is not a palindrom");
        }
    }
}