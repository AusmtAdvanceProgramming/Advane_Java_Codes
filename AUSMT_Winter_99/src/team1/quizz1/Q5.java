/*
 Haniyeh Hadiyan -Hossein Rahi
 */
package team1.quizz1;

import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        
       double income;
       double tax = 0;
       int maritalStatus;
       
       Scanner input = new Scanner(System.in);
       
              
       System.out.println("Enter your marital status: [1]single,[2]married,\n[3]married filling separately [4] head of household ");
       
       maritalStatus = input.nextInt();
       
       System.out.println("Now enter your income:");
       
       income = input.nextDouble();
       
       switch(maritalStatus){
           case 1:
               if (income >= 0 && income <= 8_350){
                   tax = income * 0.1;
                   System.out.println("your  taxt is " + tax);
                   break;
               }
               if(income >= 8_351 && income <=33_950){
                   tax = 8350 * 0.1 + (income - 8350) * 0.15;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if(income >= 33_951 && income <= 82_250){
                   tax = 8_350 * 0.1 + (33.950 - 8350) * 0.15 + (income - 33_950) * 0.25;
                    System.out.println(" taxt is " + tax );
                    break;
               }
               if (income >= 82.251 && income <= 171_550){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (income - 82_250) * 0.28;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 171_551 && income <= 372_950){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (171_550 - 82_250) * 0.28 + (income - 171_550) * 0.33;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 372_951){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (171_550 - 82_250) * 0.28 + (372_950 - 171_550) * 0.33
                           + (income - 372_950) * 0.35;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               break;
           case 2:
                if (income >= 0 && income <= 16_700){
                   tax = income * 0.1;
                   System.out.println("your  taxt is " + tax);
                   break;
               }
               if(income >= 16_701 && income <=67_900){
                   tax = 16_700 * 0.1 + (income - 16700) * 0.15;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if(income >= 67_901 && income <= 137_050){
                   tax = 16700 * 0.1 + (67_900 - 16700) * 0.15 + (income - 67_900) * 0.25;
                    System.out.println(" taxt is " + tax );
                    break;
               }
               if (income >= 137_051 && income <= 208_850){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (income - 137_050) * 0.28;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 208_851 && income <= 372_950){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (income - 208_850) * 0.33;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 372_951){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 +
                           (income - 372_950) * 0.35;        
                   System.out.println(" taxt is " + tax );
                   break;
                   
               }
               break;
           case 3:
                 if (income >= 0 && income <= 8_350){
                   tax = income * 0.1;

System.out.println("your taxt is " + tax);
                   break;
               }
               if(income >= 8_351 && income <=33_950){
                   tax = 8350 * 0.1 + (income - 8350) * 0.15;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if(income >= 33_951 && income <= 68_525){
                   tax = 8_350 * 0.1 + (33.950 - 8350) * 0.15 + (income - 33_950) * 0.25;
                    System.out.println(" taxt is " + tax );
                    break;
               }
               if (income >= 68_525 && income <= 104_425){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (income - 68_525) * 0.28;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 104_426 && income <= 186_475){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (104_426 - 68_525) * 0.28 + (income - 104_426) * 0.33;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 186_476){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (104_426 - 68_525) * 0.28 + (186_475 - 104_426) * 0.33 + (income - 186_475)* 0.35;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               break;
           case 4:
                 if (income >= 0 && income <= 11_950){
                   tax = income * 0.1;
                   System.out.println("your  taxt is " + tax);
                   break;
               }
               if(income >= 11_951 && income <=45_500){
                   tax = 11_950 * 0.1 + (income - 11_950) * 0.15;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if(income >= 45_501 && income <= 117_450){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (income - 45_500) * 0.25;
                    System.out.println(" taxt is " + tax );
                    break;
               }
               if (income >= 117_451 && income <= 190_200){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (income - 171_450) * 0.28;
                   
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 190_201 && income <= 372_950){
                   tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (190_200 - 171_450) * 0.28 + (income - 192_200 ) * 0.33;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               if (income >= 372_951){
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (171_450 - 45_500) * 0.25 +
                           (190_200 - 171_450) * 0.28 + (372_950 - 192_200 ) * 0.33 + (income - 372_950) * 0.35;
                   System.out.println(" taxt is " + tax );
                   break;
               }
               break;
               
           default:
               System.out.print("your number is wrong please enter another one ");
               break;
       }
    }
}