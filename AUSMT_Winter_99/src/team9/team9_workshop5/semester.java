/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9_workshop5;

/**
 *
 * @author Aliasqar ranjbar & zeynab karimizad
 */
public class semester {
    private String[] listOfMasters ;
    private String[] listOfLessons ;
    private int semesterNumber ;
    private int numberOfUnit ;
    private int numberOfRooms ;
 
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