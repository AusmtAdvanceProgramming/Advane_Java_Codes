import java.util.Scanner;

/**
 * Student
 */
public class Student {

    // 
    private String name;
    private String lastName;
    private String education;
    private String gender;
    private int age;
    private String[] lessonName;
    // 
    public Student () {}
    // 
    public void getName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = scan.nextLine();
    }
    public void getLastName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your last name :");
        lastName = scan.nextLine();
    }
    public void getEducation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your education :");
        education = scan.nextLine();
    }
    public void getGender() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender :");
        gender = scan.nextLine();
    }
    public void getAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = scan.nextInt();
    }
    public void getLessonName() {
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of your lesson :");
        int numberOfLesson = scan.nextInt();
        // 
        String[] lessonName = new String[numberOfLesson];
        System.out.println("Enter your lesson name :");
        for (int i = 0; i < lessonName.length; i++) {
            lessonName[i] = scan.nextLine();
        }
    }
}