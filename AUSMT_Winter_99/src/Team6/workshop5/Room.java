
package team6.Workshop5;

/**
 * @author Mahdi
 * 
 */
public class Room {
    private String universityName;
    private String nameOfBuilding;
    private boolean coeducational;
    private int capacity;
    private int floorNumber;

    public Room() {
    } // Room () constructor

    public String getUniversityName(String a) {
        universityName = a;
        return universityName;
    }

    public String getNameOfBuilding(String b) {
        nameOfBuilding = b;
        return nameOfBuilding;
    }

    public boolean getCoeducational(boolean c) {
        coeducational = c;
        return coeducational;
    }

    public int getCapacity(int d) {
        capacity = d;
        return capacity;
    }

    public int getFloorNumber(int e) {
        floorNumber = e;
        return floorNumber;
    }

    public void beClean() {
    }
} // Room class