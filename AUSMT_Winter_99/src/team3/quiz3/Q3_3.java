/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.quiz3;

/**
 *
 * @author amirali ghaumi
 * @author naser riazi
 * team3
 * 
 */
public class Q3_3 {

    /**
     * @param args the command line arguments
     */
    
        public static void main (String[] args) {
            
        int[] array1=new int[100] ;
        int hold = 0 ;
        
        for (int i=0;i<array1.length;i++) {
            
            array1[i]=(int)(Math.random()*101) ;
        } 
        
        for (int j=0;j<array1.length;j++) {
            
            for (int k=1;k<array1.length;k++) {
                
                if (array1[k-1] > array1[k]) {
                    
                    hold = array1[k-1] ;
                    array1[k-1] = array1[k] ;
                    array1[k] = hold ;
                    
                }
                
            } 
            
        } 
        
        System.out.println ("The designed array :") ;
        
        System.out.println ("*****************************") ;
        
        getArrayAverage (array1) ;
        
        System.out.println ("\n*******************************") ;
    } 
    
    public static void getArrayAverage (int[] array) {
        
        int sum=0 ;
        int average=0 ;
        int temp=0 ;
    
        for (int l:array) {
            sum += l ;
        } 
       
        average=Math.round(sum/array.length) ;
       
        for (int m=0; m <array.length; m++) {
            
            if (array[m]>average) {
                
                temp = m ;
                break ;
            } 
        } 
       
        int[] output=new int[array.length-temp] ;
        
        for (int n=temp,o = 0; n < array.length;n++,o++) {
            
            output[o]=array[n] ;
        } 
        
        for (int m = 0;m < array.length;m++) {
            if ( m%10 ==0) {
                System.out.println () ;
            } 
            
            System.out.print (array[m]+"\t") ;
        } 
        
        System.out.println ("\n****************************") ;
        
        System.out.println ("The average of the array elements is equal to : \"" + average + "\"") ;
        
        System.out.println ("*******************************") ;
        
        System.out.println ("The desired array :") ;
        
        System.out.println ("*********************************") ;
        
        for (int n=0;n<output.length;n++) {
            if (n%10==0) {
                System.out.println () ;
            } 
            
            System.out.print (output[n]+"\t") ;
        } 
        
    } // end of Array_Average () method

} 
