package team0;
import java.util.Scanner;
public class Workshop3_2 {
 public static void main(String[] args) {
        

        String str;
        char character;
        int length;
        int counter=0;
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.print ("Kalamey ra vared konid: ");
        str=input.next();

        System.out.print ("Harf mored nazar ra vared konid: ");
        character=input.next().charAt(0);


        length=str.length();
        str = str.toLowerCase();
        character = Character.toLowerCase(character);

        for (i = 0; i < length; i++)
        {
            if (str.charAt(i) == character)
            {
                counter++ ;
            }
        }

        System.out.println ("Harf \"" +character+ "\" , "+counter+" bar dar \"" +str+ "\" tekrar shude.") ;
 }
}

    
    
    
    