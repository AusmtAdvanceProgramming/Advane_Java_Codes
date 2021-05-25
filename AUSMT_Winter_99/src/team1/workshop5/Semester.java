/*
 Haniyeh Hadiyan _ Hossein Rahi
 */
package team1.workshop5;


public class Semester {
    
    
    char LessonList ;
    char ListOfMasters;
    int NumberOfClasses ;
    int Units ; 
    
    public Semester(){
        
    }
    
     public char Peopleresent(char a){
         LessonList=a;
         return LessonList;
     }
     
     public char PresentProfessors(char p){
         ListOfMasters=p;
         return ListOfMasters;
     }
     
     
     void Relationship () {
         
     }
     
     public int classes (int l) {
         NumberOfClasses = l;
        return NumberOfClasses;
    }
     
     public int NumberOfUnits (int r){
         Units=r;
         return Units;
     }
}
