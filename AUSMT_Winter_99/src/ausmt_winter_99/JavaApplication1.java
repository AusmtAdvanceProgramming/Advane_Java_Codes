package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double average;
        
        System.out.print("please enter first number");
        number1 = input.nextDouble();
        
        System.out.print("please enter second number");
        number2 = input.nextDouble();
        
        System.out.print("please enter third number");
        number3 = input.nextDouble();
        
        average = (number1 + number2 + number3 ) / 3;
        
        System.out.println("For these three [" + number1 + ", " + number2 + ", " + number3 + "] numbers the average is " + average);
        // TODO code application logic here
    } //end of main() methon
    
}