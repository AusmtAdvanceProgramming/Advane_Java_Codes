import java.util.Scanner;

/**
 * Teacher
 */
public class Teacher extends Employee {

    // 
    private String[] className;
    private String[][] nameOfStudent;
    private double[][] studentScore;
    private String[][] studentAbsence;
    private String[][] lessonAverage;
    // 
    public Teacher () {}
    // 
    public String[] getClassesName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number of class :");
        int numberOfClass = scan.nextInt();
        System.out.println("Enter your class name :");
        String[] className = new String[numberOfClass];
        for (int i = 0; i < numberOfClass; i++) {
            className[i] = scan.nextLine();
        }
        this.className = className;
        return className;
    }
    // 
    public String[][] getStudentName() {
        Scanner scan = new Scanner(System.in);
        String[] nameOfClasses = getClassesName();
        System.out.println("Enter number of your student in every class :");
        // ---
        int studentNumber = scan.nextInt();
        // ---
        String[][] nameOfStudent = new String[nameOfClasses.length][studentNumber];
        for (int i = 0; i < nameOfClasses.length; i++) {
            System.out.println("Enter your student name in " + nameOfClasses[i] + " class :");
            for (int j = 0; j < studentNumber; j++) {
                nameOfStudent[i][j] = scan.nextLine(); 
            }
        }
        this.nameOfStudent = nameOfStudent;
        return nameOfStudent;
    }
    // 
    public void getStudentScore() {
        Scanner scan = new Scanner(System.in);
        String[][] nameOfStudent = getStudentName();
        double[][] studentScore = new double[nameOfStudent.length][nameOfStudent[0].length];
        System.out.println("Enter student score :");
        for (int i = 0; i < nameOfStudent.length; i++) {
            for (int j = 0; j < nameOfStudent[i].length; j++) {
                System.out.print(nameOfStudent[i][j] + " : ");
                studentScore[i][j] = scan.nextDouble();
                System.out.println();                    
            }
        }
    }
    // 
    public String[][] giveStudentAbsence() {
        Scanner scan = new Scanner(System.in);
        String[] nameOfClass = getClassesName();
        String[][] absence = new String[nameOfClass.length][1];
        System.out.println("Enter number of student absence:");
        for (int i = 0; i <nameOfClass.length ; i++) {
            System.out.println("Enter absence in " + nameOfClass[i]);
            absence[i][0] = scan.next();
        }
        studentAbsence = absence;
        return absence;
    }
    // 
    public void giveLessonAverage() {
        Scanner scan = new Scanner(System.in);
        // 
        System.out.println("Enter number of lesson you teah :");
        int numberOfLesson = scan.nextInt();
        // 
        String[] nameOfLesson = new String[numberOfLesson];
        System.out.println("Enter name of lesson :");
        for (int i = 0; i < nameOfLesson.length; i++) {
            nameOfLesson[i] = scan.nextLine();
        }
        // 
        String[][] lessonAverage = new String[nameOfLesson.length][1];
        System.out.println("Enter average of lesson :");
        for (int i = 0; i < nameOfLesson.length; i++) {
            lessonAverage[i][0] = scan.nextLine();
        }
        // 
        this.lessonAverage = lessonAverage;
    }
}