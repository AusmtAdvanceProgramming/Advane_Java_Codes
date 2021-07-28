import java.util.Scanner;

/**
 * STACK
 */
public class STACK {

    private int[] list = new int[10];
    private int lenght = 0;
    // 
    public STACK() {}
    // 
    public void PUSH() {
        Scanner scan = new Scanner(System.in);
        lenght++;
        if (lenght > 10) {
            System.out.println("I cant save data more then 10");
        }
        else {
            int number = scan.nextInt();
            list[lenght - 1] = number;
        }
    }
    // 
    public void POP() {
        if (lenght > 0) {
            int number = list[lenght - 1];
            list[lenght - 1] = 0;
            lenght--;
            System.out.println(number);
        }
        else {
            System.out.println("No data to pop");
        }
       
    }
}