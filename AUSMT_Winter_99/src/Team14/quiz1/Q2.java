package Team14.quiz1 ;

import java.util.Scanner ;

public class Q2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        int now ;
        int date ;
        int day ;
        
        System.out.println ("____________________") ;
        System.out.println ("Saturday=0 , Sunday=1 , Monday=2 , Tuesday=3 , Wednesday=4 , Thursday=5 , Friday=6") ;
        System.out.println ("__________") ;
        System.out.print ("Enter the current date : ") ;
        now=input.nextInt() ;
        System.out.print ("Enter the number of days remaining : ") ;
        day=input.nextInt() ;
        System.out.println ("__________") ;
        
        while (day>=7) {
            day-=7 ;  
        }
        
        date=now+day ;
        
        while (date>7) {
            date-=7;
        }
        
        System.out.println ("Your appointment is on : ") ;
        switch (date) {
            case 0 :
                System.out.print ("Saturday") ;
                break ;
            case 1 :
                System.out.print ("Sunday") ;
                break ;
            case 2 :
                System.out.print ("Monday") ;
                break ;
            case 3 :
                System.out.print ("Tuesday") ;
                break ;
            case 4 :
                System.out.print ("Wednesday") ;
                break ;
            case 5 :
                System.out.print ("Thursday") ;
                break ;
            case 6 :
                System.out.print ("Friday") ;
                break ;
            default :
                break ;
        }
        
        System.out.println ("\n____________________") ;
    }
}