
package team6.quiz3;

/**
 * @author Mahdi
 * 
 */
public class Q3_3 {
    public static int[] Array_Create() {
        int[] array1 = new int[100];
        int i = 0;

        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 101);
        } 
          
        return array1;
    } 

    public static int[] Array_Sort() {
        int[] array2 = new int[100];
        int hold = 0;
        int j = 0;
        int k = 1;

        array2 = Array_Create();

        for (j = 0; j < array2.length; j++) {
            for (k = 1; k < array2.length; k++) {
                if (array2[k - 1] > array2[k]) {
                    hold = array2[k - 1];
                    array2[k - 1] = array2[k];
                    array2[k] = hold;
                } 
            } 
        } 

        return array2;
    } 

    public static void Array_Average() {
        int[] array3 = new int[100];
        int sum = 0;
        int average = 0;
        int temp = 0;
        int m = 0;
        int n = 0;
        int r = 0;

        array3 = Array_Sort();

        for (int l : array3) {
            sum += l;
        } 

        average = Math.round(sum / array3.length);

        for (m = 0; m < array3.length; m++) {
            if (array3[m] > average) {
                temp = m;
                break;
            } 
        } 

        int[] result = new int[array3.length - temp];

        for (n = temp; n < array3.length; n++, r++) {
            result[r] = array3[n];
        }

        m = 0;
        n = 0;
        r = 0;
        System.out.println();
        System.out.println("The original array :");
        System.out.println();
        for (m = 0; m < array3.length; m++) {
            if (m % 10 == 0) {
                System.out.println();
            } 

            System.out.print(array3[m] + "\t");
        } 

        System.out.println("\n");
        System.out.println("The average of the array elements is : " + average );
        System.out.println();
        System.out.println("The intended array :");
        System.out.println();

        for (n = 0; n < result.length; n++) {
            if (n % 10 == 0) {
                System.out.println();
            }

            System.out.print(result[n] + "\t");
        } 
    } 

    public static void main(String[] args) {

        Array_Average();
        System.out.println("\n***");
    } 
} 