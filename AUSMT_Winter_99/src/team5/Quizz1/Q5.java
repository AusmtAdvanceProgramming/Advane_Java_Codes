/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.Quizz1;

import java.util.Scanner;

/**
 *
 * @author Rayamin
 */
public class Q5 {
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
                            tax=8350*0.1+(income - 8350)*0.15;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=82250){
                           tax=8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=171550){
                            tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                           tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28+(income-171550)*0.33;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else {
                            tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;
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
                            tax=16700*0.1+(income-16700)*0.15;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=137050){
                            tax=16700*0.1+(67900-16700)*0.15+(income-679000)*0.25;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=208850){
                            tax=16700*0.1+(67900-16700)*0.15+(137050-679000)*0.25+(income-137050)*0.28;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                            tax=16700*0.1+(67900-16700)*0.15+(137050-679000)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                      else {
                            tax=16700*0.1+(67900-16700)*0.15+(137050-679000)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(income-372950)*0.35;
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
                           tax=8350*0.1+(income-8350)*0.15;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=68525){
                           tax=8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=104425){
                            tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(income-68525)*0.28;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=186475){
                           tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104426-68525)*0.28+(income-104426)*0.33;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else{
                        tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104426-68525)*0.28+(186475-104426)*0.33+(income-186475)*0.35;
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
                            tax=11950*0.1+(income-11950)*0.15;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=117450){
                           tax=11950*0.1+(45500-11950)*0.15+(income-45500)*0.25;
                           total=income+tax;
                           System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=190200){
                            tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(income-117450)*0.28;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else if(income<=372950){
                            tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-192200)*0.33;
                            total=income+tax;
                            System.out.println("your total payment is:"+total+"$");
                    }
                    else{
                        tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-192200)*0.33+(income-37250)*0.35;
                        total=income+tax;
                        System.out.println("your total payment is:"+total+"$");
                    }
                break;
            default: System.out.println("Error: invalid status please try again.");
            
        }
    }
}


    

