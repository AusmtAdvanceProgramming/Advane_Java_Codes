/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9.quiz1;

/**
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;

public class Q2 {
    public static void main(String[] args) {
        int Tarikhemroz;
        int Faseletamolaqat;
        int Tarikhmolaqat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Emroz chandomin rooz hafte ast:");
        Tarikhemroz = input.nextInt();
        
        System.out.print("tedad roz haye baqi mande ta meeting ro vared konid:");
        Faseletamolaqat = input.nextInt();
        
        while (Faseletamolaqat >= 7) {
          Faseletamolaqat  = Faseletamolaqat -7;  
        }
        
        Tarikhmolaqat = Tarikhemroz + Faseletamolaqat;
        while(Tarikhmolaqat > 7) {
            Tarikhmolaqat = Tarikhmolaqat-7;
        }
        System.out.println(Tarikhmolaqat);
     
       switch (Tarikhmolaqat) {
            case 1:
              System.out.println("sat");
              break;
            case 2:
              System.out.println("Sun");
              break;
            case 3:
              System.out.println("Mon");
              break;
            case 4:
              System.out.println("Tues");
              break;
            case 5:
              System.out.println("Wednes");
              break;
            case 6:
              System.out.println("Thurs");
              break;
            case 7:
              System.out.println("Fri");
              break;
            }
    }
}