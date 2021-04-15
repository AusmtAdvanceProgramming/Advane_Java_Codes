import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // get lottery number
        System.out.println("Enter number of your lottery :(three digit)");
        Scanner input = new Scanner(System.in);
        int your_lottery_number = input.nextInt();
        int _digit_1 = your_lottery_number % 10;
            int _digit_2 = (your_lottery_number % 100) / 10;
                int _digit_3 = your_lottery_number / 100;
        // craete lottery number
        int main_lottery_number = (int) (Math.random() * 1000);
        int digit_1 = main_lottery_number % 10;
            int digit_2 = (main_lottery_number % 100) / 10;
                int digit_3 = main_lottery_number / 100;
        // check out the lottery number
        if (_digit_1 == digit_1) {
            if (_digit_2 == digit_3) {
                if (_digit_3 == digit_2) {
                    System.out.println("your prize is 80,000");
                }
                else {
                    System.out.println("your prize is 10,000");
                }
            }
            else if (_digit_2 == digit_2) {
                if (_digit_3 == digit_3) {
                    System.out.println("your prize is 100,000");
                }
                else {
                    System.out.println("your prize is 50,000");
                }
            }
            else {
                if (_digit_3 == digit_2) {
                    System.out.println("your prize is 10,000");
                }
                else if (_digit_3 == digit_3) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prize is 500");
                }
            }
        }
        else if (_digit_1 == digit_2) {
            if (_digit_2 == digit_1) {
                if (_digit_3 == digit_3) {
                    System.out.println("your prize is 80,000");
                }
                else {
                    System.out.println("your prize is 10,000");
                }
            }
            else if (_digit_2 == digit_3) {
                if (_digit_3 == digit_1) {
                    System.out.println("your prize is 80,000");
                }
                else {
                    System.out.println("your prize is 10,000");
                }
            }
            else {
                if (_digit_3 == digit_3) {
                    System.out.println("your prize is 10,000");
                }
                else if (_digit_3 == digit_1) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prise is 500");
                }
            }
        }
        else if (_digit_1 == digit_3) {
            if (_digit_2 == digit_1) {
                if (_digit_3 == digit_2) {
                    System.out.println("your prize is 80,000");
                }
                else {
                    System.out.println("your prize is 10,000");
                }
            }
            else if (_digit_2 == digit_2) {
                if (_digit_3 == digit_1) {
                    System.out.println("your prize is 80,000");
                }
                else {
                    System.out.println("your prize is 10,000");
                }
            }
            else {
                if (_digit_3 == digit_2) {
                    System.out.println("your prize is 10,000");
                }
                else if (_digit_3 == digit_1) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prize is 500");
                }
            }
        }
        else {
            if (_digit_2 == digit_2) {
                if (_digit_3 == digit_3) {
                    System.out.println("your prize is 50,000");
                }
                else if (_digit_3 == digit_1) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prize is 500");
                }
            }
            else if (_digit_2 == digit_3) {
                if (_digit_3 == digit_2) {
                    System.out.println("your prize is 10,000");
                }
                else if (_digit_3 == digit_1) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prize is 500");
                }
            }
            else if (_digit_2 == digit_1) {
                if (_digit_3 == digit_1) {
                    System.out.println("your prize is 10,000");
                }
                else if (_digit_3 == digit_3) {
                    System.out.println("your prize is 10,000");
                }
                else {
                    System.out.println("your prize is 500");
                }
            }
            else {
                if (_digit_3 == digit_1) {
                    System.out.println("your prize is 500");
                }
                else if (_digit_3 == digit_2) {
                    System.out.println("your prize is 500");
                }
                else if (_digit_3 == digit_3) {
                    System.out.println("your prize is 500");
                }
                else {
                    System.out.println("you lose");
                }
            }
        }
        System.out.println("lottery number is " + main_lottery_number);
    } 
}   
