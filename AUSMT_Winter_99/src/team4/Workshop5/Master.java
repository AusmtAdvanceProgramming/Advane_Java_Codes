/*
 * Master.java
 */
package team4.Workshop5 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
public class Master {
    private String firstName ;
    private String lastName ;
    private String lesson ;
    private char gender ;
    private int age ;
    //___
    public Master () {
    } // end of Master () constructor
    //___
    public String getFirstName (String a) {
        firstName=a ;
        return firstName ;
    } // end of getFirstName () method
    public String getLastName (String b) {
        lastName=b ;
        return lastName ;
    } // end of getLastName () method
    public String getLesson (String c) {
        lesson=c ;
        return lesson ;
    } // end of getLesson () method
    public char getGender (char d) {
        gender=d ;
        return gender ;
    } // end of getGender () method
    public int getAge (int e) {
        age=e ;
        return age ;
    } // end of getAge () method
    public void teach () {
    } // end of teach () method
} // end of Master class