import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        STACK exampelStack = new STACK();
        boolean valiu = true;
        while (valiu) {
            System.out.println("Enter your number :(push -> 1, pop -> 2, finish program -> 3)");
            int number = scan.nextInt();
            if (number == 1) {
                exampelStack.PUSH();
            }
            else if (number == 2) {
                exampelStack.POP();
            }
            else if (number == 3) {
                valiu = false;
            }
        }
    }
}