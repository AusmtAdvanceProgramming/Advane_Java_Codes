/*
   Haniyeh Hadiyaqn _ Hossein Rahi
 */
package team1.quizz3;

import java.util.Scanner;

public class Q1 {
    
     public static boolean Teste_adad (String mabna16_1) {
         
        String barrasi_1="0123456789ABCDEF" ; // barasie dorosti adad   ba moqayese reshte
        int[] barrasi_2=new int[mabna16_1.length ()] ;   // barasie dorosti adad    
        int shomarande=0 ; //barasi mojod bodane har harf
        int sum=0 ; //majmoe tedad adade moshabeh
        int i=0 ;
        int j=0 ;
        int k=0 ;
        //...
        for (i=0; i<mabna16_1.length (); i++) {
            for (j=0 ;j<barrasi_1.length (); j++) {
                if (mabna16_1.charAt (i)==barrasi_1.charAt (j)) {
                    shomarande++ ;
                } 
            } 
            
            if (shomarande > 0) {
                barrasi_2[i]=1 ;
            } 
            
            else {
                barrasi_2[i]=0 ;
            } 
            
            shomarande=0 ;
        } 
        
        for (k=0; k<mabna16_1.length (); k++) {
            sum+=barrasi_2[k] ;
        } //majmoe tedad adade moshabeh
        
        if (sum==mabna16_1.length ()) {
            return true ;
        } //adad vojod darad
        
        else {
            return false ;
        } //adad vojod nadarad
    } 
     
     //----------------------------------------------------------
     
    public static void tabdile_nahaie (String mabna16_2) {
        int[] tabdil=new int[ mabna16_2.length ()] ;
        int mabna_10=0 ;
        int l=0 ;
        int m=0 ;
        int t=0 ; //tavan
        
        for (l=0;l< mabna16_2.length ();l++) {
            switch ( mabna16_2.charAt (l)) {
                case 'A' :
                    tabdil[l]=10 ;
                    break ;
                case 'B' :
                    tabdil[l]=11 ;
                    break ;
                case 'C' :
                    tabdil[l]=12 ;
                    break ;
                case 'D' :
                    tabdil[l]=13 ;
                    break ;
                case 'E' :
                    tabdil[l]=14 ;
                    break ;
                case 'F' :
                    tabdil[l]=15 ;
                    break ;
                default :
                    tabdil[l]=Integer.parseInt (String.valueOf ( mabna16_2.charAt (l))) ;
                    break ;  //charektere morede nazar ra be meqdare sahih tabdil mikonim
            } 
        } // tabdile horof mabnaie 16 be adad
        
        for (m=tabdil.length-1; m>-1 ;m-- , t++) {
            mabna_10+=(tabdil[m]*(Math.pow (16,t))) ;
        } 
        
        System.out.println ("adade"+ mabna16_2+"\" mabnaie 16 , va adade \""+mabna_10+"\" mabnaie 10 e an ast") ;
    } // adade mabnaie 16 ra ba mabnaie 10 taqir midahad
    
    //---------------------------------------------------------------
    
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        String mabna_16 ;
        boolean taied ;
        
        
        System.out.print ("adade bar mabnaie 16 (Hexadecimal)ra vared konid: ") ;
         mabna_16=input.next () ;
        
        mabna_16= mabna_16.toUpperCase () ; //baraie switch
        taied=Teste_adad ( mabna_16) ;
     
        if (taied) {
            System.out.println ("reshte vared shode motabar ast") ;
            tabdile_nahaie( mabna_16) ;

        } 
       
        else {
            System.out.println ("reshte vared shode motabar nist") ;
        } 
        
        
    } 
} //The end
    
   
