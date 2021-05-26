/*
  Haniyeh Hadiyan _ Hossein Rahi
 */
package team1.workshop5;


public class Room {
    
   int Capacity ; 
   double Size ; 
   char Color ; 
   int floor  ;
   char Discipline; 
    
     public  Room (){
    
 }
     
    public char getColor(char c){
        Color=c;
        return Color;
    }
    public double getRoomSpace (int f){
         Size = f;
         return Size;
     }
     
    public int getNumberOfStudents (int a) {
        Capacity = a ;
        return Capacity;
    }

    public int setPlace () {
        floor = 1;
        return floor;
    }

  
   public int getRoomSpace (char m){
       
       Discipline=m;
       return Discipline;
     
    
    }
    
}
