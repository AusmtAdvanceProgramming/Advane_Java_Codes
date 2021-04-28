package team0.quiz2;
import java.util.Scanner;
public class Q0 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
       String text;
       int counter=0;
       int length;
       
       System.out.println("Please enter your text.");
       text=input.nextLine();
       
       length=text.length();
       text=text.toLowerCase();
       
       for(int i=0;i<length;i++){
           for(int j=0;j<length;j++){
               if(text.charAt(i)==text.charAt(j)){
                   counter++;
               }
           }
           System.out.println("["+text.charAt(i)+"]"+counter+" times");
           counter=0;
       }      
    }
}