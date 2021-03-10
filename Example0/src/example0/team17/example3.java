package example0.team17;

/*@author Seyed Ali Salari & M.reza Shabani
Student number:  951606020 example3*/
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        double farenheit;
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a degree in farenheit:");
        farenheit = input.nextDouble();
        celsius = (5.0/9)*(farenheit-32);
        System.out.println("Degree in"+farenheit+"farenheit is equal to"+celsius+"celsius");
        
    }//end of main() method
    
}//end of Class
