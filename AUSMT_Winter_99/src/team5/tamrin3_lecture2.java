/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;
import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class tamrin3_lecture2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int todaysNumber,numberOfdays,total,result;
        
        System.out.println("What day is it today?(please enter number of the day):");
        System.out.println("Saturday------0\nSunday------1\nMonday------2\nTuesday------3\nWednesday------4\nThursday------5\nFriday------6");
        
        todaysNumber = input.nextInt();
        
        System.out.println("How many days until your meeting?");
        
        numberOfdays = input.nextInt();
        
        total=numberOfdays+todaysNumber;
        result=total%7;
        
        if(result==0)
            System.out.println("Your meeting will be on Saturday.");
        else if(result==1)
            System.out.println("Your meeting will be on Sunday.");
        else if(result==2)
            System.out.println("Your meeting will be on Monday.");
        else if(result==3)
            System.out.println("Your meeting will be on Tuesday.");
        else if(result==4)
            System.out.println("Your meeting will be on Wednesday.");
        else if(result==5)
            System.out.println("Your meeting will be on Thursday.");
        else
            System.out.println("Your meeting will be on Friday.");
        
                
    
       
    }
    
}
