/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team0;

import java.util.Scanner;

/**
 *
 * @author Verna
 */
public class kargah2 {

    public static void main(String[] args) {

        double x1 , y1 ;
        double x2 , y2 ;
        double x3 , y3 ;
        double a , b , c ;
        double A , B , C ;

        Scanner input = new Scanner(System.in);

        System.out.println("Lotfan noghte aval ra vared konid : ");
        System.out.print("x1 : ");
        x1 = input.nextDouble();
        System.out.print("y1 : ");
        y1 = input.nextDouble();

        System.out.println("Lotfan noghte dovom ra vared konid : ");
        System.out.print("x2 : ");
        x2 = input.nextDouble();
        System.out.print("y2 : ");
        y2 = input.nextDouble();

        System.out.println("Lotfan noghte sevom ra vared konid : ");
        System.out.print("x3 : ");
        x3 = input.nextDouble();
        System.out.print("y3 : ");
        y3 = input.nextDouble();

        a = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        b = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        c = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        if((a==b)&&(a==c)&&(b==c)){
            System.out.println("Noghat shuma mosalas MOTESAVI OL AZLAE ra tashkil dadand.");
        }
        else if(((a==b)&&(a==c))||((b==c)&&(b==a))||((c==a)&&(c==b))){
            System.out.println("Noghat shuma mosalas MOTESAVI OL SAQEIN ra tashkil dadand. ");
        }
        else if((a * a == b * b + c * c)||(b * b == a * a + c * c)||(c * c == b * b + a * a)){
            System.out.println("Noghat shuma mosalas QAEM OL ZAVIE ra tashkil dadand. ");
        }
        else{
            System.out.println("Noghat shuma mosalas NAMONAZAM ra tashkil dadand");
        }

    }
}