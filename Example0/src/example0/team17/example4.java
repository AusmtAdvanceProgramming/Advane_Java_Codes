package example0.team17;

/*@author Seyed Ali Salari & M.reza Shabani
Student number:  951606020 example4*/
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalMiliseconds;
        long hours, minutes, seconds, miliseconds;
        long currentHour, currentMinute, currentSecond;
        totalMiliseconds = System.currentTimeMillis();
        
        miliseconds = totalMiliseconds % 1000;
        seconds = totalMiliseconds / 1000;
        
        minutes = seconds / 60;
        seconds = seconds % 60;
        
        hours = minutes/60;
        minutes = minutes%60;
        
        System.out.print(hours +":"+ minutes+":" + seconds + " ");
        System.out.println(miliseconds + "ms (h:m:s) past from UNIX epoch!\n" );
        
        currentSecond = seconds %60;
        currentMinute = minutes %60;
        currentHour = hours % 24;
        System.out.println("GMT Now:"+ currentHour +":"+currentMinute+":"+currentSecond+"\n");
        
    }//end of main() method
    
}//end of Class
