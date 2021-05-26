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
 * 
 */
public class Room{
    private String universityName ;
    private String nameOfCorrider ;
    private boolean coeducational ;
    private int capacity ;
    private int floorNumber ;

    public Room() {
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getNameOfCorrider() {
        return nameOfCorrider;
    }

    public void setNameOfCorrider(String nameOfCorrider) {
        this.nameOfCorrider = nameOfCorrider;
    }

    public boolean isCoeducational() {
        return coeducational;
    }

    public void setCoeducational(boolean coeducational) {
        this.coeducational = coeducational;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    
}
