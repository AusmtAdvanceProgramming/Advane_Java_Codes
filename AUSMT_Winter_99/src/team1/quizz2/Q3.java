/*
 Haniyeh Hadiyan - Hossein Rahi
*/
package team1.quizz2;

import java.util.Scanner;

public class Q3 {
    
        public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
    
        double your_money , years , gain , fix_years , month;
        
        //-----------------------------------------
   
        System.out.print(" Enter the amount of your money: ");
        your_money = input.nextDouble();
        
        System.out.print(" It is your profit: ");
        gain = input.nextDouble();
        
        //----------------------------------------
        
        gain = 1 + (gain / 100);
        
        years = (int)((Math.log(2)) / (Math.log(gain)) * 10) / 10.0 ;
        
        System.out.print(years);
        
        fix_years = (int)years;
        
        month = (int)((fix_years-years)*10 ) ;
        
        month =(int)((month*12)/10);
        
        System.out.print("After" + fix_years + " year and" +month+ "month, your money doubles");
        
        
        
    
   }
} //The end

