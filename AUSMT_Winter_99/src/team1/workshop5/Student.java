/*
    Haniyeh Hadiyan _ Hossein Rahi

 */
package team1.workshop5;


public class Student {
    
   String Name ; 
   char LastName ; 
   int Age  ; 
   int Height ;  
   int term ;
   
   public Student(){
    
  }
   
  public String getName(String a) {
       Name = a;
       return Name;
 }
 
  public void GoingToUniversity(){
    
}
  
  public  void ReturningFromUniversity(char c){
    
} 
  public  void Relationship(char d){
    
} 
   
 public char getLastname(char e) {
        
        LastName = e;
        return  LastName ;
        
 }  
 
 public int getterm(int j){
     
     term=j;
     return term;
 }
 
 public int getAge(int k){
        Age=k;
        return Age;
        
    } 
 
  public int getHeight(int l){
        Height = l;
        return Height;
    }    
   
}
