
package team6.Workshop5;

/**
 * @author Mahdi
 * 
 */
public class Course {
    private String lessonName;
    private String masterName;
    private String holdingRoom;
    private int numberOfUnit;
    private int numberOfStudent;


    public Course() {
    } //Course () constructor


    public String getLessonName(String a) {
        lessonName = a;
        return lessonName;
    }

    public String getMasterName(String b) {
        masterName = b;
        return masterName;
    }

    public String getHoldingRoom(String c) {
        holdingRoom = c;
        return holdingRoom;
    }

    public int getNumberOfUnit(int d) {
        numberOfUnit = d;
        return numberOfUnit;
    }

    public int getNumberOfStudent(int e) {
        numberOfStudent = e;
        return numberOfStudent;
    } 
    public void getStarted() {
    }
} //Course class