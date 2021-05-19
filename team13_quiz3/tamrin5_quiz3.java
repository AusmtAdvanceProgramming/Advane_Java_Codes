/**
 * tamrin5_quiz3
 */
import javax.swing.JOptionPane;

public class tamrin5_quiz3 {

    public static void main(String[] args) {
        // 
        int[] array = craete_array();
        // 
        int[] array_sorted = sorting_array(array);
        // 
        int serch_number = serch_number();
        // 
        System.out.println("your number is " + serch_number);
        // 
        serching(array_sorted, serch_number);
        // 
        for (int i = 0; i < array_sorted.length; i++) {
            System.out.print(array_sorted[i] + " ");
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
    // 
    public static int[] craete_array() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    // 
    public static int[] sorting_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index_1 = 1;
            int index_2 = 0;
            while ((index_1 <= i) && (array[i - index_2] < array[i - index_1])) {
                int num = array[i - index_1];
                array[i - index_1] = array[i - index_2];
                array[i - index_2] = num;
                index_1++;
                index_2++;
            }
        }
        return array;
    }
    // 
    public static int serch_number() {
        String size = JOptionPane.showInputDialog(null,
            "Enter your serch number :",
            "serch number",
            JOptionPane.QUESTION_MESSAGE);
        int serch = Integer.parseInt(size);
        return serch;
    }
    // 
    public static void serching(int[] array, int number) {
        int index = 50;
        int division = 2;
        boolean valiu = true;
        while (valiu) {
            if (number < array[index - 1]) {
                index -= (index / division);
            }
            else if (number > array[index - 1]) {
                index += (index / division);
            }
            else if (number == array[index - 1]) {
                System.out.println("index of number is " + (index - 1));
                valiu = false;
            }
            if (index / division == 0) {
                System.out.println("your number is not in this array");
                valiu = false;
            }
            division *= 2;
        }   
    }
}