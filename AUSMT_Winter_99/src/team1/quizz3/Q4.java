/*
Haniyeh Hadiyaqn _ Hossein Rahi
 */
package team1.quizz3;

import javax.swing.JOptionPane ;

public class Q4 {
    
     public static int[] Array_Create () {
        int[] arraye_1=new int[100] ;
        int i=0 ;
        //...
        for (i=0;i<arraye_1.length;i++) {
            arraye_1[i]=(int) (Math.random()*101) ;
        } 
        
        return arraye_1 ;
        
    } //100 adade random
     
     //-------------------------------------------------------------
     
    public static int[] Array_Sort () {
        
        int[] arraye_2=new int[100] ;
        int jaygozari=0 ;
        int j=0 ; //jelo barande
        int l=1 ; //moqayese konandast
        
        arraye_2=Array_Create () ;
        
        for (j=0; j<arraye_2.length; j++) {
            for (l=1; l<arraye_2.length;l++) {
                if (arraye_2[l-1]>arraye_2[l]) {
                    
                    jaygozari=arraye_2[l-1] ;
                    arraye_2[l-1]=arraye_2[l] ;
                    arraye_2[l]=jaygozari ;
                } 
            } 
        }
        return arraye_2 ;
    } //100 adad be sorate monazam
    
    //--------------------------------------------------------------
    
    public static int Array_Search (int[] arraye_4,int vorodi_karbar1,int start,int end) {
        int middle=0 ;
        
        middle=(int) ((start+end)/2) ;
        
        if (start>end) {
            return -1 ;
        } 
        
        if (arraye_4[middle]==vorodi_karbar1) {
            return middle ;
        } 
        
        else if (arraye_4[middle]<vorodi_karbar1) {
            return Array_Search (arraye_4,vorodi_karbar1,middle+1,end) ;
        } 
        
        else {
            return Array_Search (arraye_4,vorodi_karbar1,start,middle-1) ;
        } 
    } 
    
    //---------------------------------------------------------------
    
    public static int Array_Check (int[] arraye_5,int vorodi_karbar2) {
        int tedade_moshabeh=0 ; 
        int k=0 ;
        //...
        for (k=0; k<arraye_5.length; k++) {
            if (arraye_5[k]==vorodi_karbar2) {
                tedade_moshabeh++ ;
            } 
        } 
        
        return tedade_moshabeh ;
    } 
    
    //---------------------------------------------------
    
    public static void main (String[] args) {
        
        int[] arraye_3=new int[100] ;
        int vorodi_karbar=0 ;
        int khane_araye=0 ;
        int tedad=0 ; //****************************
        int m=0 ; //***********************
        int n=1 ;  //***************************
       
        String input=JOptionPane.showInputDialog (null," adade morede nazar khode ra vared konid :"," addade vorodi ",JOptionPane.QUESTION_MESSAGE) ;
        vorodi_karbar=Integer.parseInt (input) ;
        
        arraye_3=Array_Sort () ;
        khane_araye=Array_Search (arraye_3,vorodi_karbar,0,arraye_3.length-1) ;
        tedad=Array_Check (arraye_3,vorodi_karbar) ;
        
        System.out.println ("arraye be sorate moratab shode : ") ;
  
        for ( m=0; m<arraye_3.length; m++) {
            if (m%10==0) {
                System.out.println () ;
            } 
                    
            System.out.print (arraye_3[m]+"\t") ;
        } //araye be sorate moratab shode
        
        
        if (khane_araye==-1) {
            System.out.println ("arraye"+vorodi_karbar+"\" vojod nadarad") ;
        } //adad dar araye mojod nabashad
       
        else {
            System.out.print ("arraye\""+vorodi_karbar+"\"dar khane \""+khane_araye+"ast") ;
            
            if (tedad==1) {
                System.out.println () ;
            } 
            
            for (n=1; n<tedad; n++) {
                vorodi_karbar+=1 ;
                
                System.out.print (" va "+vorodi_karbar+"\"") ;
            } 
            
            if (tedad>1) {
                System.out.println () ;
            } 
        } 
    } 
} // The end
    

