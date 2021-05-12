/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2.team9;

/**
 *
 * @author ali asghar ranjbar & zeynab karimi zad
 */
import java.util.Scanner ;

public class Q2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double seporde;
        double sood;
        int temp1;
        int temp2;
        double year ;
        
        System.out.println ("**************************************") ;
        System.out.print ("MEQDAR SARMAYE AVALIE RA VARED KONID : $") ;
        seporde=input.nextDouble () ;
        System.out.print ("DARSAD SOD RA VARED KONID : %") ;
        sood=input.nextDouble () ;
        System.out.println ("-----------") ;
        
        sood=1+(sood/100);
        year=(int) (((Math.log(2))/(Math.log(sood)))*10)/10.0;
        
       temp1=(int) year ;
       temp2=(int) ((year-temp1)*10) ;
        
        temp2=(int) (temp2*12/10) ;
        
        System.out.println ("bad az \""+temp1+"\" sal va \""+temp2+"\" mah sarmaye shoma 2 barabar mishavad") ;
        System.out.println ("*********************") ;
    }
}