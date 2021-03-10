package team17;

/*@authors Seyed Ali Salari & M.reza Shabani
Student number:  951606020 example5*/
import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        double price, tax, total;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a purchase amount:");
        price = input.nextDouble();
        
        tax = price * 0.09;
        total = price + tax;
        total = (int) (total * 100)/100.0;
        
        System.out.print("Your total payment:"+ total +"Rials.");
        System.out.println(price + " your sale and " + (int) (tax*100)/100.0 + "for taxes");     
    }//end of main() method
    
}//end of Class
