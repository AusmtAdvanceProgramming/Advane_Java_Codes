/*
 * Room.java
 */
package team4.Workshop5 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
public class Room {
    private String universityName ;
    private String nameOfCorridor ;
    private boolean coeducational ;
    private int capacity ;
    private int floorNumber ;
    //___
    public Room () {
    } // end of Room () constructor
    //___
    public String getUniversityName (String a) {
        universityName=a ;
        return universityName ;
    } // end of getUniversityName () method
    public String getNameOfCorridor (String b) {
        nameOfCorridor=b ;
        return nameOfCorridor ;
    } // end of getNameOfCorridor () method
    public boolean getCoeducational (boolean c) {
        coeducational=c ;
        return coeducational ;
    } // end of getCoeducational () method
    public int getCapacity (int d) {
        capacity=d ;
        return capacity ;
    } // end of getCapacity () method
    public int getFloorNumber (int e) {
        floorNumber=e ;
        return floorNumber ;
    } // end of getFloorNumber () method
    public void beClean () {
    } // end of beClean () method
} // end of Room class
