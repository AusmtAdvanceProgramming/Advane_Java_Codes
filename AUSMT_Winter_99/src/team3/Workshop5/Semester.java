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
public class Semester {
     private String[] listOfMasters ;
    private String[] listOfLessons ;
    private String location;
    private int numberOfLessons;
    private int numberOfMasters;
    private String semesterMajor;

    public Semester() {
    }

    public String[] getListOfMasters() {
        return listOfMasters;
    }

    public void setListOfMasters(String[] listOfMasters) {
        this.listOfMasters = listOfMasters;
    }

    public String[] getListOfLessons() {
        return listOfLessons;
    }

    public void setListOfLessons(String[] listOfLessons) {
        this.listOfLessons = listOfLessons;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public int getNumberOfMasters() {
        return numberOfMasters;
    }

    public void setNumberOfMasters(int numberOfMasters) {
        this.numberOfMasters = numberOfMasters;
    }

    public String getSemesterMajor() {
        return semesterMajor;
    }

    public void setSemesterMajor(String semesterMajor) {
        this.semesterMajor = semesterMajor;
    }
    
}
