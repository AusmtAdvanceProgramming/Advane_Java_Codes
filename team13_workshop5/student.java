/**
 * student
 */
public class student {

    public String first_name;
    public String last_name;
    public int number_of_units;
    public String name_of_units;
    public int[] list_of_lessens;
    public String major;
    // getters
    public String getter_1() {
        return first_name;
    }
    public String getter_2() {
        return last_name;
    }
    public int getter_3() {
        return number_of_units;
    }
    public String getter_4() {
        return name_of_units;
    }
    public int[] getter_5() {
        return list_of_lessens;
    }
    public String getter_6() {
        return major;
    }
    // setters
    public void setter_1(String new_name) {
        this.first_name = new_name;
    }
    public void setter_2(String new_name) {
        this.last_name = new_name;
    }
    public void setter_3(int new_name) {
        this.number_of_units = new_name;
    }
    public void setter_4(String new_name) {
        this.name_of_units = new_name;
    }
    public void setter_5(int[] new_name) {
        this.list_of_lessens = new_name;
    }
    public void setter_6(String new_name) {
        this.major = new_name;
    }
    // 
    
}