/*
 * Semester.java
 */
package Workshop5 ;
/**
 * @author sina gholizadeh
 * @author amir mohammad rasuli
 */
public class Semester {
    private String[] listOfMasters ;
    private String[] listOfLessons ;
    private int semesterNumber ;
    private int numberOfUnit ;
    private int numberOfRooms ;

    public Semester () {
    }

    public String[] getListOfMasters (String[] a) {
        listOfMasters=a ;
        return listOfMasters ;
    }
    public String[] getListOfLessons (String[] b) {
        listOfLessons=b ;
        return listOfLessons ;
    }
    public int getSemesterNumber (int c) {
        semesterNumber=c ;
        return semesterNumber ;
    }
    public int getNumberOfUnit (int d) {
        numberOfUnit=d ;
        return numberOfUnit ;
    }
    public int getNumberOfRooms (int e) {
        numberOfRooms=e ;
        return numberOfRooms ;
    }
    public void getStarted () {
    }
}