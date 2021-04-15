/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11.quiz1;
import java.util.Scanner;
/**
 *
 * @author Parsley
 */
public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int todaysCase,numberOfDays,totalDays,result;
        
        System.out.println("What day is it? (Enter the case):");
        System.out.println("Saturday  :  case0 \nSunday  :  case1 \nMonday  :  case2 \nTuesday  :  case3 \nWednesday  :  case4 \nThursday  :  case5 \nFriday  :  case6 ");
        
        todaysCase = input.nextInt();
        
        System.out.println("How many days left until the meeting?");
        
        numberOfDays = input.nextInt();
        
        totalDays=numberOfDays+todaysCase;
        result=totalDays%7;
        
        if(result==0)
            System.out.println("Your meeting will be on Saturday.");
        else if(result==1)
            System.out.println("Your meeting will be on Sunday.");
        else if(result==2)
            System.out.println("Your meeting will be on Monday.");
        else if(result==3)
            System.out.println("Your meeting will be on Tuesday.");
        else if(result==4)
            System.out.println("Your meeting will be on Wednesday.");
        else if(result==5)
            System.out.println("Your meeting will be on Thursday.");
        else
            System.out.println("Your meeting will be on Friday.");
        
                
    
    
    }
}
