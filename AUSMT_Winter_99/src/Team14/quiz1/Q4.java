package Team14.quiz1 ;

import java.util.Scanner ;

public class Q4 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double hatch ;
        double tax ;
        int status ;
        
        tax=0 ;
        
        System.out.println ("____________________") ;
        System.out.println ("Enter 1 for single , 2 for married , 3 for married filling separately , 4 for head of household") ;
        System.out.print ("Enter your status : ") ;
        status=input.nextInt () ;
        System.out.println ("__________") ;
        System.out.print ("Enter your hatch : ") ;
        hatch=input.nextDouble () ;
        System.out.println ("__________") ;
        
        switch (status) {
            case 1 :
                if (hatch>=0 && hatch<=8350) {
                    tax=hatch*0.1 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=8351 && hatch<=33950) {
                    tax=8350*0.1+(hatch-8350)*0.15 ;
                    System.out.println ("tax is " +tax ) ;
                    break ;
                }
                
                if (hatch>=33951 && hatch<=82250) {
                    tax=8350*0.1+(33.950-8350)*0.15+(hatch-3950)*0.25 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=82.251 && hatch<=171550) {
                    tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(hatch-82250)*0.28 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=171551 && hatch<=372950) {
                    tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(hatch-171550)*0.33 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=372951) {
                    tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(hatch-372950)*0.35 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                break ;
                
            case 2 :
                if (hatch>=0 && hatch<=16700) {
                    tax=hatch*0.1 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=16701 && hatch<=67900) {
                    tax=16700*0.1+(hatch-16700)*0.15 ;
                    System.out.println ("taxt is "+tax) ;
                    break ;
                }
                
                if (hatch>=67901 && hatch<=137050) {
                    tax=16700*0.1+(67900-16700)*0.15+(hatch-67900)*0.25 ;
                     System.out.println ("taxt is "+tax) ;
                     break ;
                }
                
                if (hatch>=137051 && hatch<=208850) {
                    tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(hatch-137050)*0.28 ;
                    System.out.println ("taxt is "+tax) ;
                    break ;
                }
                
                if (hatch>=208851 && hatch<=372950) {
                    tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(hatch-208850)*0.33 ;
                    System.out.println ("taxt is "+tax) ;
                    break ;
                }
               
                if (hatch>=372951) {
                    tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33 +(hatch-372950)*0.35 ;        
                    System.out.println ("taxt is "+tax) ;
                    break ;
                }
                
                break ;
                
            case 3 :
                if (hatch>=0 && hatch<=8350) {
                    tax=hatch*0.1 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=8351 && hatch<=33950) {
                    tax=8350*0.1+(hatch-8350)*0.15 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=33951 && hatch<=68525) {
                    tax=8350*0.1+(33.950-8350)*0.15+(hatch-33950)*0.25 ;
                     System.out.println ("tax is "+tax) ;
                     break ;
                }
                
                if (hatch>=68525 && hatch<=104425) {
                    tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(hatch-68525)*0.28 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=104426 && hatch<=186475) {
                    tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104426-68525)*0.28+(hatch-104426)*0.33 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
               
                if (hatch>=186476) {
                    tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104426-68525)*0.28+(186475-104426)*0.33+(hatch-186475)*0.35 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                break ;
                
            case 4 :
                  if (hatch>=0 && hatch<=11950) {
                    tax=hatch*0.1 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                  
                if (hatch>=11951 && hatch<=45500) {
                    tax=11950*0.1+(hatch-11950)*0.15 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                //***
                if (hatch>=45501 && hatch<=117450) {
                    tax=11950*0.1+(45500-11950)*0.15+(hatch-45500)*0.25 ;
                     System.out.println ("tax is "+tax) ;
                     break ;
                }
                //***
                if (hatch>=117451 && hatch<=190200) {
                    tax=11950*0.1+(45500-11950)*0.15+(171450-45500)*0.25+(hatch-171450)*0.28 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                //***
                if (hatch>=190201 && hatch<=372950) {
                    tax=11950*0.1+(45500-11950)*0.15+(171450-45500)*0.25+(190200-171450)*0.28+(hatch-192200)*0.33 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                if (hatch>=372951) {
                     tax=11950*0.1+(45500-11950)*0.15+(171450-45500)*0.25+(190200-171450)*0.28+(372950-192200)*0.33+(hatch-372950)*0.35 ;
                    System.out.println ("tax is "+tax) ;
                    break ;
                }
                
                break ;
                
            default :
                System.out.println ("wrong number") ;
                break ;
        }
        
        System.out.println ("____________________") ;
    }
}