/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz1;
import java.util.Scanner;
/**
 *team3
 * @amirali ghaumi
 * naser riazi
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int todaysDate;
        int dayToMeet;
        int dateOfMeeting;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter what day is it today"
                + "\n 1 (saturday) ,2[sunday],3[monday],"
                + "\n4[tuesday],5[wednesday],6[thursday],7[friday]:");
        todaysDate = input.nextInt();
        
        System.out.print("Enter the days left to the meeting:");
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