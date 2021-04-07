package team17;

/*Authors : Salari & Sh'abani (team17) lecture3_example6
Student Number : 951606020*/
import java.util.Scanner;
public class lecture3_example6 {

    public static void main(String[] args) {
        int guess;
        int lotteryDigit1, lotteryDigit2,lotteryDigit3;
        int guessDigit1, guessDigit2, guessDigit3;
        
        Scanner input=new Scanner(System.in);
        //Generate a lottery number
        int lottery=(int)(Math.random()*1000);
        
        System.out.print("Enter your lottery pick (three digits): ");
        guess=input.nextInt();
        
        //Get digits from lottery
        lotteryDigit1=lottery/100;
        lotteryDigit2=(lottery%100)/10;
        lotteryDigit3=lottery%10;
        //Get digits from guess
        guessDigit1=guess/100;
        guessDigit2=(guess%100)/10;
        guessDigit3=guess%10;
        System.out.println("The lottery number is: "+lottery);
        
        //Check the guess
        if (guess==lottery)
            System.out.println("Exact match: you win 100,000$");
        else if (guessDigit3==lotteryDigit1 && guessDigit2==lotteryDigit3 && guessDigit1==lotteryDigit2 
                || guessDigit3==lotteryDigit2 && guessDigit2==lotteryDigit1 && guessDigit1==lotteryDigit3)
            System.out.println("Match all digits: you win 80,000$");
        else if (guessDigit1==lotteryDigit1 && guessDigit2==lotteryDigit2 || guessDigit1==lotteryDigit1 && guessDigit3==lotteryDigit3 
                || guessDigit2==lotteryDigit2 && guessDigit3==lotteryDigit3)
            System.out.println("Match two digits in the correct order: you win 50,000$");
        else if (guessDigit3==lotteryDigit1 && guessDigit2==lotteryDigit3 || guessDigit3==lotteryDigit2 && guessDigit1==lotteryDigit3 
                || guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit1)
            System.out.println("Match two digits: you win 10,000$");
        else if (guessDigit1==lotteryDigit1 || guessDigit1==lotteryDigit2 || guessDigit1==lotteryDigit3 || guessDigit2==lotteryDigit1 
                || guessDigit2==lotteryDigit2 || guessDigit2==lotteryDigit3 
                || guessDigit3==lotteryDigit1 || guessDigit3==lotteryDigit2 || guessDigit3==lotteryDigit3)
            System.out.println("Match one digits: you win 500$");
        else 
            System.out.println("Sorry, no match!");
   
    }//end of main() method 
    
}//end of Class
