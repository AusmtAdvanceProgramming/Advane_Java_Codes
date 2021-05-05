/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class workshop4_2 {
     public static void fillArray (char[] string) {
         for(int i = 0; i < string.length; i++){
             string[i] = (char)('a' + Math.random()* ('z' - 'a' +1));
         }
         System.out.print("In Method: ");
         System.out.println(string);
}
}
