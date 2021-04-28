package team0.quiz2;
import java.util.Scanner;
public class Q4 {
    public static void main (String[] args) {
       
       
        int x=0 ;
        int counter=0 ;
        
        
        for (int i=1;i<=1000;i++) {
            for (int j=1;j<=i;j++) {
                if (i%j==0) {
                    counter++ ;
                }
            }
           
            if (counter==2) {
                System.out.print(i+"\t") ;
                x++ ;
               
                if (x%8==0) {
                    System.out.print("\n") ;
                }
            }
            
            counter=0 ;   
            
            if (x==40) {
                break ;
            }
        }
    }
}
