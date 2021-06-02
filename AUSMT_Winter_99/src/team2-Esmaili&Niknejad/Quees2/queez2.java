/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class queez2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //*
        double seporde ;
        double sood ;
        double zakhire ;
        double ezafe ;
        int sal=0 ;
        //*
        System.out.println ("________") ;
        System.out.print ("Enter the initial amount of your deposit please : $") ;
        seporde=input.nextDouble () ;
        System.out.print ("Enter the interest on your deposit please : %") ;
        sood=input.nextDouble () ;
        System.out.println ("____") ;
        //*
        zakhire=seporde*2 ;
        //*
        while (seporde<zakhire) {
            seporde=seporde+((seporde*sood)/100) ;
            sal++ ;
        }
        //*
        ezafe=seporde-zakhire ;
        //*
        System.out.println ("After \""+sal+"\" years your deposit will double") ;
        //*
        if (ezafe>0) {
            System.out.println ("Now you have \"$"+ezafe+"\" more than double your deposit") ;
        }
        //*
        System.out.println ("________") ;
    }
}

