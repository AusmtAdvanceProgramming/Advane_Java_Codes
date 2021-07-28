
package Team14 ;

import team14.*;
import java.util.Scanner ;
//***
public class Workshop3_1 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        int value ;
        int guess = -1 ;
        int counter = 1 ;
        //***
        value=(int)(Math.random ()*101) ;
        //***
        System.out.println ("____________________") ;
        System.out.println ("Please guess the number") ;
        System.out.println ("__________") ;
        System.out.println ("Pay attention : You have only three chances to guess") ;
        //***
        while (counter<=3) {
            System.out.println ("__________") ;
            System.out.print("Enter your guess please : ") ;
            guess=input.nextInt () ;
            System.out.println ("__________") ;
            //***
            if (value==guess) {
                System.out.println ("Congratulations , you guessed right") ; 
            }
            else if (value<guess) {
                System.out.println ("Your guess is more than the value") ;
            }
            else if (value>guess) {
                System.out.println ("Your guess is less than the value") ;
            }
            //***
            counter++;      
        }
        System.out.println ("__________") ;
        System.out.println ("Your guess count is over and the value was : "+value) ;
        System.out.println ("____________________") ;
    }
}