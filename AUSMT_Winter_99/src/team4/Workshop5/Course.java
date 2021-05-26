/*
 * Course.java
 */
package team4.Workshop5 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
public class Course {
    private String lessonName ;
    private String masterName ;
    private String holdingRoom ;
    private int numberOfUnit ;
    private int numberOfStudent ;
    //___
    public Course () {
    } // end of Course () constructor
    //___
    public String getLessonName (String a) {
        lessonName=a ;
        return lessonName ;
    } // end of getLessonName () method
    public String getMasterName (String b) {
        masterName=b ;
        return masterName ;
    } // end of getMasterName () method
    public String getHoldingRoom (String c) {
        holdingRoom=c ;
        return holdingRoom ;
    } // end of getHoldingRoom () method
    public int getNumberOfUnit (int d) {
        numberOfUnit=d ;
        return numberOfUnit ;
    } // end of getNumberOfUnit () method
    public int getNumberOfStudent (int e) {
        numberOfStudent=e ;
        return numberOfStudent ;
    } // end of getNumberOfStudent () method
    public void getStarted () {
    } // end of getStarted () method
} // end of Course class