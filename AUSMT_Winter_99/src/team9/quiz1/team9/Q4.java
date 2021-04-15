/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1.team9;

/**
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;

public class Q4 {
    public static void main(String[] args) {
       double salary;
       double tax = 0;
       int maritalStatus;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your marital status: [1]single,[2]married,\n[3]married filling"
               + "separately [4] head of household ");
       
       maritalStatus = input.nextInt();
       
       System.out.println("Now enter your salary:");
       
       salary = input.nextDouble();
       
       switch(maritalStatus){
           case 1:
               if (salary >= 0 && salary <= 8_350){
                   tax = salary * 0.1;
                   System.out.println("Your salary plus tax is" + tax);
                   break;
               }
               if(salary >= 8_351 && salary <=33_950){
                   tax = 8350 * 0.1 + (salary - 8350) * 0.15;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if(salary >= 33_951 && salary <= 82_250){
                   tax = 8_350 * 0.1 + (33.950 - 8350) * 0.15 + (salary - 33_950) * 0.25;
                    System.out.println("Your salary plus tax is" + tax );
                    break;
               }
               if (salary >= 82.251 && salary <= 171_550){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (salary - 82_250) * 0.28;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 171_551 && salary <= 372_950){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (171_550 - 82_250) * 0.28 + (salary - 171_550) * 0.33;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 372_951){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (171_550 - 82_250) * 0.28 + (372_950 - 171_550) * 0.33
                           + (salary - 372_950) * 0.35;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               break;
           case 2:
                if (salary >= 0 && salary <= 16_700){
                   tax = salary * 0.1;
                   System.out.println("Your salary plus tax is" + tax);
               }
               if(salary >= 16_701 && salary <=67_900){
                   tax = 16_700 * 0.1 + (salary - 16700) * 0.15;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if(salary >= 67_901 && salary <= 137_050){
                   tax = 16700 * 0.1 + (67_900 - 16700) * 0.15 + (salary - 67_900) * 0.25;
                    System.out.println("Your salary plus tax is" + tax );
                    break;
                 
               }
               if (salary >= 137_051 && salary <= 208_850){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (salary - 137_050) * 0.28;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 208_851 && salary <= 372_950){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (salary - 208_850) * 0.33;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 372_951){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 +
                           (salary - 372_950) * 0.35;        
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               break;
           case 3:
                 if (salary >= 0 && salary <= 8_350){
                   tax = salary * 0.1;
                   System.out.println("Your salary plus tax is" + tax);
                   break;
               }
               if(salary >= 8_351 && salary <=33_950){
                   tax = 8350 * 0.1 + (salary - 8350) * 0.15;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if(salary >= 33_951 && salary <= 68_525){
                   tax = 8_350 * 0.1 + (33.950 - 8350) * 0.15 + (salary - 33_950) * 0.25;
                    System.out.println("Your salary plus tax is" + tax );
                    break;
               }
               if (salary >= 68_525 && salary <= 104_425){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (salary - 68_525) * 0.28;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 104_426 && salary <= 186_475){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (104_426 - 68_525) * 0.28 + (salary - 104_426) * 0.33;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 186_476){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (104_426 - 68_525) * 0.28 + (186_475 - 104_426) * 0.33 + (salary - 186_475)* 0.35;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               break;
           case 4:
                 if (salary >= 0 && salary <= 11_950){
                   tax = salary * 0.1;
                   System.out.println("Your salary plus tax is" + tax);
                   break;
               }
               if(salary >= 11_951 && salary <=45_500){
                   tax = 11_950 * 0.1 + (salary - 11_950) * 0.15;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if(salary >= 45_501 && salary <= 117_450){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (salary - 45_500) * 0.25;
                    System.out.println("Your salary plus tax is" + tax );
               }
               if (salary >= 117_451 && salary <= 190_200){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (salary - 171_450) * 0.28;
                   
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 190_201 && salary <= 372_950){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (190_200 - 171_450) * 0.28 + (salary - 192_200 ) * 0.33;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               if (salary >= 372_951){
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (190_200 - 171_450) * 0.28 + (372_950 - 192_200 ) * 0.33 + (salary - 372_950) * 0.35;
                   System.out.println("Your salary plus tax is" + tax );
                   break;
               }
               break;
               
           default:
               System.out.print("your number is wrong please enter another one ");
               break;
       }
       
    }
    
}