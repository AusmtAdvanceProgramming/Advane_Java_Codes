package team17;

import java.util.Scanner;

/*team17.Workshop3_1
Salari & Sh'abani
@Author : Salari*/

public class Workshop3_1 {
        public static void main(String[] args) {
            
        int guess=-1;
        int number;
        
        number=(int)(Math.random()*101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number between include 0 and 100(you have 3 chances!).");
        System.out.print("What is your first guess?");
        
        for(int i=0;i<3;i++){
                guess=input.nextInt();
                if(guess==number){
                    System.out.printf("Congradulation, The number is %d \n", guess);                   
                }else if (guess<number){
                    System.out.print("Your guess is too low, your new guess? ");
                }else if (guess>number){
                    System.out.print("Your guess is too high, Your new guess? ");
                }
            
        }//end of counter for.
        
    }//end of main() method 
    
}//end of Class
    

