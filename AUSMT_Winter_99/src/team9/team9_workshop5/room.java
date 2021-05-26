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
public class room {
    
    private String universityName ;
    private String nameOfCorrider ;
    private boolean unisex ;
    private int capacity ;
    private int floorNumber ;
 
    public String getUniversityName (String a) {
        universityName=a ;
        return universityName ;
    }
    public String getNameOfCorrider (String b) {
        nameOfCorrider=b ;
        return nameOfCorrider ;
    }
    public boolean getunisex (boolean c) {
        unisex=c ;
        return unisex ;
    }
    public int getCapacity (int d) {
        capacity=d ;
        return capacity ;
    } 
    public int getFloorNumber (int e) {
        floorNumber=e ;
        return floorNumber ;
    }
    public void beClean () {
    }
}