package example0.team17;

/*@authors Seyed Ali Salari & M.reza Shabani
Student number:  951606020 example6*/
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        int numberOfYears;
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double loanAmount;
        double totalPayment;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your desire annual rate (eg. 4.5):");
        annualInterestRate = input.nextDouble();
        
        System.out.print("Please enter number of years as an integer: ");
        numberOfYears = input.nextInt();
        
        System.out.print("Please enter your desire loan amount:");
        loanAmount = input.nextDouble();
        
        monthlyInterestRate = annualInterestRate /1200;
        monthlyPayment = loanAmount * monthlyInterestRate / (1-1/Math.pow(1+ monthlyInterestRate, numberOfYears * 12));
        totalPayment = monthlyPayment * numberOfYears * 12;
        
        System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int) (totalPayment * 100) / 100.0);        
    }//end of main() method
    
}//end of Class
