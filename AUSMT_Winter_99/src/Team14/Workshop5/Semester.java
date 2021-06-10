package team14.Workshop5 ;

public class Semester {
    private String[] listOfMasters ;
    private String[] listOfLessons ;
    private int semesterNumber ;
    private int numberOfUnit ;
    private int numberOfRooms ;
    //___
    public Semester () {
    } // end of Semester () constructor
    //___
    public String[] getListOfMasters (String[] a) {
        listOfMasters=a ;
        return listOfMasters ;
    } // end of getListOfMasters () method
    public String[] getListOfLessons (String[] b) {
        listOfLessons=b ;
        return listOfLessons ;
    } // end of getListOfLessons () method
    public int getSemesterNumber (int c) {
        semesterNumber=c ;
        return semesterNumber ;
    } // end of getSemesterNumber () method
    public int getNumberOfUnit (int d) {
        numberOfUnit=d ;
        return numberOfUnit ;
    } // end of getNumberOfUnit () method
    public int getNumberOfRooms (int e) {
        numberOfRooms=e ;
        return numberOfRooms ;
    } // end of getNumberOfRooms () method
    public void getStarted () {
    } // end of getStarted () method
} // end of Semester class