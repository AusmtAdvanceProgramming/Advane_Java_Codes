/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_team9;
/**
 * @author Aliasghar ranjbar
 * @author zeynab karimizad
 */
import java.util.Scanner ;
public class Q1 {
    
    public static boolean Test (String Hex1) {
        String check1="0123456789ABCDEF" ;
        int[] check2=new int[Hex1.length ()] ;     
        int counter=0 ;
        int sum=0 ;
        int i=0 ;
        int j=0 ;
        int k=0 ;
        
        for  (i=0;i<Hex1.length ();i++) {
            for (j=0;j<check1.length ();j++) {
                if (Hex1.charAt (i)==check1.charAt (j)) {
                    counter++ ;
                } 
            } 
            
            if (counter>0) {
                check2[i]=1 ;
            }
            else {
                check2[i]=0 ;
            } 
            counter=0 ;
        } 
        for (k=0;k<Hex1.length ();k++) {
            sum+=check2[k] ;
        } 
        if (sum==Hex1.length ()) {
            return true ;
        } 
        
        else {
            return false ;
        } 
    } 
    public static void Convert (String Hex2) {
        int[] Hex=new int[Hex2.length ()] ;
        int dec=0 ;
        int x=0 ;
        int y=0 ;
        int z=0 ;
        
        for (x=0;x<Hex2.length ();x++) {
            switch (Hex2.charAt (x)) {
                case 'A' :
                    Hex[x]=10 ;
                    break ;
                case 'B' :
                    Hex[x]=11 ;
                    break ;
                case 'C' :
                    Hex[x]=12 ;
                    break ;
                case 'D' :
                    Hex[x]=13 ;
                    break ;
                case 'E' :
                    Hex[x]=14 ;
                    break ;
                case 'F' :
                    Hex[x]=15 ;
                    break ;
                default :
                    Hex[x]=Integer.parseInt (String.valueOf (Hex2.charAt (x))) ;
                    break ;
            } 
        } 
        for (y=Hex.length-1;y>-1;y--,z++) { 
            dec+=(Hex[y]*(Math.pow (16,z))) ;
        } 
        System.out.println ("The number \""+Hex2+"\" in Hexadecimal base is equal to \""+dec+"\" in Decimal base") ;
    } 
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        String hex ;
        boolean confirm ;
        
        System.out.print ("Enter your Hexadecimal Number : ") ;
        hex=input.next () ;
        System.out.println ("~~~~~~~~~~") ;
        
        hex=hex.toUpperCase () ;
        confirm=Test (hex) ;
        
        if (confirm) {
            System.out.println ("The entered string is valid") ;
            System.out.println ("~~~~~~~~~~") ;
            Convert (hex) ;
            System.out.println ("~~~~~~~~~~") ;
        } 
        else {
            System.out.println ("The entered string is not valid") ;
        } 
    } 
}