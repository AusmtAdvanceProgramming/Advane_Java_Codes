/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team7;

import java.util.Scanner;

/**
 *
 * @author team7
 */
public class DateOfMeeting {


    public static void main(String[] args) {
        int todaysDate;
        int dayToMeet;
        int dateOfMeeting;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Emrooz chadomin rooz hafte ast:");
        todaysDate = input.nextInt();
        
        System.out.print("tedad rooz haye baqi mande ta meeting ro vared konid:");
        dayToMeet = input.nextInt();
        
        while (dayToMeet >= 7) {
          dayToMeet  = dayToMeet -7;  
        }
        
        dateOfMeeting = todaysDate + dayToMeet;
        while(dateOfMeeting > 7) {
            dateOfMeeting = dateOfMeeting-7;
        }
        System.out.println(dateOfMeeting);
     
       switch (dateOfMeeting) {
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
    }
}
