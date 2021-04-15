/*team17.Quiz1.Q3
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz1;

import java.util.Scanner;

public class Q3 {
        public static void main(String[] args) {
        //Declarations...
        double price;    
        int tcash1=0;
        int tcash2=0;
        int tcash3=0;
        int tcash4=0;
        int tcash5=0;
        int tcash6=0;
        //Receive price from user...
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ener your price! (<100,000 $): ");
        
        price = input.nextDouble();
        //This section calculates the number of 50,000$ available in the price. 
           if (price % 50000 == 0){
              price /=50000;
              System.out.println("Your receipt at 50,000$ = " + price);  
           }
           else if (price % 50000 != 0){
            while (price > 50000){
                   price -= 50000;
                   tcash1++;
               }
            System.out.println("Your receipt at 50,000$ = " + tcash1);
           }
        //This section calculates the number of 10,000$ available in the price.
           if (price % 10000 == 0){
              price /= 10000;
              System.out.println("Your receipt at 10,000$ = " + price);  
           }
           else if (price % 10000 != 0){
            while (price > 10000){
                   price -=10000;
                   tcash2++;
               }
            System.out.println("Your receipt at 10,000$ = " + tcash2);
           }
        //This section calculates the number of 5,000$ available in the price.
           if (price % 5000 == 0){
              price /=5000;
              System.out.println("Your receipt at 5,000$ = " + price);  
           }
           else if (price % 5000 != 0){
            while (price > 5000){
                   price -= 5000;
                   tcash3++;
               }
            System.out.println("Your receipt at 5,000$ = " + tcash3);
           }
        //This section calculates the number of 2,000$ available in the price.
           if (price % 2000 == 0){
              price /= 2000;
              System.out.println("Your receipt at 2,000$ = " + price);  
           }
           else if (price % 2000 != 0){
            while (price > 2000){
                   price -= 2000;
                   tcash4++;
               }
            System.out.println("Your receipt at 2,000$ = " + tcash4);
           }
        //This section calculates the number of 1,000$ available in the price.
           if (price % 1000 == 0){
              price /= 1000;
              System.out.println("Your receipt at 1,000$ = " + price);  
           }
           else if (price % 1000 != 0){
            while (price > 1000){
                   price -= 1000;
                   tcash5++;
               }
            System.out.println("Your receipt at 1,000$ = " + tcash5);
           }
        //This section calculates the number of 500$ available in the price.
           if (price % 500 == 0){
              price /= 500;
              System.out.println("Your receipt at 500$ = " + price);  
           }
           else if (price % 500 != 0){
            while (price > 500){
                   price -= 500;
                   tcash6++;
               }
            System.out.println("Your receipt at 500$ = " + tcash6);
           }
        
    }//end of main() method  
    
}//end of Class
