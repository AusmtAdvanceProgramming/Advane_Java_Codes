import java.util.Scanner;

/**
 * Employee
 */
public class Employee {

    // 
    private String name;
    private String lastName;
    private String education;
    private double salary;
    private String gender;
    private int age;
    // 
    public Employee() {}
    // 
    public void getName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = scan.nextLine();
    }
    // 
    public void getLastName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your last name :");
        lastName = scan.nextLine();
    }
    // 
    public void getEducation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your education :");
        education = scan.nextLine();
    }
    // 
    public void getSalary() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary :");
        salary = scan.nextDouble();
    }
    // 
    public void getGender() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender :");
        gender = scan.nextLine();
    }
    // 
    public void getAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = scan.nextInt();
    }
}