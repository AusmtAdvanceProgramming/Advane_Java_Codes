/**
 * course
 */
public class course {

    public String name_of_course;
    public int number_of_units;
    public String name_of_masters;
    public String type_of_course;
    public String[] list_of_students;
    // getters
    public String getter_1() {
        return name_of_course;
    }
    public int getter_2() {
        return number_of_units;
    }
    public String getter_4() {
        return name_of_masters;
    }
    public String getter_5() {
        return type_of_course;
    }
    public String[] getter_6() {
        return list_of_students;
    }
    // setters
    public void setter_1(String new_name) {
        this.name_of_course = new_name;
    }
    public void setter_3(int new_name) {
        this.number_of_units = new_name;
    }
    public void setter_4(String new_name) {
        this.name_of_masters = new_name;
    }
    public void setter_5(String new_name) {
        this.type_of_course = new_name;
    }
    public void setter_6(String[] new_name) {
        this.list_of_students = new_name;
    }
    // 
}