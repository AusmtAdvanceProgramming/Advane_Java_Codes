package team14.quiz3 ;

import java.util.Scanner ;
//...
public class Q1 {
    public static boolean Test (String Hex1) {
        String check1="0123456789ABCDEF" ;
        int[] check2=new int[Hex1.length ()] ;        
        int counter=0 ;
        int sum=0 ;
        int i=0 ;
        int j=0 ;
        int k=0 ;
        //...
        for (i=0;i<Hex1.length ();i++) {
            for (j=0;j<check1.length ();j++) {
                if (Hex1.charAt (i)==check1.charAt (j)) {
                    counter++ ;
                } // end of first if
            } // end of second for
            //...
            if (counter>0) {
                check2[i]=1 ;
            } // end of second if
            //...
            else {
                check2[i]=0 ;
            } // end of first else
            //...
            counter=0 ;
        } // end of first for
        //...
        for (k=0;k<Hex1.length ();k++) {
            sum+=check2[k] ;
        } // end of third for
        //...
        if (sum==Hex1.length ()) {
            return true ;
        } // end of third if
        //...
        else {
            return false ;
        } // end of second else
    } // end of Test () method
    public static void Convert (String Hex2) {
        int[] Hex=new int[Hex2.length ()] ;
        int dec=0 ;
        int l=0 ;
        int m=0 ;
        int n=0 ;
        //...
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
            } // end of first switch
        } // end of fourth for
        //...
        for (m=Hex.length-1;m>-1;m--,n++) {
            dec+=(Hex[m]*(Math.pow (16,n))) ;
        } // end of fifth for
        //...
        System.out.println ("The number \""+Hex2+"\" in Hexadecimal base is equal to \""+dec+"\" in Decimal base") ;
    } // end of Convert () method
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //...
        String hex ;
        boolean confirm ;
        //...
        System.out.println ("____________________") ;
        System.out.print ("Enter your desired \"Hexadecimal Number\" please : ") ;
        hex=input.next () ;
        System.out.println ("__________") ;
        //...
        hex=hex.toUpperCase () ;
        confirm=Test (hex) ;
        //...
        if (confirm) {
            System.out.println ("The entered string is valid") ;
            System.out.println ("__________") ;
            Convert (hex) ;
            System.out.println ("__________") ;
            System.out.println ("The converter function that defined in \"Java\" answers : "+Integer.parseInt (hex,16)) ;
        } // end of fourth if
        //...
        else {
            System.out.println ("The entered string is not valid") ;
        } // end of third else
        //...
        System.out.println ("____________________") ;
    } // end of main () method
} // end of Q1 class