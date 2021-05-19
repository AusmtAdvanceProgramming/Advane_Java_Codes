/**
 * tamrin4_quiz3_section2
 */
import javax.swing.JOptionPane;

public class tamrin4_quiz3_section2 {

    public static void main(String[] args) {
        // 
        int array[] = get_size_and_craete_array();
        // 
        int side = shifting_side();
        // 
        int number_of_shift = shifting_numbrer();
        // 
        shifting(array, side, number_of_shift);
    }
    // 
    public static int[] get_size_and_craete_array() {
        String size = JOptionPane.showInputDialog(null,
            "Enter your lengh of string :",
            "string lengh",
            JOptionPane.QUESTION_MESSAGE);
        int array_size = Integer.parseInt(size);
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    // 
    public static int shifting_side() {
        String size = JOptionPane.showInputDialog(null,
            "Enter left or right :(L -> 1, R -> 2)",
            "shifting side",
            JOptionPane.QUESTION_MESSAGE);
        int side = Integer.parseInt(size);
        return side;
    }
    // 
    public static int shifting_numbrer() {
        String size = JOptionPane.showInputDialog(null,
            "Enter number of shifting :",
            "shifting number",
            JOptionPane.QUESTION_MESSAGE);
        int shift_numbrer = Integer.parseInt(size);
        return shift_numbrer;
    }
    // 
    public static void shifting(int[] array, int side, int number_of_shift) {
        // 
        int[] last_array = new int[array.length];
        // 
        number_of_shift %= array.length;
        // 
        if (side == 1) {
            for (int i = array.length - 1; i >= 0; i--) {
                int index = i - number_of_shift;
                if (index >= 0) {
                    last_array[index] = array[i];
                }
                else {
                    last_array[index + array.length] = array[i];
                }
            }
            // 
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            // 
            for (int i = 0; i < last_array.length; i++) {
                System.out.print(last_array[i] + " ");
            }
        }
        // 
        else if (side == 2) {
            for (int i = 0; i < array.length; i++) {
                int index = i + number_of_shift;
                if (index < array.length) {
                    last_array[index] = array[i];
                }
                else {
                    last_array[index - array.length] = array[i];
                }
            }
            // 
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            // 
            for (int i = 0; i < last_array.length; i++) {
                System.out.print(last_array[i] + " ");
            }
        }
        else {
            System.out.println(" << system error >>");
        }
    }
}