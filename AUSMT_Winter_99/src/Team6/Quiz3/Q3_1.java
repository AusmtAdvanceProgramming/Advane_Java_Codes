
package team6.quiz3;

/**
 * @author Mahdi
 * 
 */
import javax.swing.JOptionPane;

public class Q3_1 {
    public static char[] stringToArray(String string) {
        char[] charArray = new char[string.length()];
        int i = 0;

        for (i = 0; i < charArray.length; i++) {
            charArray[i] = string.charAt(i);
        }

        return charArray;
    }

    public static char[] Shuffle(char[] shuffleArray) {
        char hold;
        int random1 = 0;
        int random2 = 0;
        int j = 0;

        for (j = 0; j < shuffleArray.length; j++) {
            random1 = (int) (Math.random() * shuffleArray.length);
            random2 = (int) (Math.random() * shuffleArray.length);

            hold = shuffleArray[random1];
            shuffleArray[random1] = shuffleArray[random2];
            shuffleArray[random2] = hold;
        }

        return shuffleArray;
    } 

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter your desired string please :", "String input",
                JOptionPane.QUESTION_MESSAGE);
        input = input.toLowerCase();

        char[] array1 = new char[input.length()];
        char[] array2 = new char[input.length()];
        int k = 1;
        int l = 1;

        array1 = stringToArray(input);
        array2 = Shuffle(array1);

        System.out.println("The original array :");

        System.out.print("[ ");

        for (k = 0; k < input.length(); k++) {
            System.out.print(input.charAt(k) + " ");
        }

        System.out.print("]\n");

        System.out.println("The shuffled array :");

        System.out.print("[ ");

        for (l = 0; l < array2.length; l++) {
            System.out.print(array2[l] + " ");
        } 

        System.out.print("]\n");
        System.out.println();
    }
} 