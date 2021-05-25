/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1.quizz3;

import javax.swing.JOptionPane ;

public class Q3_1 {
    
     public static char[] String_Chop (String reshte_voridi1) {
         
        char[] horof_moqata=new char[reshte_voridi1.length ()] ;// az reshte be carekter tabdil mikonad
        
        int i=0 ;
        
        for (i=0;i<horof_moqata.length;i++) {
            horof_moqata[i]=reshte_voridi1.charAt (i) ;
        } 
        
        return horof_moqata ;
    } //har harf ra dar khane mostaqel migozarim
     
     //---------------------------------------------------------
     
    public static char[] Shuffle (char[] reshte_vorodi4) {
        
        char jaygozini ;
        int random1=0 ;
        int random2=0 ;
        int j=0 ;
        //...
        for (j=0; j<reshte_vorodi4.length; j++) {
            random1=(int) (Math.random ()*reshte_vorodi4.length) ;
            random2=(int) (Math.random ()*reshte_vorodi4.length) ;
            
            jaygozini=reshte_vorodi4[random1] ;
            reshte_vorodi4[random1]=reshte_vorodi4[random2] ;
            reshte_vorodi4[random2]=jaygozini ;
        } 
        
        return reshte_vorodi4 ;
    } //avaz kardan khana arraye ha
    
    //-------------------------------------------------------------
    
    public static void main (String[] args) {
        String reshte_vorodi=JOptionPane.showInputDialog (null,"reshte khod ra vared konid :","reshte vorodi",JOptionPane.QUESTION_MESSAGE) ;
        reshte_vorodi=reshte_vorodi.toLowerCase () ;
        
        char[] reshte_vorodi1=new char[reshte_vorodi.length ()] ;  
        char[] reshte_vorodi3=new char[reshte_vorodi.length ()] ;  //az ham mojaza mishavad
        int k=1 ;
        int l=1 ;
        
        reshte_vorodi1=String_Chop (reshte_vorodi) ;
        reshte_vorodi3=Shuffle (reshte_vorodi1) ;
        
        
        System.out.println ("reshte avalie :") ;
        
        System.out.print (+reshte_vorodi.charAt (0)) ;
        for (k=1;k<reshte_vorodi.length ();k++) {
            System.out.print (" , "+reshte_vorodi.charAt (k)) ; //tak take khane haie hafeze ra namayesh midahim(be sorate moratab)
        } 
       
        
        System.out.println ("reshte namoratab :") ;
        
        System.out.print (+reshte_vorodi3[0]) ;
         for (l=1;l<reshte_vorodi3.length;l++) {
            System.out.print (" , "+reshte_vorodi3[l]) ; //tak take khane haie hafeze ra namayesh midahim(be sorate beham rikhte)
        } 
        
        
    } 
} // The end
    

