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
public class Room {
    
    private String FirstNameOfMaster;
    private String LastNameOfMaster;
    private String LessonName;
    private int FloorOfRoom;
    private int NumberOfRoom;
    private int CapacityOfRoom;
    
    public Room(){
    }
    
    public String getFirstNameOfMaster (String FName){
        FirstNameOfMaster = FName;
        return FirstNameOfMaster;
    }
    public String getLastNameOfMaster (String Lname){
        LastNameOfMaster = Lname;
        return LastNameOfMaster;
    }
    public String getLessonName (String LsnName){
        LessonName = LsnName;
        return LessonName;
    }
    public int getFloorOfRoom (int FofR){
        FloorOfRoom = FofR;
        return FloorOfRoom;
    }
    public int getNumberOfRoom (int NofR){
        NumberOfRoom = NofR;
        return NumberOfRoom;
    }
    public int getLessonName (int CofR){
        CapacityOfRoom = CofR;
        return CapacityOfRoom;
    }
    
    public void EnterTheRoom(){
    }
    public void Sit(){
    }
    public void StandUp(){
    }
    public void GetOutOfTheRoom(){
    }
    
}
