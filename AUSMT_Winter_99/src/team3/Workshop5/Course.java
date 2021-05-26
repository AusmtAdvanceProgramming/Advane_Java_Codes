/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.Workshop5;

/**
 *
 * @author amirali ghaumi
 * @author naser riazi
 * team3
 */
public class Course {
    private String lessonName ;
    private String masterName ;
    private String holdingRoom ;
    private int numberOfUnit ;
    private int numberOfStudent ;

    public Course() {
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getHoldingRoom() {
        return holdingRoom;
    }

    public void setHoldingRoom(String holdingRoom) {
        this.holdingRoom = holdingRoom;
    }

    public int getNumberOfUnit() {
        return numberOfUnit;
    }

    public void setNumberOfUnit(int numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
     public void getStarted () {
         System.out.println("lesson is started.");
         
    }
    
}
