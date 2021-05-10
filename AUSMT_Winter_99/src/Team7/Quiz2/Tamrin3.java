/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz2;


import java.util.Scanner;

public class Tamrin3 {

    public static void main(String[] args) {
        
        double amountOfMoney = 0, amountOfProfit = 0;
        int year = 0;
        double profit = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the amount of your money: ");
        amountOfMoney = input.nextDouble();
        
        double doubleOfMoney = amountOfMoney * 2;
        
        System.out.println("Enter the amount of profit rate(example= 0.50): ");
        amountOfProfit = input.nextDouble();
        
        while (amountOfMoney <= doubleOfMoney) {
            profit = (amountOfMoney * amountOfProfit);
            amountOfMoney =  amountOfMoney + profit;
            year++;
        }
    System.out.println(  "   " + year);
    }
    
}
