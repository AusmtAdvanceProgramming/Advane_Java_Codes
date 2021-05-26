/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.quiz3;

/**
 */
import javax.swing.JOptionPane ;


public class Q4 {
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
    public static int Array_Search (int[] array4,int search1,int start,int end) {
        int middle=0 ;
       
        
        middle=(int) ((start+end)/2) ;
        
        
        if (start>end) {
            return -1 ;
        } 
        
        
        if (array4[middle]==search1) {
            return middle ;
        }
        
        
        else if (array4[middle]<search1) {
            return Array_Search (array4,search1,middle+1,end) ;
        }
        
        
        else {
            return Array_Search (array4,search1,start,middle-1) ;
        } 
    } 
    public static int Array_Check (int[] array5,int search2) {
        int counter=0 ;
        int l=0 ;
        
        
        for (l=0;l<array5.length;l++) {
            if (array5[l]==search2) {
                counter++ ;
            }
        } 
        
        
        return counter ;
    } 
    public static void main (String[] args) {
        int[] array3=new int[100] ;
        int number=0 ;
        int result=0 ;
        int amount=0 ;
        int m=0 ;
        int n=1 ;
       
        
        String input=JOptionPane.showInputDialog (null,"Enter your desired number please :","Number search",JOptionPane.QUESTION_MESSAGE) ;
        number=Integer.parseInt (input) ;
        
        
        array3=Array_Sort () ;
        result=Array_Search (array3,number,0,array3.length-1) ;
        amount=Array_Check (array3,number) ;
      
        
        System.out.println ("____________________") ;
        System.out.println ("The designed array :") ;
        System.out.println ("__________") ;
        
        
        for (m=0;m<array3.length;m++) {
            if (m%10==0) {
                System.out.println () ;
            }
            
            
            System.out.print (array3[m]+"\t") ;
        }
        
        
        System.out.println ("\n__________") ;
       
        
        if (result==-1) {
            System.out.println ("The number \""+number+"\" does not exist in the array") ;
        } 
        
        
        else {
            System.out.print ("The number \""+number+"\" is in the array and is in cell number \""+result+"\"") ;
            
            
            if (amount==1) {
                System.out.println () ;
            } 
            
            
            for (n=1;n<amount;n++) {
                result+=1 ;
               
                
                System.out.print (" , \""+result+"\"") ;
            } 
            
            
            if (amount>1) {
                System.out.println () ;
            } 
        } 
        
        
        System.out.println ("____________________") ;
    } 
} 