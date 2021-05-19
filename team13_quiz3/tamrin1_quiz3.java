/**
 * tamrin1_quiz3
 */
import java.util.Scanner;

public class tamrin1_quiz3 {

    public static void main (String[] args){
        double sum = 0;    
            double max = 0;
            double min = Double.MAX_VALUE;      
            
                                
            Scanner input = new Scanner(System.in);
            
            while (input.hasNextDouble()){
                double number = input.nextDouble();
            
            
            if (number > max){
                max = number;
            }
                
                if (number < min){
                min = number;
            }      
            
            sum += number;
            }
        System.out.println("maximum is:" + max);
            
        System.out.println("minimum is:" + min);
                
        System.out.println("sum is:" + sum);
    
    }
}