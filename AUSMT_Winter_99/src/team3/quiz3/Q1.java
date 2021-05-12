/*
 * Q1.java
 */
package team3.quiz3 ;
/**
 * @author amirali ghaumi
 * @author naser riazi
 * team3
 */
import java.util.Scanner ;
//...
public class Q1 {
    
        public static void main (String[] args) {
        
        String hex ;
        boolean confirm ;
        
        Scanner input = new Scanner(System.in) ;
        System.out.println("***************************");
        
        System.out.println("Enter your \"Hexadecimal base Number\" "
                + "\nto convert into \"decimal base number\" : ") ;
        hex = input.next();
       
        hex = hex.toUpperCase () ;
        confirm = Test(hex) ;
      
        if (confirm) {
            System.out.println("***************************");
            
            System.out.println ("The entered hexidecimal number is valid") ;
            Convert (hex);
            
           
        } 
        
        else {
            
            System.out.println ("The entered string is not valid") ;
            System.out.println("***************************");
        } 
       
    } 
     
    public static boolean Test (String Hex1) {
        String check1 = "0123456789ABCDEF" ;
        int[] check2 = new int[Hex1.length ()] ;        
        int counter = 0 ;
        int sum = 0 ;
        
        
        for (int i = 0; i < Hex1.length(); i++) {
            
            for (int j = 0; j < check1.length(); j++) {
                
                if (Hex1.charAt(i) == check1.charAt(j)) {
                    counter++ ;
                } 
            } 
            if (counter>0) {
                check2[i] = 1 ;
            } 
            
            else {
                check2[i] = 0 ;
            } 
   
            counter=0 ;
        } 
        for (int k = 0;k < Hex1.length ();k++) {
            sum += check2[k] ;
        }
        if (sum == Hex1.length ()) {
            
            return true ;
        } 
        
        else {
            
            return false ;
        } 
    } //end of test method
    public static void Convert (String Hex2) {
        
        int[] Hex = new int[Hex2.length ()] ;
        int decimal = 0 ;
        
        //...
        for ( int l= 0; l < Hex2.length();l++) {
            
            switch (Hex2.charAt(l)) {
                case 'A' :
                    Hex[l] = 10 ;
                    break ;
                case 'B' :
                    Hex[l] = 11 ;
                    break ;
                case 'C' :
                    Hex[l] = 12 ;
                    break ;
                case 'D' :
                    Hex[l] = 13 ;
                    break ;
                case 'E' :
                    Hex[l] = 14 ;
                    break ;
                case 'F' :
                    Hex[l] = 15 ;
                    break ;
                default :
                    Hex[l] = Integer.parseInt (String.valueOf (Hex2.charAt (l))) ;
                    break ;
            } 
        }  
        for (int m = Hex.length-1, n = 0;m > -1; m--, n++) {
            
            decimal += (Hex[m] * (Math.pow(16,n))) ;
        } //end of convert method
        
        System.out.println (" The number \"" + Hex2 + "\" in Hexadecimal base is equal to \""+ decimal + "\" in Decimal base") ;
        System.out.println("***************************");
    } 

} 