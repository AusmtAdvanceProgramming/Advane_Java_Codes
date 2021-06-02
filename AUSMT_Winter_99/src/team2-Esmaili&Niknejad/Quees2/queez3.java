/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class queez3 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        int dec ;
        String hex ;
        int kharej_qesmat ;
        int baqi_mande ;
        int marhale ;
        String marhale1 ;
        String marhale2="NULL" ;
        int movaqat ;
        String movaqat1 ;
        String movaqat2="NULL" ;
        int provision ;
        String provision1 ;
        String provision2="NULL" ;
        String output1 ; 
        String output2 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter your desired number please : ") ;
        dec=input.nextInt () ;
        System.out.println ("____") ;
        //*
        kharej_qesmat=dec/16 ;
        baqi_mande=dec%16 ;
        //*
        switch (kharej_qesmat) {
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
                output1=String.valueOf (kharej_qesmat) ;
                break ;
        }    
        //*
        if (dec>=256) {
            marhale=kharej_qesmat%16 ;
            kharej_qesmat/=16 ;
            //*
            switch (kharej_qesmat) {
                case 10 :
                    marhale1="A" ;
                    break ;
                case 11 :
                    marhale1="B" ;
                    break ;
                case 12 :
                    marhale1="C" ;
                    break ;
                case 13 :
                    marhale1="D" ;
                    break ;
                case 14 :
                    marhale1="E" ;
                    break ;
                case 15 :
                    marhale1="F" ;
                    break ; 
                default :
                    marhale1=String.valueOf (kharej_qesmat) ;
                    break ;
            }  
            //*
            switch (marhale) {
                case 10 :
                    marhale2="A" ;
                    break ;
                case 11 :
                    marhale2="B" ;
                    break ;
                case 12 :
                    marhale2="C" ;
                    break ;
                case 13 :
                    marhale2="D" ;
                    break ;
                case 14 :
                    marhale2="E" ;
                    break ;
                case 15 :
                    marhale2="F" ;
                    break ; 
                default :
                    marhale2=String.valueOf (marhale) ;
                    break ;
            }  
            //*
            output1=marhale1+marhale2 ;
        }
        //*
        if (dec>=4096) {
            movaqat=kharej_qesmat%16 ;
            kharej_qesmat/=16 ;
            //*
            switch (kharej_qesmat) {
                case 10 :
                    movaqat1="A" ;
                    break ;
                case 11 :
                    movaqat1="B" ;
                    break ;
                case 12 :
                    movaqat1="C" ;
                    break ;
                case 13 :
                    movaqat1="D" ;
                    break ;
                case 14 :
                    movaqat1="E" ;
                    break ;
                case 15 :
                    movaqat1="F" ;
                    break ; 
                default :
                    movaqat1=String.valueOf (kharej_qesmat) ;
                    break ;
            }
            //*
            switch (movaqat) {
                case 10 :
                    movaqat2="A" ;
                    break ;
                case 11 :
                    movaqat2="B" ;
                    break ;
                case 12 :
                    movaqat2="C" ;
                    break ;
                case 13 :
                    movaqat2="D" ;
                    break ;
                case 14 :
                    movaqat2="E" ;
                    break ;
                case 15 :
                    movaqat2="F" ;
                    break ; 
                default :
                    movaqat2=String.valueOf (movaqat) ;
                    break ;
            }
            //*
            output1=movaqat1+movaqat2+marhale2 ;
        }
        //*
        if (dec>=65536) {
            provision=kharej_qesmat%16 ;
            kharej_qesmat/=16 ;
            //*
            switch (kharej_qesmat) {
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
                    provision1=String.valueOf (kharej_qesmat) ;
                    break ;
            }
            //*
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
            //*
            output1=provision1+provision2+movaqat2+marhale2 ;
        }
        //*
        switch (baqi_mande) {
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
                output2=String.valueOf (baqi_mande) ;
                break ;
        }
        //*
        if (dec<=15) {
            hex=output2 ;
        }
        else {
            hex=output1+output2 ;
        }
        //*
        System.out.println ("The number \""+dec+"\" in Decimal base is equal to \""+hex+"\" in Hexadecimal base ") ;
        System.out.println ("____") ;
        System.out.println ("The Hexadecimal function that defined in \"Java\" answers : "+Integer.toHexString (dec).toUpperCase ()) ;
        System.out.println ("________") ;
    }
}

