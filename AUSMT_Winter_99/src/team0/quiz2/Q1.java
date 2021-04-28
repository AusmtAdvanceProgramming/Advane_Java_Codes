package team0.quiz2;
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a,b,temp;
        
        System.out.println("Please enter the larger integer:");
        a=input.nextInt();
        
        System.out.println("Please enter the smaller integer:");
        b=input.nextInt();
        
        while(true){
        
              if(b==0) break;
              
              temp = a%b;
              a = b;
              b = temp;
              
        }
        
        System.out.println("B.M.M is "+a);             
    }
    
}