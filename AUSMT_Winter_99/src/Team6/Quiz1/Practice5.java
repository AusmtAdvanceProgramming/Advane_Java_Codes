/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz1;

    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Practice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       double earning;
       double tax;
       int marital_status;
       
              
       System.out.println("Please Enter your marital status: single(1), married,married(2), filling separately(3), head of household(4): ");
       
       marital_status = input.nextInt();
       
       System.out.println("Enter your earning:");
       
       earning = input.nextDouble();
       
       switch(marital_status){
           case 1:
               if (earning >= 0 && earning <= 8350){
                   tax = earning * 0.1;
                   System.out.println("your   Tax is : " + tax);
                   break;
               }
               if(earning >= 8351 && earning <=33950){
                   tax = 8350 * 0.1 + (earning - 8350) * 0.15;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if(earning >= 33_951 && earning <= 82_250){
                   tax = 8350 * 0.1 + (33.950 - 8350) * 0.15 + (earning - 33950) * 0.25;
                    System.out.println("  Tax is : " + tax );
                    break;
               }
               if (earning >= 82.251 && earning <= 171_550){
                   tax = 8350 * 0.1 + (33_950 - 8350) * 0.15 +(82250 - 33950)*0.25
                           + (earning - 82_250) * 0.28;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 171_551 && earning <= 372_950){
                   tax = 8350 * 0.1 + (33950 - 8350) * 0.15 +(82250 - 33950)*0.25
                           + (171_550 - 82_250) * 0.28 + (earning - 171_550) * 0.33;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 372_951){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(82_250 - 33_950)*0.25
                           + (171_550 - 82_250) * 0.28 + (372_950 - 171_550) * 0.33
                           + (earning - 372_950) * 0.35;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               break;
           case 2:
                if (earning >= 0 && earning <= 16_700){
                   tax = earning * 0.1;
                   System.out.println("your   Tax is : " + tax);
                   break;
               }
               if(earning >= 16_701 && earning <=67_900){
                   tax = 16_700 * 0.1 + (earning - 16700) * 0.15;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if(earning >= 67_901 && earning <= 137_050){
                   tax = 16700 * 0.1 + (67_900 - 16700) * 0.15 + (earning - 67_900) * 0.25;
                    System.out.println("  Tax is : " + tax );
                    break;
               }
               if (earning >= 137_051 && earning <= 208_850){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (earning - 137_050) * 0.28;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 208_851 && earning <= 372_950){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (earning - 208_850) * 0.33;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 372_951){
                   tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 +(137_050 -67_900 )*0.25
                           + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 +
                           (earning - 372_950) * 0.35;        
                   System.out.println("  Tax is : " + tax );
                   break;
                   
               }
               break;
           case 3:
                 if (earning >= 0 && earning <= 8_350){
                   tax = earning * 0.1;
                   System.out.println("your  Tax is : " + tax);
                   break;
               }
               if(earning >= 8_351 && earning <=33_950){
                   tax = 8350 * 0.1 + (earning - 8350) * 0.15;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if(earning >= 33_951 && earning <= 68_525){
                   tax = 8_350 * 0.1 + (33.950 - 8350) * 0.15 + (earning - 33_950) * 0.25;
                    System.out.println("  Tax is : " + tax );
                    break;
               }
               if (earning >= 68_525 && earning <= 104_425){
                   tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +(68_525 - 33_950)*0.25
                           + (earning - 68_525) * 0.28;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 104_426 && earning <= 186_475){
                   tax = 8350 * 0.1 + (33950 - 8350) * 0.15 +(68525 - 33950)*0.25
                           + (104426 - 68525) * 0.28 + (earning - 104426) * 0.33;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 186_476){
                   tax = 8_350 * 0.1 + (33950 - 8350) * 0.15 +(68525 - 33950)*0.25
                           + (104426 - 68525) * 0.28 + (186_475 - 104_426) * 0.33 + (earning - 186475)* 0.35;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               break;
           case 4:
                 if (earning >= 0 && earning <= 11950){
                   tax = earning * 0.1;
                   System.out.println("  Tax is : " + tax);
                   break;
               }
               if(earning >= 11951 && earning <=45500){
                   tax = 11950 * 0.1 + (earning - 11950) * 0.15;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if(earning >= 45501 && earning <= 117450){
                   tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (earning - 45500) * 0.25;
                    System.out.println("  Tax is : " + tax );
                    break;
               }
               if (earning >= 117451 && earning <= 190200){
                   tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (171450 - 45500) * 0.25 +
                           (earning - 171450) * 0.28;
                   
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 190201 && earning <= 372950){
                   tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (171450 - 45500) * 0.25 +
                           (190200 - 171450) * 0.28 + (earning - 192200 ) * 0.33;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               if (earning >= 372_951){
                    tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (171450 - 45500) * 0.25 +
                           (190200 - 171450) * 0.28 + (372950 - 192200 ) * 0.33 + (earning - 372950) * 0.35;
                   System.out.println("  Tax is : " + tax );
                   break;
               }
               break;
               
           default:
               System.out.print("InValid Number ");
               break;
       }
        // TODO code application logic here
    }
}
