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
public class Master {
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String lessonsName;
    private int lessonslist;
    private int yearsOfTeaching;

    public Master() {
        
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

    public String getLessonsName() {
        return lessonsName;
    }

    public void setLessonsName(String lessonsName) {
        this.lessonsName = lessonsName;
    }

    public int getLessonslist() {
        return lessonslist;
    }

    public void setLessonslist(int lessonslist) {
        this.lessonslist = lessonslist;
    }

    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }
    
    public void verifyPresent(){
        String quit = "yes";
        String Identifier;
        String name;
        
        
        System.out.println("Enter the students name:");
        name =input.next();
        
        while(quit.charAt(0) == 'y'){
            
        System.out.println(" please enter yes if  Student " + name + "  is  present : ");
        Identifier = input.next();
        
        if (Identifier.charAt(0) == 'y'){
            System.out.println("Student " + name + " is present.");
        }
        else if (Identifier.charAt(0) == 'n'){
            verifyAbsent(name);
        }
        
        System.out.println("if you to continue please say yes:");
        quit = input.next();
        
        System.out.println("Enter the students name:");
        name =input.next();
             
    }
        
 }
    public void verifyAbsent(String studentName){
            System.out.println("Student " + studentName + " is absent");
    }
    
    public void verifyActivity(String studentName){
        int numberOfActivity;
        
        System.out.println("Enter the numbers of students activity:");
        numberOfActivity = input.nextInt();
        
        if (numberOfActivity > 3){
            System.out.println("Student " + studentName + " is active.");
        }
    }
}
