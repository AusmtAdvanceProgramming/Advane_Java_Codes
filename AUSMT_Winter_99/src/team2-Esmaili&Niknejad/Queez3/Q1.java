/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class Q1 {
        public static boolean Test (String Hex1) {
        String hexas="0123456789ABCDEF" ;
        int[] check=new int[Hex1.length ()] ;        
        int counter=0 ;
        int sum=0 ;
        int i=0 ;
        int j=0 ;
        int k=0 ;
        //...
        for (i=0;i<Hex1.length ();i++) {
            for (j=0;j<hexas.length ();j++) {
                if (Hex1.charAt (i)==hexas.charAt (j)) {
                    counter++ ;
                } 
            if (counter>0) {
                check[i]=1 ;
            } 
            else {
                check[i]=0 ;
            } 
            counter=0 ;
        } 
        for (k=0;k<Hex1.length ();k++) {
            sum+=check[k] ;
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
        int l=0 ;
        int m=0 ;
        int n=0 ;
        for (l=0;l<Hex2.length ();l++) {
            switch (Hex2.charAt (l)) {
                case 'A' :
                    Hex[l]=10 ;
                    break ;
                case 'B' :
                    Hex[l]=11 ;
                    break ;
                case 'C' :
                    Hex[l]=12 ;
                    break ;
                case 'D' :
                    Hex[l]=13 ;
                    break ;
                case 'E' :
                    Hex[l]=14 ;
                    break ;
                case 'F' :
                    Hex[l]=15 ;
                    break ;
                default :
                    Hex[l]=Integer.parseInt (String.valueOf (Hex2.charAt (l))) ;
                    break ;
            } 
        } 
        for (m=Hex.length-1;m>-1;m--,n++) {
            dec+=(Hex[m]*(Math.pow (16,n))) ;
        } 
        System.out.println ("The number \""+Hex2+"\" in Hexadecimal base is equal to \""+dec+"\" in Decimal base") ;
    } 
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;      
        String hex ;
        boolean confirm ;
        System.out.println ("________") ;
        System.out.print ("Enter your desired \"Hexadecimal Number\" please : ") ;
        hex=input.next () ;
        System.out.println ("____") ;
        hex=hex.toUpperCase () ;
        confirm=Test (hex) ;
        if (confirm) {
            System.out.println ("The entered string is valid") ;
            System.out.println ("____") ;
            Convert (hex) ;
            System.out.println ("____") ;
            System.out.println ("The converter function that defined in \"Java\" answers : "+Integer.parseInt (hex,16)) ;
        }
        else {
            System.out.println ("The entered string is not valid") ;
        } 
        System.out.println ("________") ;
    }
}
