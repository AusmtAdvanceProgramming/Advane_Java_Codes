/**
 * Secretary
 */
public class Secretary extends Employee {

    private String[][] absence;
    // 
    public Secretary () {}
    // 
    public void getStudentAbsence() {
        Teacher teacher = new Teacher();
        absence = teacher.giveStudentAbsence();
        System.out.println("student absence is :");
        for (int i = 0; i < absence.length; i++) {
            System.out.println(absence[i][0]);
        }
    }
}