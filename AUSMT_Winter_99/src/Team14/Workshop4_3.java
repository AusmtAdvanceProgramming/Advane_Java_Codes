
package team14 ;

public class Workshop4_3 {
    public static void main (String[] args) {
        char[] string0=new char[5] ;
        char[] string1 ;
        //***
        System.out.println ("____________________") ;
        fillArray (string0) ;
        System.out.println ("__________") ;
        System.out.print ("Out of the method : ") ;
        System.out.println (string0) ;
        System.out.println ("__________") ;
        System.out.print ("Returned array : ") ;
        string1=returnArray (10) ;
        System.out.println (string1) ;
        System.out.println ("____________________") ;
    } // end of main () method
    public static void fillArray (char[] string) {
        for (int i=0;i<string.length;i++) {
            string[i]=(char) ('a'+Math.random ()*('z'-'a'+1)) ;
        } //  end of first for
        //***
        System.out.print ("In method : ") ;
        System.out.println (string) ;
    } // end of fillArray () method
    public static char[] returnArray (int num) {
        char[] string=new char[num] ;
        //***
        for (int j=0;j<string.length;j++) {
            string[j]=(char) ('a'+Math.random ()*('z'-'a'+1)) ;
        } // end of second for
        //***
        return string ;
    } // end of returnArray () method
} // end of Workshop4_3 class
