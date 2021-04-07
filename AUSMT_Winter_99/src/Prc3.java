/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc3;
import java.util.Scanner;
/* mohamad mehdi esmaili */
/**
 *
 * @author moham
 */
public class Prc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double farenheit;
double celsius;
        
  
Scanner input = new Scanner(System.in); 
        
System.out.print ("please enter a degree in farenheit: ");
farenheit = input.nextDouble();
        
celsius = (5.0 / 9) * (farenheit - 32);

System.out.println("degree in " + farenheit + " farenheit is equal to " +
celsius + " celsius");
        // TODO code application logic here
    }
    
}
