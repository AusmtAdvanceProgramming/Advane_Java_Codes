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
public class Master {
    
    private String FirstName;
    private String LastName;
    private String[] ListOfLessons;
    private int NumberOfStudents;
    
   
    public Master(){
    }
    
    public String getFirstName (String Fname){
        FirstName = Fname;
        return FirstName;
    }
    public String getLastName (String Lname){
        LastName = Lname;
        return LastName;
    }
    public String[] getFirstName (String[] LofL){
        ListOfLessons = LofL;
        return ListOfLessons;
    }
    public int getNumberOfStudents (int StuNum){
        NumberOfStudents = StuNum;
        return NumberOfStudents;
    }
    
    public void TeachStudents(){
    }
    public void GiveExams(){
    }
    
    
}
