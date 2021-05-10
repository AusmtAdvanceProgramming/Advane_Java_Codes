/* team 13
*  quiz 2
*  parvin akbari
*  amir hosein abdolahi
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get deposit & profit
        System.out.println("Enter your deposit (toman):");
        Scanner input = new Scanner(System.in);
        int main_deposit = input.nextInt();
        System.out.println("Enter your profit :(per 100)");
        int profit = input.nextInt();
        // calculate the year of profit
        double deposit = main_deposit;
        int year = 0;
        while (deposit < 2 * main_deposit) {
            deposit = deposit + deposit * (profit * 0.01);
            year++;
        }
        // show the result
        System.out.println("years : " + year);
    }
}
