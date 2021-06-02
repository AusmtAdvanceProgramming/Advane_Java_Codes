/*team17.Quiz3.Q1
Salari & Sh'abani
@Author : Salari
This program Minimum , Maximum , and Sum of entrance values.*/
package team17.Quiz3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        //declaration...
        double min = 0;
        double max = 0;
        double sum = 0;
        double number;
        int start = 1;
        Scanner input = new Scanner(System.in);
       System.out.println("To start enter \" -1 \" and to stop program enter \" -2 \": ");
             start = input.nextInt();
        if(start ==-1){

         System.out.println("Enter your number:");
            number = input.nextDouble();
            max = number;
            sum += number;
            min = number;


        while(start != -2 && start==-1){

            System.out.println("To continue enter \" -1 \" and to stop program enter \" -2 \": ");
             start = input.nextInt();
            if(start == -1){

            System.out.println("Please enter your desired number: ");
            number = input.nextDouble();
            sum += number;
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }

            }
        }
        //Show results...
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
        System.out.println("Sum of values is: " + sum);
        }
    else
        {
            System.out.println("You have no entered any value! ");
        }//end of main() method
        
    }//end of Class
        
}