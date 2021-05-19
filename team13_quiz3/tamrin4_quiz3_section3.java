/**
 * tamrin4_quiz3_section3
 */
public class tamrin4_quiz3_section3 {

    public static void main(String[] args) {
        // 
        int[] array = craete_array();
        // 
        int average_number = average(array);
        // 
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (average_number < array[i]) {
                size++;
            }
        }
        // 
        int[] last_array = new int[size];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (average_number < array[i]) {
                last_array[index] = array[i];
                index++;
            }
        }
        // 
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i % 30 == 0) && (i != 0)) {
                System.out.println();
            }
        }
        System.out.println();
        // 
        System.out.println("average number : " + average_number);
        // 
        System.out.println("numbers is bigest than average :");
        for (int i = 0; i < last_array.length; i++) {
            System.out.print(last_array[i] + " ");
            if ((i % 30 == 0) && (i != 0)) {
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
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average_number = sum / 100;
        return average_number;
    }
}