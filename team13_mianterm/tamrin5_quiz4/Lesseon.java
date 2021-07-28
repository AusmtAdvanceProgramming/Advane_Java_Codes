import java.util.Scanner;
/**
 * Lesseon
 */
public class Lesseon {

    // 
    private int numberOfStudent;
    private String teacherName;
    private boolean havingPermissionToSetUp;
    private String lesseonName;
    private Teacher teacher;
    private Student student;
    // 
    public Lesseon () {}
    //
    public void getLessonName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lesson name :");
        lesseonName = scan.nextLine();
    }
    // 
    public void getNumberOfStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of student :");
        numberOfStudent = scan.nextInt();
    }
}