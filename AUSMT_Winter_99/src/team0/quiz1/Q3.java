package team0.quiz1;

import java.util.Scanner ;

 //author Amirhossein Ghaffari
 //author Ashkan Rasouli
 
public class Q3 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double cash ;
        int division ;
        double section1 ;
        double section2 ;
        double section3 ;
        double section4 ;
        double section5 ;
        double section6 ;
        
        System.out.println ("____________________") ;
        System.out.print ("Enter your total cash (Less than $100,000) : ") ;
        cash=input.nextDouble () ;
        System.out.println ("__________") ;
        System.out.println ("Enter 1 for 50000 , 2 for 10000 , 3 for 5000 , 4 for 2000 , 5 for 1000 , 6 for 500") ;
        System.out.print ("Enter the divisor against : ") ;
        division=input.nextInt () ;
        System.out.println ("__________") ;
        
        switch (division) {
            case 1 :
                section1=cash/50000 ;
                System.out.println (section1+" , $50000 bills") ;
                break ;

            case 2 :
                section2=cash/10000 ;
                System.out.println (section2+" , $10000 bills") ;
                break ;

            case 3 :
                section3=cash/5000 ;
                System.out.println (section3+" , $5000 bills") ;
                break ;

            case 4 :
                section4=cash/2000 ;
                System.out.println (section4+" , $2000 bills") ;
                break ;

            case 5 :
                section5=cash/1000 ;
                System.out.println (section5+" , $1000 bills") ; 
                break ;

            case 6 :
                section6=cash/500 ;
                System.out.println (section6+" , $500 bills") ;
                break ;
            default :
                break ;
         }
        
        System.out.println ("____________________") ;
    }
}