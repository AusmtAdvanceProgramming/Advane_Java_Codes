/**
 * tamrin4_quiz3_section1
 */
import javax.swing.JOptionPane;

public class tamrin4_quiz3_section1 {
    // 
    public static void main(String[] args) {
        // 
        int array_size = get_array_size();
        // 
        int array[] = craite_array(array_size);
        // 
        shuffling(array, array_size);
    }
    // 
    public static int get_array_size() {
        String size = JOptionPane.showInputDialog(null,
            "Enter your lengh of string :",
            "string lengh",
            JOptionPane.QUESTION_MESSAGE);
        int array_size = Integer.parseInt(size);
        return array_size;
    }
    // 
    public static int[] craite_array(int array_size) {
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    // 
    public static void shuffling(int[] array, int array_size) {
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int num_1 = (int) ((Math.random() * 100) % array.length);
        int num_2 = (int) ((Math.random() * 100) % array.length);
        // ---
        System.out.println("index " + num_2 + " and index " + num_1);
        // ---
        int num_in_1 = array[num_1];
        array[num_1] = array[num_2];
        array[num_2] = num_in_1;
        for (int a = 0; a < array_size; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }
}