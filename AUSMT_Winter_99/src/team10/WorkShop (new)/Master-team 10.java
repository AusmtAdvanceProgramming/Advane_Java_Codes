/*
 * Master.java
 */
package Workshop5 ;
/**
 * @author sina gholizadeh
 * @author amir mohammad rasuli
 */
public class Master {
    private String firstName ;
    private String lastName ;
    private String lesson ;
    private char gender ;
    private int age ;

    public Master () {
    }

    public String getFirstName (String a) {
        firstName=a ;
        return firstName ;
    }
    public String getLastName (String b) {
        lastName=b ;
        return lastName ;
    }
    public String getLesson (String c) {
        lesson=c ;
        return lesson ;
    }
    public char getGender (char d) {
        gender=d ;
        return gender ;
    }
    public int getAge (int e) {
        age=e ;
        return age ;
    }
    public void teach () {
    }
}