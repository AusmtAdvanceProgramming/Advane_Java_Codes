/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.Workshop5;

/**
 */
public class Student {
    private String firstName ;
    private String lastName ;
    private char bloodType ;
    private double height ;
    private int footSize ;
    //___
    public Student () {
    } // end of Student () constructor
    //___
    public String getFirstName (String a) {
        firstName=a ;
        return firstName ;
    } // end of getFirstName () method
    public String getLastName (String b) {
        lastName=b ;
        return lastName ;
    } // end of getLastName () method
    public char getBloodType (char c) {
        bloodType=c ;
        return bloodType ;
    } // end of getBloodType () method
    public double getHeight (double d) {
        height=d ;
        return height ;
    } // end of getHeight () method
    public int getFootSize (int e) {
        footSize=e ;
        return footSize ;
    } // end of getFootSize () method
    public void study () {
    } // end of study () method
} // end of Student class
