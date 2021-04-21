package team0;

import java.util.Scanner;

public class Workshop3_1 {
    
    public static void main(String[] args) {
        
        int guess = -1;
        int number ;
        
        Scanner input = new Scanner(System.in);
        
        number = (int)(Math.random() * 101);
        
        System.out.println("Tek adad bein 0 va 100 entkhb knid");
        System.out.print("Avalin hadston ro vared konid : ");
        int i;
        
        for ( i=0 ; i<=2 ; ++i){
        while (guess != number){
            
            guess = input.nextInt();
            
            if(guess == number) {
                
                System.out.printf("Barikala, dorost hads zadi !!!!!! ");
            }
            else if (guess < number ){
                
                System.out.println("Boro bala tar :");
            }
            else if(guess > number){
                
                System.out.println("Che khabare bia paiin -_- :");
            }
            
            break;
            
            
            }
        
        }   
        System.out.println("Sorry, You lose");
    }
    
    
}
