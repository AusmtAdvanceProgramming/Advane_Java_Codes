/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.Workshop5;
import java.util.Scanner;

/**
 *
 * @author amirali ghaumi
 * @author naser riazi
 * team3
 */
public class Student {
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int termNumber;
    private String universityName;

    public Student() {
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(int termNumber) {
        this.termNumber = termNumber;
    }
    
    public void getLessonList(){
        String quit = "yes";
        String lessonName;
        int counter = 0;
        
        System.out.println("Enter the lesson's name:");
        lessonName =input.next();
        
        while(quit.charAt(0) == 'y'){
            
        System.out.println("if you to continue please say yes:");
        quit = input.next();
        
        
        System.out.println("Enter the lesson's name:");
        lessonName =input.next();
        
             counter++;
         }
        
        if (quit.charAt(0) == 'n'){
            System.out.println("the numbers of lessons is " + counter);
        }
    }
    
    public void verifyDegree(){
        String degree;
        System.out.println("Verify your degree:");
        degree = input.next();
        
    }
    
    
    
    
}
