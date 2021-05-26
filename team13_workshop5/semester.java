/**
 * semester
 */
public class semester {

    public String[] list_of_lessons;
    public String[] list_of_masters;
    public int number_of_classes;
    public String[] list_of_students;
    public String exam_date;
    // getters
    public String[] getter_1() {
        return list_of_lessons;
    }
    public String[] getter_2() {
        return list_of_masters;
    }
    public int getter_3() {
        return number_of_classes;
    }
    public String[] getter_4() {
        return list_of_students;
    }
    public String getter_5() {
        return exam_date;
    }
    // setters
    public void setter_1(String[] new_name) {
        this.list_of_lessons = new_name;
    }
    public void setter_2(String[] new_name) {
        this.list_of_masters = new_name;
    }
    public void setter_3(int new_name) {
        this.number_of_classes = new_name;
    }
    public void setter_4(String[] new_name) {
        this.list_of_students = new_name;
    }
    public void setter_5(String new_name) {
        this.exam_date = new_name;
    }
    // 
}