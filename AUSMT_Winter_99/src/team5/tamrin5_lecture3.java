/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;
import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class tamrin5_lecture3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int status;
        double income,tax,total;
        System.out.println("Please enter your status as a number:");
        System.out.println("1----Single\n2----Married filing or Qualifying Widow(er)\n3----married filing separately\n4----Head of houshold\n______________________________________");
          
        status= input.nextInt();
        
        switch(status){
            
            case 1: System.out.println("Please enter your income:");
                    income=input.nextDouble();
                    
                    if(income<=8350){
                        tax=income*0.1;
                        total=income+tax;
                        System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=33950){
                            tax=income*1.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=82250){
                           tax=income*2.5;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=171550){
                            tax=income*2.8;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                           tax=income*3.3;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else {
                            tax=income*3.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                break;
            case 2: System.out.println("Please enter your income.");
                    income=input.nextDouble();
                    
                    if(income<=16700){
                       tax=income*0.1;
                       total=income+tax;
                       System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=67900){
                            tax=income*1.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=137050){
                            tax=income*2.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=208850){
                            tax=income*2.8;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                            tax=income*3.3;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                      else {
                            tax=income*3.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                break;
            case 3: System.out.println("Please enter your income.");
                    income=input.nextDouble();
                    
                    if(income<=8350){
                       tax=income*0.1;
                       total=income+tax;
                       System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=33950){
                           tax=income*1.5;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=68525){
                           tax=income*2.5;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=104425){
                            tax=income*2.8;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=186475){
                           tax=income*3.3;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else{
                        tax=income*3.5;
                        total=income+tax;
                        System.out.println("your total payment is:"+total+"$");
                    }
                break;
            case 4: System.out.println("Please enter your income.");
                    income=input.nextDouble();
                    
                    if(income<=11950){
                       tax=income*0.1;
                       total=income+tax;
                       System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=45500){
                            tax=income*1.5;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=117450){
                           tax=income*2.5;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=190200){
                            tax=income*2.8;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                            tax=income*3.3;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else{
                        tax=income*3.5;
                        total=income+tax;
                        System.out.println("your total payment is:"+total+"$");
                    }
                break;
            default: System.out.println("Error: invalid status please try again.");
            
        }
    }
}
