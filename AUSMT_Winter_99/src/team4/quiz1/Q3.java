/*
 * Q3.java
 */
package team4.quiz1 ;
/**
 * @author Kamyab Ashouri
 * @author Fatemeh Naiji
 */
import java.util.Scanner ;
//***
public class Q3 {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ; 
        //***
        int cash ;        
        int temporary1=0 ;
        int temporary2=0 ;
        int temporary3=0 ;
        int temporary4=0 ;
        int temporary5=0 ;
        int temporary6=0 ;
        //***
        System.out.println ("____________________") ;
        System.out.print ("Enter your total cash (Less than $100,000) : ") ;
        cash=input.nextInt () ;
        System.out.println ("__________") ;
        //***
        if (cash%50000==0) {
            cash/=50000 ;
            System.out.println ("Your money divided into "+cash+" parts of $50000") ;  
        }
        else if (cash%50000!=0) {
            while (cash>50000) {
                cash-=50000 ;
                temporary1++ ;
            }
            System.out.println ("Your money divided into "+temporary1+" parts of $50000") ;
        }
        //***
        if (cash%10000==0) {
            cash/=10000 ;
            System.out.println ("Your money divided into "+cash+" parts of $10000") ;  
        }
        else if (cash%10000!=0) {
            while (cash>10000) {
                cash-=10000 ;
                temporary2++ ;
            }
            System.out.println ("Your money divided into "+temporary2+" parts of $10000") ;
        }
        //***
        if (cash%5000==0) {
            cash/=5000 ;
            System.out.println ("Your money divided into "+cash+" parts of $5000") ;  
        }
        else if (cash%5000!=0) {
            while (cash>5000) {
                cash-=5000 ;
                temporary3++ ;
            }
            System.out.println ("Your money divided into "+temporary3+" parts of $5000") ;
        }
        //***
        if (cash%2000==0) {
            cash/=2000 ;
            System.out.println ("Your money divided into "+cash+" parts of $2000") ;  
        }
        else if (cash%2000!=0) {
            while (cash>2000) {
                cash-=2000 ;
                temporary4++ ;
            }
            System.out.println ("Your money divided into "+temporary4+" parts of $2000") ;
        }
        //***
        if (cash%1000==0) {
            cash/=1000 ;
            System.out.println ("Your money divided into "+cash+" parts of $1000") ;  
        }
        else if (cash%1000!=0) {
            while (cash>1000) {
                cash-=1000 ;
                temporary5++ ;
            }
            System.out.println ("Your money divided into "+temporary5+" parts of $1000") ;
        }
        //***
        if (cash%500==0) {
            cash/=500 ;
            System.out.println ("Your money divided into "+cash+" parts of $500") ;  
        }
        else if (cash%500!=0) {
            while (cash>500) {
                cash-=500 ;
                temporary6++ ;
            }
            System.out.println ("Your money divided into "+temporary6+" parts of $500") ;
        }
        System.out.println ("____________________") ;
    }
}