/*
Haniyeh Hadiyan _ Hossein Reahi
 */
package team1.workshp4;

import java.util.Scanner;

public class workshop4_3 {
    
    public static void main (String[] args) {
        
        char[] string0 = new char[5];
        char[] string1;
        fillArray(string0);
        
        System.out.print("out of the method");
        System.out.println(string0);
        
        System.out.print("returned array :");
        string1= returnArray(10);
        System.out.println(string1);
        
       }
    //------------------------------------------
    
    public static void fillArray(char[] string){
        
        for(int i=0; i<string.length; i++){
            string[i] = (char)('a'+ Math.random()*('z'-'a' + 1));
        }
        System.out.print("In method");
        System.out.println(string);
        
    }
    //------------------------------------------
    
    public static char[] returnArray(int nom){
        
       char[] string = new char[nom];
       
       for(int i=0; i<string.length; i++){
           
          string[i] =(char)('a'+Math.random()*('z'-'a'+1));
       }
       return string;
    }
        
}//The end
