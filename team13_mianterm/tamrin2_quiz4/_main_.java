import java.util.Scanner;

/**
 * _main_
 */
public class _main_ {

    public static void main(String[] args) {
        // get the diagram and number of diagram
        Scanner scan = new Scanner(System.in);
        String[] diagram_array = {"circle", "parallelogram", "rectangle", "square", "trapezius", "triangle"};
        System.out.println("What is your diagram ?");
        // create the array of random numbe 
        for (int i = 0; i < 6; i++) {
            System.out.println(diagram_array[i] + " -> " + (i + 1));
        }
        int diagram = scan.nextInt();
        System.out.println("How many diagram ?");
        int diagram_number = scan.nextInt();
        double[] random_number = new double[5];
        for (int a = 0; a < 5; a++) {
            random_number[a] = ((double) ((int) (Math.random() * 10000))) / 100;
        }
        // give area and perimeter of diagram
        double area = 0;
        double perimeter = 0;
        switch (diagram) {
            case 1 :
                for (int i = 0; i < diagram_number; i++) {
                    circle _Circle_ = new circle(random_number[0]);
                    area += _Circle_.area();
                    perimeter += _Circle_.perimeter();
                    System.out.println("raius : " + random_number[0]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
            case 2 :
                for (int i = 0; i < diagram_number; i++) {
                    parallelogram _Parallelogram_ = new parallelogram(random_number[0], random_number[1], random_number[2]);
                    area += _Parallelogram_.area();
                    perimeter += _Parallelogram_.perimeter();
                    System.out.println("costas : " + random_number[0] + ", " + random_number[1] + ", height : " + random_number[2]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
            case 3 :
                for (int i = 0; i < diagram_number; i++) {
                    rectangle _Rectangle_ = new rectangle(random_number[0], random_number[1]);
                    area += _Rectangle_.area();
                    perimeter += _Rectangle_.perimeter();
                    System.out.println("costas : " + random_number[0] + ", " + random_number[1]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
            case 4 :
                for (int i = 0; i < diagram_number; i++) {
                    square _Square_ = new square(random_number[0]);
                    area += _Square_.area();
                    perimeter += _Square_.perimeter();
                    System.out.println("costa : " + random_number[0]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
            case 5 :
                for (int i = 0; i < diagram_number; i++) {
                    trapezius _Trapezius_ = new trapezius(random_number[0], random_number[1], random_number[2], random_number[3], random_number[4]);
                    area += _Trapezius_.area();
                    perimeter += _Trapezius_.perimeter();
                    System.out.print("costas : " + random_number[0] + ", " + random_number[1] + ", " + random_number[2] + ", " + random_number[3] + ", ");
                    System.out.println("height : " + random_number[4]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
            case 6 :
                for (int i = 0; i < diagram_number; i++) {
                    triangle _Triangle_ = new triangle(random_number[0], random_number[1], random_number[2], random_number[3]);
                    area += _Triangle_.area();
                    perimeter += _Triangle_.perimeter();
                    System.out.print("costas : " + random_number[0] + ", " + random_number[1] + ", " + random_number[2]);
                    System.out.print(", height : " + random_number[3]);
                }
                System.out.println("sum area : " + area + ", sum perimeter : " + perimeter);
                break;
        }
    }
}