/*
   Haniyeh Hadiyan _ Hossein Rahi

 */
package team1.workshop5;


public class Course {
    
   String Name;
   int theUnit ; 
   double Time  ;
   String LessonTeacher ; 
   int Questions;
    
    public Course() {
    
}
    
   public String getprofessorsName(String n){
       Name = n;
       return Name;
   }
   
   public int gettheUnit (int b){
       theUnit = b;
       return theUnit;
  }
  
   public double setTime(){
       Time = 1;
       return Time;
     
 }
 
   public String Lesson(String k){
       
       LessonTeacher = k;
       return LessonTeacher;
    
}

  
 
   public int NumberOfQuestions(int j){
       
       Questions = j;
       return Questions;
       
    
   }
    
}
