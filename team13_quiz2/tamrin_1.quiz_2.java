/* team 13
*  quiz 2
*  parvin akbari
*  amir hosein abdolahi
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get string
        System.out.println("Enter your word or sentence :");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        // extract chars at string
        int length_of_word = word.length();
        for (int f = 0; f < length_of_word; f++) {
            int letter = 0;
            for (int i = 0; i < length_of_word; i++) {
                if (word.charAt(f) == word.charAt(i)) {
                    letter++;
                }
            }
            // yek bar kardan
            int time = 0;
            for (int g = 0; g < f; g++) {
                if (word.charAt(f) == word.charAt(g)) {
                    time++;
                }
            }
            // print result 
            if (time == 0) {
                System.out.print(word.charAt(f) + " : ");
                for (int z = 0; z < letter; z++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            }
        }
    }
}
