/*team17.Quiz1.Q3
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int price;
        //Getting Price from user...
        Scanner input=new Scanner(System.in);
        System.out.println("Ener your price! (<100,000 $)");
        price = input.nextInt();
        //Calaculating...
        int a = price / 50000;
        int b = price / 10000;
        int c = price / 5000;
        int d = price / 2000;
        int e = price / 1000;
        int f = price / 500;
        //Show results!...
        System.out.println("Your money is made up of ...");
        System.out.println(a+" X 50,000 $");
        System.out.println(b+" X 10,000 $");
        System.out.println(c+" X 5,000 $");
        System.out.println(d+" X 2,000 $");
        System.out.println(e+" X 1,000 $");
        System.out.println(f+" X 500 $");  
        }//end of main() method 
    
}//end of Class
