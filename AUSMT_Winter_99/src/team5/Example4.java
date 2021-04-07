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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        long totalMiliseconds;
        long hours,minutes,seconds,miliseconds;
        long currentHour,currentMinute,currentSecond;
        
        totalMiliseconds=System.currentTimeMillis();
        
        miliseconds=totalMiliseconds%1000;
        seconds=totalMiliseconds/1000;
        
        minutes=seconds/60;
        seconds=seconds%60;
        
        hours=minutes/60;
        minutes=minutes%60;
        
        currentSecond=seconds %60;
        currentMinute=minutes%60;
        currentHour=hours%24;
        
        System.out.print("GMT Now "+currentHour+":"+currentMinute+":"+currentSecond+ "\n");
    }
    
}
