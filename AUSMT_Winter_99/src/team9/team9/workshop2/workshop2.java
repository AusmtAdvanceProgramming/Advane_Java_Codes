/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9.workshop2;

/*
 *
 * @author ali asghar ranjbar and zeynab karimi zad
 */
import java.util.Scanner ;

    public class workshop2 {
      public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
        
        double k1 , p1 ;
        double k2 , p2 ;
        double k3 , p3 ;
        double v , n , m ;
        double V , N , M ;
        
        System.out.println ("************************************") ;
        System.out.println ("moqtasat avalin noqte ra vared konid : ") ;
        System.out.print ("k : ") ;
        k1=input.nextDouble () ;
        System.out.print ("p : ") ;
        p1=input.nextDouble () ;
        System.out.println ("************") ;
        System.out.println ("moqtasat dovomin noqte ra vared konid : ") ;
        System.out.print ("k : ") ;
        k2=input.nextDouble () ;
        System.out.print ("p : ") ;
        p2=input.nextDouble () ;  
        System.out.println ("************") ;
        System.out.println ("moqtasat sevomin noqte ra vared konid : ") ;
        System.out.print ("k : ") ;
        k3=input.nextDouble () ;
        System.out.print ("p : ") ;
        p3=input.nextDouble () ;  
        System.out.println ("************") ;        
        
        v=Math.pow ((Math.pow ((k2-k1),2))+(Math.pow ((p2-p1),2)),0.5) ;
        n=Math.pow ((Math.pow ((k3-k1),2))+(Math.pow ((p3-p1),2)),0.5) ;
        m=Math.pow ((Math.pow ((k3-k2),2))+(Math.pow ((p3-p2),2)),0.5) ;
        
        v=(int)(v*100)/100.0 ;
        n=(int)(n*100)/100.0 ;
        m=(int)(m*100)/100.0 ;
        
        V=Math.acos ((v*v-n*n-m*m)/(-2*n*m)) ;
        N=Math.acos ((n*n-v*v-m*m)/(-2*v*m)) ;
        M=Math.acos ((m*m-n*n-v*v)/(-2*v*n)) ;
        
        V=(int)(V*100)/100.0 ;
        N=(int)(N*100)/100.0 ;
        M=(int)(M*100)/100.0 ;        
        
        System.out.println (v+","+n+","+m) ;
        System.out.println (V+","+N+","+M) ;
        
        System.out.print ("NOE MOSALAS BARABAR AST BA : ") ;
        
        if (v==n && v==m && n==m) {
            System.out.println ("MOSALAS MOTESAVI OL AZLA") ;
        }
        else if (v==n || v==m || n==m) {
            System.out.println ("MOSALAS MOTESAVI OL SAQEYN") ;
        }
        else if (V==Math.PI/2 || N==Math.PI/2 || M==Math.PI/2) {
            System.out.println ("MOSALAS QAEMOL ZAVIE") ;
        }
        else {
            System.out.println ("MOSALAS MOKHTALEFOL AZLA") ;
        }
        System.out.println ("************************************") ;
    }
}