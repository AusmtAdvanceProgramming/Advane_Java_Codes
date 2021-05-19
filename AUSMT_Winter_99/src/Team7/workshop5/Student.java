/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7.workshop5;

/**
 *
 * @author team7
 */
public class Student {
    
    private String FirstName;
    private String LastName;
    private String[] ListOflessons;
    private String NameOfUni;
    private String Majorname;
    private int SemesterNumber;
    private int StudentCode;
    
    public Student(){
    }
    
    public String getFirstName (String Fname){
        FirstName = Fname;
        return FirstName;
    }
    public String getLastName (String Lname){
        LastName = Lname;
        return LastName;
    }
    public String[] getListOflessons (String[] LofL){
        ListOflessons = LofL;
        return ListOflessons;
    }
    public String getNameOfUni (String NofU){
        NameOfUni = NofU;
        return NameOfUni;
    }
    public String getMajorname (String MName){
        Majorname = MName;
        return Majorname;
    }
    public int getSemesterNumber (int Snum){
        SemesterNumber = Snum;
        return SemesterNumber;
    }
    public int getStudentCode (int StuNum){
        StudentCode = StuNum;
        return StudentCode;
    }
    
    public void study(){
    }
    public void TakeExams(){
    }
    
}
