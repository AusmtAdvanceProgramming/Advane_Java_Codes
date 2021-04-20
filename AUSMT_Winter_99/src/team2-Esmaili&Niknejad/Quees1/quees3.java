
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class quees3 {
     
public static void main(String[] args) {
        int nowDate;
        int meetDay ;
        int meetingDate;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Which one of weeks days is today :");
        nowDate = input.nextInt();
        
        System.out.print("input number of days have to meet:");
        meetDay = input.nextInt();
        
        while (meetDay >= 7) {
          meetDay  = meetDay -7;  
        }
        
        meetingDate = nowDate + meetDay;
        while(meetingDate > 7) {
            meetingDate = meetingDate-7;
        }
        System.out.println(meetingDate);
     
       switch (meetingDate) {
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

