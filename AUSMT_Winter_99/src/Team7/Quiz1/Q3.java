/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.Quiz1;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double money = 0 ;
           double panjah;
           double dah;
           double panj;
           double hezar;
           double ponsad;
           
           Scanner input = new Scanner(System.in);
           
           System.out.print("Enter the amount of money(kamtar az 100000 toman: "); 
           money = input.nextDouble();
           
           panjah = money / 50000;
           dah = money / 10000;
           panj = money / 5000;
           hezar = money / 1000;
           ponsad = money / 500;
           
           System.out.print("pool shoma be panjahi = " + panjah + " be dahi = " + dah +
                   " be panji = " + panj + " be hezar = " + hezar + " be ponsad = " + ponsad);
    }
    
}
