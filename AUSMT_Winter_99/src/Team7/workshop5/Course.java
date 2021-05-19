/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.workshop5;

/**
 *
 * @author soroush
 */
public class Course {
    
    private int NumberOfStudents;
    private String[] ListOfStudents;
    private String CourseName;
    private String FirstNameOfMaster;
    private String LastNameOfMaster;      
    private String LocationOfCourse;
    private String LessonName ;      
    
    public Course(){
    }
     
    public int NumberOfStudents(int StuNum){
        NumberOfStudents = StuNum;
        return NumberOfStudents;
    }
    public String[] getListOfStudents (String[] StuList){
        ListOfStudents = StuList;
        return ListOfStudents;
    }
    public String getCourseName (String CName){
        CourseName = CName;
        return CourseName;
    }
    public String getFirstNameOfMaster (String Fname){
        FirstNameOfMaster = Fname;
        return FirstNameOfMaster;
    }
    public String getLastNameOfMaster (String Lname){
        LastNameOfMaster = Lname;
        return LastNameOfMaster;
    }
    public String getLocationOfCourse (String LofC){
        LocationOfCourse = LofC;
        return LocationOfCourse;
    }
    public String getLessonName (String LsnName){
        LessonName = LsnName;
        return LessonName;
    }
    
    public void GetStarted(){
    }
    public void LearTheCourse(){
    }
    public void GetFinished(){
    }
            
}
