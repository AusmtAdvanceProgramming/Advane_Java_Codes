/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_13.quiz1;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Q4 {
    
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the amount of money. ");
      
      int money = input.nextInt();
      
     
      int numberOfFiftyThousand = getNumber(money, 50000);
      money = remnantOfMoney(money, 50000);
      
      int numberOfTenThousand = getNumber(money , 10000);
      money = remnantOfMoney(money , 10000);
       
      int numberOfFiveThousand = getNumber(money , 5000);
      money = remnantOfMoney(money , 5000);
      
      int numberOfTwoThousand = getNumber(money , 2000);
      money = remnantOfMoney(money , 2000);
       
        
      int numberOfOneThousand = getNumber(money , 1000);
      money = remnantOfMoney(money , 1000);
      
      int numberOfFiveHundred = getNumber(money , 500);
      money = remnantOfMoney(money , 500);
       
     System.out.print("\nNumber of 50000:" + numberOfFiftyThousand + "\nNumber of 10000:" + numberOfTenThousand +"\nNumber of 5000:" + numberOfFiveThousand + "\nNumber of 2000 :" + numberOfTwoThousand + " \nNumber of 1000:" + numberOfOneThousand + " \n Number of 500:" + numberOfFiveHundred);
     System.out.println("\n How much is left :"+(money));
     
    }
    
public static int getNumber(int money , int num){
    int count = 0;
    
            while(money>= num){
                money -= num;
                count++ ;
            }
   return count;
}

   public static int remnantOfMoney(int money, int a){
    
    return money%a;
    
    }//end of main() method
    
}//end of class
