import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get coordinates dots
        System.out.println("Enter your Coordinates dot A:(exampele (2,3) -> 23)");
        Scanner input = new Scanner(System.in);
        int coordinates_a = input.nextInt();
        System.out.println("Enter your coordinates dot B:");
        int coordinates_b = input.nextInt();
        System.out.println("Enter your coordinates dot C:");
        int coordinates_c = input.nextInt();
        // craet coordinates dots
        int x_coordinates_a = coordinates_a / 10, y_coordinates_a = coordinates_a % 10;
        int x_coordinates_b = coordinates_b / 10, y_coordinates_b = coordinates_b % 10;
        int x_coordinates_c = coordinates_c / 10, y_coordinates_c = coordinates_c % 10;
        // check out the triangle
        double length_ab = Math.sqrt(Math.pow(x_coordinates_b - x_coordinates_a, 2) + Math.pow(y_coordinates_b - y_coordinates_a, 2));
        double length_ac = Math.sqrt(Math.pow(x_coordinates_c - x_coordinates_a, 2) + Math.pow(y_coordinates_c - y_coordinates_a, 2));
        double length_bc = Math.sqrt(Math.pow(x_coordinates_c - x_coordinates_b, 2) + Math.pow(y_coordinates_c - y_coordinates_b, 2));
        if (length_ab == length_ac) {
            if (length_ab == length_bc) {
                System.out.println("The triangle is motasavi alazla");
            }
            else {
                System.out.println("The triangle is motasavi saghein");
            }
        }
        else if (length_ab == length_bc) {
            System.out.println("The triangle is motasavi saghein");
        }
        else if (length_ac == length_bc) {
            System.out.println("The triangle is motasavi saghein");
        }
        else {
            System.out.println("The triangle is na monazam");
        }
    }
}
