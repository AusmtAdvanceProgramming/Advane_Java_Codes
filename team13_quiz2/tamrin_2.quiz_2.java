/* team 13
*  quiz 2
*  parvin akbari
*  amir hosein abdolahi
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num_1, num_2, d;
        Scanner input = new Scanner(System.in);
        System.out.println("num 1");
        num_1 = input.nextInt();
        System.out.println("num_2");
        num_2 = input.nextInt();
        if (num_1 < num_2) {
            d = num_1;
        }
        else {
            d = num_2;
        }
        while ((num_1 % d != 0) || (num_2 % d != 0)) {
            d--;
        }
        System.out.println(d);
    }
}
