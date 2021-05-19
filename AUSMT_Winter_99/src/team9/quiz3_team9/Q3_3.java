/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_team9;
/**
 * @author Aliasghar ranjbar
 * @author zeynab karimizad
 */
public class Q3_3 {
    
    public static int[] Array_Create () {
        int[] array1=new int[100] ;
        int i=0 ;
       
        for (i=0;i<array1.length;i++) {
            array1[i]=(int) (Math.random()*101) ;
        } 
        return array1 ;
    }
    public static int[] Array_Sort () {
        int[] array2=new int[100] ;
        int backup=0 ;
        int j=0 ;
        int k=1 ;
     
        array2=Array_Create () ;
    
        for (j=0;j<array2.length;j++) {
            for (k=1;k<array2.length;k++) {
                if (array2[k-1]>array2[k]) {
                    backup=array2[k-1] ;
                    array2[k-1]=array2[k] ;
                    array2[k]=backup ;
                }
            }
        }
        return array2 ;
    }
    public static void Array_Average () {
        int[] array3=new int[100] ;
        int sum=0 ;
        int average=0 ;
        int tempo1=0 ;
        int x=0 ;
        int y=0 ;
        int z=0 ;
    
        array3=Array_Sort () ;
    
        for (int l:array3) {
            sum+=l ;
        }
        average=Math.round (sum/array3.length) ;
  
        for (y=0;y<array3.length;y++) {
            if (array3[y]>average) {
                tempo1=y ;
                break ;
            }
        }
        int[] output=new int[array3.length-tempo1] ;
   
        for (x=tempo1;x<array3.length;x++,z++) {
            output[z]=array3[x] ;
        }
        y=0 ;
        x=0 ;
        z=0 ;
   
        for (y=0;y<array3.length;y++) {
            if (y%10==0) {
                System.out.println () ;
            }
            System.out.print (array3[y]+"\t") ;
        }
        System.out.println ("\n~~~~~~~~~~~~~~~~") ;
        System.out.println ("The average of the array elements is equal to : \""+average+"\"") ;
        System.out.println ("~~~~~~~~~~~~~~~~~~") ;
        System.out.println ("The desired array :") ;
  
        for (x=0;x<output.length;x++) {
            if (x%10==0) {
                System.out.println () ;
            }
            System.out.print (output[x]+"\t") ;
        }
    }
    public static void main (String[] args) {
        System.out.println ("The designed array :") ;
        Array_Average () ;
        System.out.println ("\n") ;
    }
}