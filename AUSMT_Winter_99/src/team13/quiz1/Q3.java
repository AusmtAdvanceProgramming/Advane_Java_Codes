/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team13.quiz1;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Q3 {
  public static void main(String[] args){
     int weekDay ;
        int dayToMeet;
        int meetingDay;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter the weekDay:");
        weekDay = input.nextInt();
        
        System.out.print(" Enter the number of days left until the meeting:");
        dayToMeet = input.nextInt();
        
        while(dayToMeet >= 7){
            dayToMeet-= 7;
        }
        meetingDay = weekDay + dayToMeet;
        
        while(meetingDay > 7)
        {
            meetingDay-=7;
        }
       
        System.out.print("meetingDay:");
        
        switch(meetingDay){
            case 1:
            
         System.out.println("Saturday");
         break;
            case 2:
        
         System.out.println("Sunday");
         break;
            case 3:
        
        System.out.println("Monday");
         break;
            case 4:
        
        System.out.println("Tuesday");
         break;
            case 5:
        
        System.out.println("Wednesday");
         break;
            case 6:
        
        System.out.println("Thursday");
         break;
            case 7:
     
         System.out.println("Friday");
          break;
          
          
         
          }
        
    }//end of main() method
    
}//end of class
