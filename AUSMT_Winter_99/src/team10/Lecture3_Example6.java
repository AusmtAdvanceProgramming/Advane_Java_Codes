/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team10;

/**
 *
 * @author Yaran
 */
import java.util.Scanner;

public class Lecture3_Example6 {

    public static void Lecture3_Example6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int) (Math.random() * 1000);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = scanner.nextInt();
        int lotteryDigit1, lotteryDigit2, lotteryDigit3;
        int guessDigit1, guessDigit2, guessDigit3;
        
        lotteryDigit1 = lottery / 100;
        lotteryDigit2 = (lottery % 100) / 10;
        lotteryDigit3 = lottery % 10;

        guessDigit1 = guess / 100;
        guessDigit2 = (guess % 100) / 10;
        guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win 100,000");
            return;
        }


        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2) {
            System.out.println("Match all digits: you win 80,000");
            return;
        }
        if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1) {
            System.out.println("Match all digits: you win 80,000");
            return;
        }
        if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3) {
            System.out.println("Match all digits: you win 80,000");
            return;
        }
        if (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2) {
            System.out.println("Match all digits: you win 80,000");
            return;
        }
        if (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1) {
            System.out.println("Match all digits: you win 80,000");
            return;
        }


        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2 && lotteryDigit3 != guessDigit3) {
            System.out.println("Match two digits: you win 50,000");
            return;
        }
        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 != guessDigit2 && lotteryDigit3 == guessDigit3) {
            System.out.println("Match two digits: you win 50,000");
            return;
        }
        if (lotteryDigit1 != guessDigit1 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit3) {
            System.out.println("Match two digits: you win 50,000");
            return;
        }


        if (guessDigit1 != lotteryDigit1 && guessDigit1 != lotteryDigit2 && guessDigit1 != lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit1 != lotteryDigit1 && guessDigit1 != lotteryDigit2 && guessDigit1 != lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit1 != lotteryDigit1 && guessDigit1 != lotteryDigit2 && guessDigit1 != lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit1 != lotteryDigit1 && guessDigit1 != lotteryDigit2 && guessDigit1 != lotteryDigit3 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit1 != lotteryDigit1 && guessDigit1 != lotteryDigit2 && guessDigit1 != lotteryDigit3 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit2 != lotteryDigit1 && guessDigit2 != lotteryDigit2 && guessDigit2 != lotteryDigit3 && guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit2) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit2 != lotteryDigit1 && guessDigit2 != lotteryDigit2 && guessDigit2 != lotteryDigit3 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit2 != lotteryDigit1 && guessDigit2 != lotteryDigit2 && guessDigit2 != lotteryDigit3 && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit2 != lotteryDigit1 && guessDigit2 != lotteryDigit2 && guessDigit2 != lotteryDigit3 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit2 != lotteryDigit1 && guessDigit2 != lotteryDigit2 && guessDigit2 != lotteryDigit3 && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit2) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit3 != lotteryDigit1 && guessDigit3 != lotteryDigit2 && guessDigit3 != lotteryDigit3 && guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit3 != lotteryDigit1 && guessDigit3 != lotteryDigit2 && guessDigit3 != lotteryDigit3 && guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit3 != lotteryDigit1 && guessDigit3 != lotteryDigit2 && guessDigit3 != lotteryDigit3 && guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit3 != lotteryDigit1 && guessDigit3 != lotteryDigit2 && guessDigit3 != lotteryDigit3 && guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }
        if (guessDigit3 != lotteryDigit1 && guessDigit3 != lotteryDigit2 && guessDigit3 != lotteryDigit3 && guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2) {
            System.out.println("Match two digits: you win 10,000");
            return;
        }

        if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) {
            System.out.println("Match one digit: you win 500");
            return;
        }
        if (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) {
            System.out.println("Match one digit: you win 500");
            return;
        }
        if (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: you win 500");
            return;
        }
        System.out.println("Sorry, no match");

    }
}
