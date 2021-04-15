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
        
        Scanner input = new Scanner(System.in); 
        
        int Amount;        
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        
        
        System.out.println("Please enter your Amount, less than 100,000: ");
        
            Amount = input.nextInt();
        
            if (Amount % 50000 == 0){
                Amount /=50000;
                System.out.println(" Exchange in 50000 = " + Amount);  
            }
            else if (Amount % 50000 != 0){
                while (Amount > 50000){
                    Amount -=50000;
                    counter1++;
                }
            System.out.println(" Exchange in 50000 = " + counter1);
            }
        
            if (Amount % 10000 == 0){
                Amount /=10000;
                System.out.println(" Exchange in 10000 = " + Amount);  
            }
            else if (Amount % 10000 != 0){
                while (Amount > 10000){
                   Amount -=10000;
                   counter2++;
                }
            System.out.println(" EXchange in 10000 = " + counter2);
            }
        
        
            if (Amount % 5000 == 0){
                Amount /=5000;
                System.out.println(" Exchange in 5000 = " + Amount);  
            }
            else if (Amount % 5000 != 0){
                while (Amount > 5000){
                    Amount -=5000;
                    counter3++;
                }
            System.out.println(" Exchange in 5000 = " + counter3);
            }
        
            if (Amount % 2000 == 0){
                Amount /=2000;
                System.out.println(" Exchange in 2000 = " + Amount);  
            }
            else if (Amount % 2000 != 0){
                while (Amount > 2000){
                    Amount -=2000;
                    counter4++;
                }
            System.out.println(" Exchange in 2000 = " + counter4);
            }
        
        
        
            if (Amount % 1000 == 0){
                Amount /=1000;
                System.out.println(" Exchange in 1000 = " + Amount);  
            }
            else if (Amount % 1000 != 0){
                while (Amount > 1000){
                    Amount -=1000;
                    counter5++;
                }
            System.out.println(" Exchange in 1000 = " + counter5);
            }
        
        
       
            if (Amount % 500 == 0){
                Amount /=500;
              System.out.println(" Exchange in 500 = " + Amount);  
            }
            else if (Amount % 500 != 0){
                while (Amount > 500){
                    Amount -=500;
                    counter6++;
                }
            System.out.println(" Exchange in 500 = " + counter6);
            }
          
        // TODO code application logic here
    }
}
