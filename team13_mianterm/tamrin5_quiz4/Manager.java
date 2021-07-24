import java.util.Scanner;
/**
 * Manager
 */
public class Manager extends Employee{

    // 
    private String[] className;
    private int[] lessonCanHold;
    // 
    public Manager () {}
    // 
    public void giveLessonCanToHolding() {
        // 
        Teacher teacher = new Teacher();
        className = teacher.getClassesName();
        // 
        Scanner scan = new Scanner(System.in);
        int[] lessonCanHold = new int[className.length];
        System.out.println("Enter wich one is can to holding :(yes -> 1, no -> 2)");
        for (int i = 0; i < className.length; i++) {
            System.out.print(className[i] + " : ");
            lessonCanHold[i] = scan.nextInt();
        }
        this.lessonCanHold = lessonCanHold;
    }
}