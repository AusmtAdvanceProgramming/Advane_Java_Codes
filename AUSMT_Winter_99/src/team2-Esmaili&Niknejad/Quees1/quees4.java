
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class quees4 {
    public static void main(String[] args) {
    
    int mablagh;
    int Amounts;
    int mablagh1;
    int mablagh2;
    int mablagh3;
    int mablagh4;
    int mablagh5;
    int mablagh6;
    
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("mablagh mored nazar ra vared konid(mablagh kamtar az 100000 bashd) :");
    mablagh = input.nextInt();
   
        
    System.out.print("mablagh shoma ba che mabaleghi khord shavad?:"
              + "\n [1]-50000$ \n [2]-10000 \n [3]-5000 \n [4]-2000 \n [5]-1000 \n [6]-500" );
    
    Amounts = input.nextInt();
    
    switch(Amounts) {
        
        case 1 :
            mablagh1=mablagh/50000;
            System.out.print(mablagh1);
            System.out.print("to $ 50000");
            break;
            
       case 2 :
            mablagh2=mablagh/10000;
            System.out.print(mablagh2);  
            System.out.print("to $ 10000"); 
            break;
            
        case 3 :
            mablagh3=mablagh/5000;
            System.out.print(mablagh3); 
            System.out.print("to $ 5000"); 
            break;
            
        case 4 :
            mablagh4=mablagh/2000;
            System.out.print(mablagh4); 
            System.out.print("to $ 500");
            break;
            
        case 5 :
            mablagh5=mablagh/1000;
            System.out.print(mablagh5); 
            System.out.print("to $ 1000"); 
            break;
            
        case 6 :
            mablagh6=mablagh/500;
            System.out.print(mablagh6); 
            System.out.print("to $ 500"); 
            break;          
     }   
   }
 }
    
