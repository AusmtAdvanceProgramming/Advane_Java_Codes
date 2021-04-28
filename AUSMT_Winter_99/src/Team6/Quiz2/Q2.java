/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz2;

import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        double money;
        double years;
        double profit;
        
        System.out.print("Input primary money: ");
        
        money = input.nextDouble();
        
        System.out.print("Input interest rates: ");

        profit = input.nextDouble();
        
        profit = 1 + (profit / 100);
        
        years = (int)((Math.log(2)) / (Math.log(profit)) * 10) / 10.0 ;
        
        System.out.println(years);        
        
        // TODO code application logic here
    }
}
