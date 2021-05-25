/*
 * Student.java
 */
package Workshop5 ;
/**
 * @author sina gholizadeh
 * @author amir mohammad rasuli
 */
public class Student {
    private String firstName ;
    private String lastName ;
    private char bloodType ;
    private double height ;
    private int footSize ;

    public Student () {
    }

    public String getFirstName (String a) {
        firstName=a ;
        return firstName ;
    }
    public String getLastName (String b) {
        lastName=b ;
        return lastName ;
    }
    public char getBloodType (char c) {
        bloodType=c ;
        return bloodType ;
    }
    public double getHeight (double d) {
        height=d ;
        return height ;
    }
    public int getFootSize (int e) {
        footSize=e ;
        return footSize ;
    }
    public void study () {
    }
}