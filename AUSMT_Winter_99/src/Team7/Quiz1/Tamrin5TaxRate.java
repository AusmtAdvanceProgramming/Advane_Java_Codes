
package Team7.Quiz1;

import java.util.Scanner;

public class Tamrin5TaxRate {

   
    
    public static void main(String[] args) {
       
        int status, income;
        double tax ;
//        int tax10 = 10/100;
//        inttax15
//        int tax35 = 35/100;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your status?(1-Single  2-Widow "
                + "3-Married filing separetely 4-Head of house)");
        status = input.nextInt();
        
        System.out.println("How much is your income? ");
        income = input.nextInt();
        
        if (status == 1) {
            if (income >= 372951) {
                tax = ( (income - 372951) * 0.35 )
                        + ( 201400 * 0.33 )
                        + ( 89299 * 0.28  )
                        + ( 48299 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );     
                System.out.println(tax);
                
            } else if (income >= 171551 && income <= 372950  ) {
                tax = ( (income - 171551) * 0.33)
                        + ( 89299 * 0.28  )
                        + ( 48299 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );  
                System.out.println(tax);
                
            } else if (income >= 82251 && income <= 171550  ) {
                tax = ( (income - 82251) * 0.28)
                        + ( 48299 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );
                 System.out.println(tax);
                 
            } else if (income >= 33951 && income <= 82250  ) {
                tax = ( (income - 33951) * 0.25)
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );
                 System.out.println(tax);
            } else if (income >= 8351 && income <= 33950  ) {
                tax = ( (income - 8351) * 0.15)
                        + ( 8350 * 0.1 );
                 System.out.println(tax);
            } else if (income <= 8350 ) {
                tax = ( income * 0.15);
                 System.out.println(tax);
            }
    } //SINGLE

     if (status == 2) {
            if (income >= 372951) {
                tax = ( (income - 372951) * 0.35 )
                        + ( 164099 * 0.33 )
                        + ( 71799 * 0.28  )
                        + ( 69149 * 0.25 )
                        + ( 51199 * 0.15 )
                        + ( 16700 * 0.1 );     
                System.out.println(tax);
                
            } else if (income >= 208851 && income <= 372950  ) {
                tax = ( (income - 171551) * 0.33)
                        + ( 71799 * 0.28  )
                        + ( 69149 * 0.25 )
                        + ( 51199 * 0.15 )
                        + ( 16700 * 0.1 );  
                System.out.println(tax);
                
            } else if (income >= 137051 && income <= 208850  ) {
                tax = ( (income - 82251) * 0.28)
                        + ( 69149 * 0.25 )
                        + ( 51199 * 0.15 )
                        + ( 16700 * 0.1 );
                 System.out.println(tax);
                 
            } else if (income >= 67901 && income <= 137050  ) {
                tax = ( (income - 33951) * 0.25)
                        + ( 51199 * 0.15 )
                        + ( 16700 * 0.1 );
                 System.out.println(tax);
            } else if (income >= 16701 && income <= 67900  ) {
                tax = ( (income - 8351) * 0.15)
                        + ( 8350 * 0.1 );
                 System.out.println(tax);
            } else if (income <= 16700 ) {
                tax = ( income * 0.15);
                 System.out.println(tax);
            }
    } //WIDOW
     
     if (status == 3) {
            if (income >= 186475) {
                tax = ( (income - 372951) * 0.35 )
                        + ( 82049 * 0.33 )
                        + ( 35899 * 0.28  )
                        + ( 34574 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );     
                System.out.println(tax);
                
            } else if (income >= 104426 && income <= 186475  ) {
                tax = ( (income - 104426) * 0.33)
                        + ( 35899 * 0.28  )
                        + ( 34574 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 );   
                System.out.println(tax);
                
            } else if (income >= 68526 && income <= 104425) {
                tax = ( (income - 82251) * 0.28)
                        + ( 34574 * 0.25 )
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 ); 
                 System.out.println(tax);
                 
            } else if (income >= 33951 && income <= 68525  ) {
                tax = ( (income - 33951) * 0.25)
                        + ( 25599 * 0.15 )
                        + ( 8350 * 0.1 ); 
                 System.out.println(tax);
            } else if (income >= 8351 && income <= 33950  ) {
                tax = ( (income - 8351) * 0.15)
                        + ( 8350 * 0.1 );
                 System.out.println(tax);
            } else if (income <= 8350 ) {
                tax = ( income * 0.15);
                 System.out.println(tax);
            }
    } //MARRIED FILING SEP
     
          if (status == 4) {
            if (income >= 372951) {
                tax = ( (income - 372951) * 0.35 )
                        + ( 182749 * 0.33 )
                        + ( 72749 * 0.28  )
                        + ( 71949 * 0.25 )
                        + ( 33549 * 0.15 )
                        + ( 11950 * 0.1 );     
                System.out.println(tax);
                
            } else if (income >= 190201 && income <= 372950  ) {
                tax = ( (income - 171551) * 0.33)
                        + ( 72749 * 0.28  )
                        + ( 71949 * 0.25 )
                        + ( 33549 * 0.15 )
                        + ( 11950 * 0.1 );  
                System.out.println(tax);
                
            } else if (income >= 117451 && income <= 190200  ) {
                tax = ( (income - 82251) * 0.28)
                        + ( 71949 * 0.25 )
                        + ( 33549 * 0.15 )
                        + ( 11950 * 0.1 );
                 System.out.println(tax);
                 
            } else if (income >= 45501 && income <= 117450  ) {
                tax = ( (income - 33951) * 0.25)
                        + ( 33549 * 0.15 )
                        + ( 11950 * 0.1 );
                 System.out.println(tax);
            } else if (income >= 11951 && income <= 45500  ) {
                tax = ( (income - 8351) * 0.15)
                        + ( 11950 * 0.1 );
                 System.out.println(tax);
            } else if (income <= 11950 ) {
                tax = ( income * 0.15);
                 System.out.println(tax);
            }
    } //head of household
        
    }
}
