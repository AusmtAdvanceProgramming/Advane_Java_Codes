/*
 * Room.java
 */
package Workshop5 ;
/**
 * @author sina gholizadeh
 * @author amir mohammad rasuli
 */
public class Room {
    private String universityName ;
    private String nameOfCorridor ;
    private boolean coeducational ;
    private int capacity ;
    private int floorNumber ;

    public Room () {
    }

    public String getUniversityName (String a) {
        universityName=a ;
        return universityName ;
    }
    public String getNameOfCorridor (String b) {
        nameOfCorridor=b ;
        return nameOfCorridor ;
    }
    public boolean getCoeducational (boolean c) {
        coeducational=c ;
        return coeducational ;
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