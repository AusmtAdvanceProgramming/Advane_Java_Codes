/*
  Haniyeh Hadiyaqn _ Hossein Rahi
 */
package team1.quizz3;


public class Q3_3 {
    
    public static int[] Array_Create () {
        int[] arraye_1=new int[100] ;
        int i=0 ;
        //...
        for (i=0;i<arraye_1.length;i++) {
            arraye_1[i]=(int) (Math.random()*101) ;
        } 
        
        return arraye_1 ;
        
    } //100 adade random
    
    //------------------------------------------------
    
   public static int[] Array_Sort () {
        
        int[] arraye_2=new int[100] ;
        int jaygozari=0 ;
        int j=0 ;
        int l=1 ; //tak take khane haie arraye
        
        arraye_2=Array_Create () ;
        
        for (j=0; j<arraye_2.length; j++) {
            for (l=1;l<arraye_2.length;l++) {
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
    
    public static void Array_Average () {
        int[] arraye_3=new int[100] ;
        int sum=0 ;
        int average=0 ;
        int ABBA=0 ;
        int m=0 ;
        int n=0 ;
        int o=0 ;
        
        arraye_3=Array_Sort () ;
       
        for (int l:arraye_3) {
            sum+=l ;
        }  //majmoe hame adad
        
        average=Math.round (sum/arraye_3.length) ;
        
        for (m=0; m<arraye_3.length; m++) {
            if (arraye_3[m]>average) {
                ABBA=m ;
                break ;
            } 
        } 
        
        //-------------------------------------------------
        int[] bademiangin=new int[arraye_3.length-ABBA] ;
        
        //baze jadide az adade bade miangin ta entehaie baze
        
        
        for (n=ABBA; n<arraye_3.length; n++,o++) {
            bademiangin[o]=arraye_3[n] ;
        } 
        
        m=0 ;
        n=0 ;
        o=0 ;
        //khanie n om 100adade aval ra dar baze 0 ta entehaie baze zakhire mikonad
       
        //----------------------------------------------------
        for (m=0; m<arraye_3.length; m++) {
            
            
            System.out.print (arraye_3[m]+"\t") ;
        }  // 100 adade randome aval
        
        System.out.println ("\n") ;
        System.out.println ("miyangin ma  : \""+average+"\"") ;
        
       
        
        
        //----------------------------------------------------        
        System.out.println ("adade bade miangin :") ;
        
        for (n=0; n<bademiangin.length; n++) {
            
            System.out.print (bademiangin[n]+"\t") ;
        } 
    }
    
    //----------------------------------------------------------
    
    public static void main (String[] args) {
       
        System.out.println ("100 adade randome :") ;
        
        Array_Average () ;
         System.out.println ("\n") ;
        
    } 
} // The end
    

