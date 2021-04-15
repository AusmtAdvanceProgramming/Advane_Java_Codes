/*team17.Quiz1.Q1
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        double x,y;
        double a,b,c,d,e,f;
        //Getting coefficients and constants from user...
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your desire coefficient of x1");
        a= input.nextDouble();
        System.out.println("Please enter your desire coefficient of y1");
        b= input.nextDouble();
        System.out.println("Please enter your desire constant of e");
        e= input.nextDouble();
        System.out.println("Please enter your desire coefficient of x2");
        c= input.nextDouble();
        System.out.println("Please enter your desire coefficient of y2");
        d= input.nextDouble();
        System.out.println("Please enter your desire constant of f");
        f= input.nextDouble();
        System.out.println("Your algebraic system equations is:");
        System.out.println(a+"x+"+b+"y"+"="+e);
        System.out.println(c+"x+"+d+"y"+"="+f);
        //Calculate value of x & y with crammer's rule!
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        //Checks infinite answers or no answers at all!
        if ((a/c)==(b/d)&&(a/c)!=(e/f))
           System.out.println("This algebraic system equations has no answers!");
        else if ((a/c)==(b/d)&&(a/c)==(e/f))
           System.out.println("This algebraic system equations has infinite answers!");
        //solution with crammer's rule!
        else
           System.out.println("Your answers is x="+x+" and y="+y); 
    }//end of main() method 
    
}//end of Class
