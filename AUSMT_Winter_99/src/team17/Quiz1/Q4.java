/*team17.Quiz1.Q4
Salari & Sh'abani
@Author : Salari*/
//This program calaculate tax(US Federal)
package team17.Quiz1;

import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
            int group;
            double income, tax;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your group: (1<=group<=4)");
         group = input.nextInt();
         System.out.println("Enter your earnings: ");
         income = input.nextDouble();
         switch (group) {
             case 1:
             if (income>=0 && income<=8350) {
                 tax = income*0.1;
                 System.out.println("You are single and your tax is; "+tax); }
             if (income>=8351 && income<=33950) {
                 tax = (income-8350)*0.15 + 0.1*income;
                 System.out.println("You are single and your tax is; "+tax);
             }
             if (income>=33951 && income<=82250) {
                 tax = (income-33950)*0.25+income*0.15;
                 System.out.println("You are single and your tax is; "+tax);
             }
             if (income>=82251 && income<=171550) {
                 tax = (income-82250)*0.28+income*0.25;
                 System.out.println("You are single and your tax is; "+tax);
             }             
             if (income>=171551 && income<=372950) {
                 tax = (income-171550)*0.33+income*0.28;
                 System.out.println("You are single and your tax is; "+tax);
             }
             if (income>=372951) {
                 tax = (income-372950)*0.35+income*0.33;
                 System.out.println("You are single and your tax is; "+tax);
             }
             case 2:
             if (income>=0 && income<=16700) {
                 tax = income*0.1;
                 System.out.println("You are married jointly and your tax is; "+tax); }
             if (income>=16701 && income<=67900) {
                 tax = (income-16700)*0.15 + 0.1*income;
                 System.out.println("You are married jointly and your tax is; "+tax);
             }
             if (income>=67901 && income<=137050) {
                 tax = (income-67900)*0.25+income*0.15;
                 System.out.println("You are married jointly and your tax is; "+tax);
             }
             if (income>=137051 && income<=208850) {
                 tax = (income-137050)*0.28+income*0.25;
                 System.out.println("You are married jointly and your tax is; "+tax);
             }             
             if (income>=208851 && income<=372950) {
                 tax = (income-208850)*0.33+income*0.28;
                 System.out.println("You are married jointly and your tax is; "+tax);
             }
             if (income>=372951) {
                 tax = (income-372950)*0.35+income*0.33;
                 System.out.println("You are married jointly and your tax is; "+tax);
             }
             case 3:
             if (income>=0 && income<=8350) {
                 tax = income*0.1;
                 System.out.println("You are married filing separately and your tax is; "+tax); }
             if (income>=8351 && income<=33950) {
                 tax = (income-8350)*0.15 + 0.1*income;
                 System.out.println("You are married filing separately and your tax is; "+tax);
             }
             if (income>=33951 && income<=68525) {
                 tax = (income-33950)*0.25+income*0.15;
                 System.out.println("You are married filing separately and your tax is; "+tax);
             }
             if (income>=68526 && income<=104425) {
                 tax = (income-68525)*0.28+income*0.25;
                 System.out.println("You are married filing separately and your tax is; "+tax);
             }             
             if (income>=104426 && income<=186475) {
                 tax = (income-104425)*0.33+income*0.28;
                 System.out.println("You are married filing separately and your tax is; "+tax);
             }
             if (income>=186476) {
                 tax = (income-186475)*0.35+income*0.33;
                 System.out.println("You are married filing separately and your tax is; "+tax);
             }
             case 4:
             if (income>=0 && income<=11950) {
                 tax = income*0.1;
                 System.out.println("You are head of household and your tax is; "+tax); }
             if (income>=11951 && income<=45500) {
                 tax = (income-11950)*0.15 + 0.1*income;
                 System.out.println("You are head of household and your tax is; "+tax);
             }
             if (income>=45501 && income<=117450) {
                 tax = (income-45500)*0.25+income*0.15;
                 System.out.println("You are head of household and your tax is; "+tax);
             }
             if (income>=117451 && income<=190200) {
                 tax = (income-117450)*0.28+income*0.25;
                 System.out.println("You are head of household and your tax is; "+tax);
             }             
             if (income>=190201 && income<=372950) {
                 tax = (income-190200)*0.33+income*0.28;
                 System.out.println("You are head of household and your tax is; "+tax);
             }
             if (income>=372951) {
                 tax = (income-372950)*0.35+income*0.33;
                 System.out.println("You are head of household and your tax is; "+tax);
             }             
         } //end of switch() case ...         
        }//end of main() method    
}//end of Class
