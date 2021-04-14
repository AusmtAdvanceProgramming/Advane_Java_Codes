/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ausmt_winter_99.team7;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class TypeOfTriangle1 {

    
    
    public static void main(String[] args) {
        
        double x1, y1, x2, y2, x3, y3;
        double zel1, zel2, zel3; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("x1, y1, x2, y2, x3, y3 ra be tartib  vared konid: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        
        zel1 = Math.sqrt ( Math.pow ( (x1 - x2), 2 ) + Math.pow ( (y1 - y2), 2 ));
        zel2 = Math.sqrt ( Math.pow ( (x2 - x3), 2 ) + Math.pow ( (y2 - y3), 2 ));
        zel3 = Math.sqrt ( Math.pow ( (x3 - x1), 2 ) + Math.pow ( (y3 - y1), 2 ));
        
        if ( zel1 == zel2  && zel2 == zel3  ) {
            System.out.println("motasavi ol azla");
        } else if ( (zel1 == zel2 && zel2 != zel3) || ( zel1 == zel3 && zel3 != zel2) || ( zel2 == zel3 || zel3 != zel1 )) {
             System.out.println("motasavi ol saqein");
        } else if ( (zel1 != zel2 && zel2 != zel3) || ( zel1 != zel3 && zel3 != zel2) || ( zel2 != zel3 || zel3 != zel1 )) {
            System.out.println("mokhtalef ol azla");
        } else {
            System.out.println("namonazam");
        }
            
    }
    
}