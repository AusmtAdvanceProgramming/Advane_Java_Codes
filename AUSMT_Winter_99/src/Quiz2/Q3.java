// question 4
package team10.quiz2 ;
// Sina gholizadeh and Amir Rasuli
import java.util.Scanner ;

public class Q3 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        int dec ;
        String hex ;
        int quotient ;
        int remaining ;
        int tempo ;
        String tempo1 ;
        String tempo2="NULL" ;
        int interim ;
        String interim1 ;
        String interim2="NULL" ;
        int provision ;
        String provision1 ;
        String provision2="NULL" ;
        String output1 ; 
        String output2 ;
        
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired number please : ") ;
        dec=input.nextInt () ;
        System.out.println ("__________") ;
        
        quotient=dec/16 ;
        remaining=dec%16 ;
        
        switch (quotient) {
            case 10 :
                output1="A" ;
                break ;
            case 11 :
                output1="B" ;
                break ;
            case 12 :
                output1="C" ;
                break ;
            case 13 :
                output1="D" ;
                break ;
            case 14 :
                output1="E" ;
                break ;
            case 15 :
                output1="F" ;
                break ; 
            default :
                output1=String.valueOf (quotient) ;
                break ;
        }    
        
        if (dec>=256) {
            tempo=quotient%16 ;
            quotient/=16 ;
            
            switch (quotient) {
                case 10 :
                    tempo1="A" ;
                    break ;
                case 11 :
                    tempo1="B" ;
                    break ;
                case 12 :
                    tempo1="C" ;
                    break ;
                case 13 :
                    tempo1="D" ;
                    break ;
                case 14 :
                    tempo1="E" ;
                    break ;
                case 15 :
                    tempo1="F" ;
                    break ; 
                default :
                    tempo1=String.valueOf (quotient) ;
                    break ;
            }  
            
            switch (tempo) {
                case 10 :
                    tempo2="A" ;
                    break ;
                case 11 :
                    tempo2="B" ;
                    break ;
                case 12 :
                    tempo2="C" ;
                    break ;
                case 13 :
                    tempo2="D" ;
                    break ;
                case 14 :
                    tempo2="E" ;
                    break ;
                case 15 :
                    tempo2="F" ;
                    break ; 
                default :
                    tempo2=String.valueOf (tempo) ;
                    break ;
            }  
            
            output1=tempo1+tempo2 ;
        }
        
        if (dec>=4096) {
            interim=quotient%16 ;
            quotient/=16 ;
            
            switch (quotient) {
                case 10 :
                    interim1="A" ;
                    break ;
                case 11 :
                    interim1="B" ;
                    break ;
                case 12 :
                    interim1="C" ;
                    break ;
                case 13 :
                    interim1="D" ;
                    break ;
                case 14 :
                    interim1="E" ;
                    break ;
                case 15 :
                    interim1="F" ;
                    break ; 
                default :
                    interim1=String.valueOf (quotient) ;
                    break ;
            }
            
            switch (interim) {
                case 10 :
                    interim2="A" ;
                    break ;
                case 11 :
                    interim2="B" ;
                    break ;
                case 12 :
                    interim2="C" ;
                    break ;
                case 13 :
                    interim2="D" ;
                    break ;
                case 14 :
                    interim2="E" ;
                    break ;
                case 15 :
                    interim2="F" ;
                    break ; 
                default :
                    interim2=String.valueOf (interim) ;
                    break ;
            }
            
            output1=interim1+interim2+tempo2 ;
        }
        
        if (dec>=65536) {
            provision=quotient%16 ;
            quotient/=16 ;
            
            switch (quotient) {
                case 10 :
                    provision1="A" ;
                    break ;
                case 11 :
                    provision1="B" ;
                    break ;
                case 12 :
                    provision1="C" ;
                    break ;
                case 13 :
                    provision1="D" ;
                    break ;
                case 14 :
                    provision1="E" ;
                    break ;
                case 15 :
                    provision1="F" ;
                    break ; 
                default :
                    provision1=String.valueOf (quotient) ;
                    break ;
            }
            
            switch (provision) {
                case 10 :
                    provision2="A" ;
                    break ;
                case 11 :
                    provision2="B" ;
                    break ;
                case 12 :
                    provision2="C" ;
                    break ;
                case 13 :
                    provision2="D" ;
                    break ;
                case 14 :
                    provision2="E" ;
                    break ;
                case 15 :
                    provision2="F" ;
                    break ; 
                default :
                    provision2=String.valueOf (provision) ;
                    break ;
            }
            
            output1=provision1+provision2+interim2+tempo2 ;
        }
    
        switch (remaining) {
            case 10 :
                output2="A" ;
                break ;
            case 11 :
                output2="B" ;
                break ;
            case 12 :
                output2="C" ;
                break ;
            case 13 :
                output2="D" ;
                break ;
            case 14 :
                output2="E" ;
                break ;
            case 15 :
                output2="F" ;
                break ; 
            default :
                output2=String.valueOf (remaining) ;
                break ;
        }
        
        if (dec<=15) {
            hex=output2 ;
        }
        else {
            hex=output1+output2 ;
        }
        
        System.out.println ("The number \""+dec+"\" in Decimal base is equal to \""+hex+"\" in Hexadecimal base ") ;
        System.out.println ("__________") ;
        System.out.println ("The Hexadecimal function that defined in \"Java\" answers : "+Integer.toHexString (dec).toUpperCase ()) ;
        System.out.println ("____________________") ;
    }
}