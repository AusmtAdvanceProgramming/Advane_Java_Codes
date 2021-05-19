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
public class Semester {
    
    
    private String[] ListOfLessons;
    private String[] ListOfMasters;
    private int NumberOfClasses;
    private int NumberOfStundents;      
    private int NumberOfQueezes;
    private int NumberOfExams;
    
    public Semester(){
    }
    
    public String[] getListOfLessons (String[] LofL){
        ListOfLessons = LofL;
        return ListOfLessons;
    }
    public String[] getListOfMasters (String[] LofM){
        ListOfMasters = LofM;
        return ListOfMasters;
    }
    public int getNumberOfClasses (int CNum){
        NumberOfClasses = CNum;
        return NumberOfClasses;
    }
    public int getNumberOfStundents (int StuNum){
        NumberOfStundents = StuNum;
        return NumberOfStundents;
    }
    public int getNumberOfQueezes (int QNum){
        NumberOfQueezes = QNum;
        return NumberOfQueezes;
    }
    public int getNumberOfExams (int ENum){
        NumberOfExams = ENum;
        return NumberOfExams;
    }
    
    public void GetStarted(){
    }
    public void LearnLessons(){
    }
    public void TakeExams(){
    }
    public void TakeQueezes(){
    }
    public void GetFinished(){
    }
    public void GetYouGrades(){
    }
    
}
