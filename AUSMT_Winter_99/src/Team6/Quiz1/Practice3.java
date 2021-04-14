/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz1;

    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int today;
        int interval;
        int meet_day;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("what day is today? ");
        today = input.nextInt();
        
        System.out.println("Enter the interval of days: ");
        interval = input.nextInt();
        
        while (interval >= 7) {
          interval  = interval -7;  
        }
        
        meet_day = today + interval;
        while(meet_day > 7) {
            meet_day = meet_day-7;
        }
        System.out.println(meet_day);
     
       switch (meet_day) {
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
        // TODO code application logic here
    }
}
