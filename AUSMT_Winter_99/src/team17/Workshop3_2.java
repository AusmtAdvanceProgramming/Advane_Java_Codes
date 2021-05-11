package team17;

import java.util.Scanner;

/*team17.Workshop3_2
Salari & Sh'abani
@Author : Salari*/

public class Workshop3_2 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Variables declaration...
        char c;
        String s;
        int l;
        int counter=0;
        
        System.out.print ("Please enter your desire string: ");
        s=input.next() ;
        //This term detemining character in 0 condition.
        System.out.print ("Please enter your desire character: ");
        c=input.next().charAt(0);
        //This term converting to lowercase and determining the length of string.
        l=s.length ();
        s=s.toLowerCase ();
        c=Character.toLowerCase(c);
        //This for() loop couts the character in entrance string.
        for (int x = 0; x < l; x++) {
            if(s.charAt(x)==c) {
                counter++;
            }//end if
        }//end of for()

        System.out.println ("Your desired character \""+c+"\" is repeated "+counter+" times in \""+s+"\"") ;

    }//end of main() method 
    
}//end of Class

