/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.quiz3;

/**
 *
 * @author mohammdreza
 */
public class q4_3 {
    public static int[] Array_Create () {
        int[] array1=new int[100] ;
        int i=0 ;
        //...
        for (i=0;i<array1.length;i++) {
            array1[i]=(int) (Math.random()*101) ;
        } // end of first for
        //...
        return array1 ;
    } // end of Array_Create () method
    public static int[] Array_Sort () {
        int[] array2=new int[100] ;
        int backup=0 ;
        int j=0 ;
        int k=1 ;
        //...
        array2=Array_Create () ;
        //...
        for (j=0;j<array2.length;j++) {
            for (k=1;k<array2.length;k++) {
                if (array2[k-1]>array2[k]) {
                    backup=array2[k-1] ;
                    array2[k-1]=array2[k] ;
                    array2[k]=backup ;
                } // end of first if
            } // end of third for
        } // end of second for
        //...
        return array2 ;
    } // end of Array_Sort () method #Bubble_Sort
    public static void Array_Average () {
        int[] array3=new int[100] ;
        int sum=0 ;
        int average=0 ;
        int tempo1=0 ;
        int m=0 ;
        int n=0 ;
        int o=0 ;
        //...
        array3=Array_Sort () ;
        //...
        for (int l:array3) {
            sum+=l ;
        } // end of fourth for (for-each)
        //...
        average=Math.round (sum/array3.length) ;
        //...
        for (m=0;m<array3.length;m++) {
            if (array3[m]>average) {
                tempo1=m ;
                break ;
            } // end of second if
        } // end of fifth for
        //...
        int[] output=new int[array3.length-tempo1] ;
        //...
        for (n=tempo1;n<array3.length;n++,o++) {
            output[o]=array3[n] ;
        } // end of sixth for
        //...
        m=0 ;
        n=0 ;
        o=0 ;
        //...
        for (m=0;m<array3.length;m++) {
            if (m%10==0) {
                System.out.println () ;
            } // end of third if
            //...
            System.out.print (array3[m]+"\t") ;
        } // end of seventh for
        //...
        System.out.println ("\n__________") ;
        System.out.println ("The average of the array elements is equal to : \""+average+"\"") ;
        System.out.println ("__________") ;
        System.out.println ("The desired array :") ;
        System.out.println ("__________") ;
        //...
        for (n=0;n<output.length;n++) {
            if (n%10==0) {
                System.out.println () ;
            } // end of fourth if
            //...
            System.out.print (output[n]+"\t") ;
        } // end of eighth for
    } // end of Array_Average () method
    public static void main (String[] args) {
        System.out.println ("____________________") ;
        System.out.println ("The designed array :") ;
        System.out.println ("__________") ;
        Array_Average () ;
        System.out.println ("\n____________________") ;
    } // end of main () method
} // end of Q3_3 class    
