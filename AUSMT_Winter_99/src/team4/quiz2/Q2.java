/*
 * Q2.java
 */
package team4.quiz2 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q2 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        //***
        double deposit ;
        double profit ;
        double year ;
        double tempo1 ;
        double tempo2 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter the initial amount of your deposit please : $") ;
        deposit=input.nextDouble () ;
        System.out.print ("Enter the interest on your deposit please : %") ;
        profit=input.nextDouble () ;
        System.out.println ("__________") ;
        //***
        profit=1+(profit/100) ;
        year=(int) (((Math.log(2))/(Math.log(profit)))*10)/10.0 ;
        //***
        tempo1=(int) year ;
        tempo2=year-tempo1 ;
        //***
        tempo2=(int) (tempo2*12) ;
        //***
        System.out.println ("After \""+tempo1+"\" years and \""+tempo2+"\" months your deposit will double") ;
        System.out.println ("____________________") ;
    }
}
