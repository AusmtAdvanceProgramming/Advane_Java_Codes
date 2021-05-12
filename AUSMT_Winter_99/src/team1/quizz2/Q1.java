//*
  //Haniyeh Hadiyan _ Hossein Rahi
 
package team1.quizz2;

import java.util.Scanner;

public class Q1 {
    
    public static void main (String[] args) {
        
               
        Scanner input=new Scanner (System.in) ;
        
        String text ;
        String letter;
        int the_length , counter=0 , i=0 , j=0 ;
        
        //--------------------------------------------------------------
        
        System.out.print ("Please enter the desired text : ") ;
        text=input.next () ;
        letter=text;
        
        //-------------------------------------------------------------
        
        the_length=text.length () ;
        text=text.toLowerCase () ;
        letter=letter.toLowerCase () ;
        
        //------------------------------------------------------------
        
        for (i=0; i<the_length ;i++) {
            
            if(text.charAt (i) == '&'){
                continue;
        }
            
        //-----------------------------------------------------------  
            for (j=0; j<the_length; j++) {
               
                if (text.charAt (i)==text.charAt (j)) {
                    counter++ ;
                }
            }
        //-------------------------------------------------------------
        
        if (counter >= 2) {
                text=text.replace (text.charAt (i),'&');
            }
        
            System.out.println ("The text : "+text.charAt (i)+"Number of letters desired :"+counter) ;
            
            counter=0 ;
        }
    }
} //The end