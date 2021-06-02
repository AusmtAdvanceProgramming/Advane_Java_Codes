package team6.Workshop5;

/**
 * @author Mahdi
 * 
 */
public class Student {
    private String firstName;
    private String lastName;
    private char bloodType;
    private double height;
    private int age;


    public Student() {
    } // Student () constructor


    public String getFirstName(String a) {
        firstName = a;
        return firstName;
    }

    public String getLastName(String b) {
        lastName = b;
        return lastName;
    }

    public char getBloodType(char c) {
        bloodType = c;
        return bloodType;
    }

    public double getHeight(double d) {
        height = d;
        return height;
    }

    public int getAge(int e) {
        age = e;
        return age;
    }

    public void study() {
    }
} // Student class