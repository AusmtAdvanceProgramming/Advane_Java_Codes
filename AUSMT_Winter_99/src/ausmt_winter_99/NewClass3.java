/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author rayan1
 */
public class NewClass3 { 
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        //variable ceclartion
        int totalMiliseconds;
        int hours, minutes, seconds, miliseconds;
        //Getting input from user
        
        System.out.println("Please enter total msec's");
        totalMiliseconds = input.nextInt();
        
        miliseconds = totalMiliseconds % 1000;
        seconds = totalMiliseconds / 1000;
        
        minutes = seconds / 60;
        seconds = seconds % 60;
        
        hours = minutes / 60;
        minutes = minutes % 60;
        
        System.out.println("Total " + totalMiliseconds + 
                           "ms means it's been working for ");
        
        System.out.println(hours + ":");
        System.out.println(minutes + ":");
        System.out.println(seconds +" ");
        System.out.println(miliseconds + "ms (h:m:s ms)\n");

    }//end of method
    
}//end of class
