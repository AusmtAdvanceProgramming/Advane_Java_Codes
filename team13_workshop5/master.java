/**
 * master
 */
public class master {

    public String first_name;
    public String last_name;
    public String academice_degree;
    public int[] list_of_lessens;
    public int teaching_experience;
    public int number_of_lessons;
    // getters
    public String getter_1() {
        return first_name;
    }
    public String getter_2() {
        return last_name;
    }
    public String getter_3() {
        return academice_degree;
    }
    public int[] getter_4() {
        return list_of_lessens;
    }
    public int getter_5() {
        return teaching_experience;
    }
    public int getter_6() {
        return number_of_lessons;
    }
    // setters
    public void setter_1(String new_name) {
        this.first_name = new_name;
    }
    public void setter_2(String new_name) {
        this.last_name = new_name;
    }
    public void setter_3(String new_name) {
        this.academice_degree = new_name;
    }
    public void setter_4(int[] new_name) {
        this.list_of_lessens = new_name;
    }
    public void setter_5(int new_name) {
        this.teaching_experience = new_name;
    }
    public void setter_6(int new_name) {
        this.number_of_lessons = new_name;
    }
    // 
    public void convert_academic_degree(String _academice_degree_) {
        academice_degree = _academice_degree_;
    }
    // 
    public void convert_list_of_lessen(int[] _list_of_lessens_) {
        list_of_lessens = _list_of_lessens_;
    }
    // 
    public void convert_number_of_lessen(int _number_of_lessons_) {
        number_of_lessons = _number_of_lessons_;
    }
}
