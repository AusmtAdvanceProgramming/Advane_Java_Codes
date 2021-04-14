/*
 * To Exchange this license header, choose License Headers in Project Properties.
 * To Exchange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz1;
    
    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                double price;
        int selection;
        int Exchange1 = 50000;
        int Exchange2 = 10000;
        int Exchange3 = 5000;
        int Exchange4 = 2000;
        int Exchange5 = 1000;
        int Exchange6 = 500;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enetr your price, make it less than 100,000 tomans:");
        
        price = input.nextDouble();
        
        System.out.println("Choose the Exchange you want enter 1 for 50000\n"
                + "2 for 10000 , 3 for 5000 ,4 for 2000 , 5 for 1000 and 6 for 500");
        
        selection = input.nextInt();
        
        if (selection == 1){
            
            price =(price / Exchange1);
            System.out.println("your number of Exchange in 50000 is " + price);   
        }
        
        if (selection == 2){
            price /= Exchange2;
            System.out.println("Your number of Exchange in 10,000 tomans is " + price );
        }
        
        if (selection == 3){
             price /= Exchange3;
            System.out.println("Your number of Exchange in 5000 tomans is " + price );
        }
        
        if (selection == 4){
             price /= Exchange4;
            System.out.println("Your number of Exchange in 2000 tomans is " + price );
        }
        
        if (selection == 5){
            price /= Exchange5;
            System.out.println("Your number of Exchange in 1000 tomans is " + price );
        }
        
        if (selection == 6){
            price /= Exchange6;
            System.out.println("Your number of Exchange in 500 tomans is " + price );
        }
        // TODO code application logic here
    }
}
