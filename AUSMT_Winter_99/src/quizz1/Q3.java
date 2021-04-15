/*
 Haniyeh Hadiyan -Hossein Rahi
 */
package team1.quizz1;

import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        int Days_of_the_Week;
        int number_of_days;
        int Meeting_day;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What day is today?:\n [1]-Saturday \n [2]-sunday \n [3]-monday \n [4]-Tuesday  \n [5]-Wednesday"
                       + " \n [6]-Thursday \n [7]-Friday");
        Days_of_the_Week = input.nextInt();
        
        System.out.print("How many days are left until the appointment?:");
        number_of_days = input.nextInt();
        
        while (number_of_days >= 7) {
          number_of_days  = number_of_days -7;  
        }
        
        Meeting_day = Days_of_the_Week + number_of_days;
        
        while(Meeting_day > 7) {
            Meeting_day = Meeting_day-7;
        }
        System.out.println(Meeting_day);
     
       switch (Meeting_day) {
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