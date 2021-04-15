import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get the value
        System.out.println(" ax + by = c\n dx + ey = f");
        System.out.println("Enter your values :\n a =");
        Scanner input = new Scanner(System.in);
        int a_value = input.nextInt();
        System.out.println(" b =");
        int b_value = input.nextInt();
        System.out.println(" c =");
        int c_value = input.nextInt();
        System.out.println(" d =");
        int d_value = input.nextInt();
        System.out.println(" e =");
        int e_value = input.nextInt();
        System.out.println(" f =");
        int f_value = input.nextInt();
        // calculating
        int value_of_x = (c_value * e_value / (a_value * e_value - b_value * d_value)) - (f_value * b_value / (a_value * e_value - b_value * d_value));
        int value_of_y = (a_value * f_value / (a_value * e_value - b_value * d_value)) - (d_value * c_value / (a_value * e_value - b_value * d_value));
        // show the result
        System.out.println(" x = " + value_of_x + "\n y = " + value_of_y);  
    }
}
