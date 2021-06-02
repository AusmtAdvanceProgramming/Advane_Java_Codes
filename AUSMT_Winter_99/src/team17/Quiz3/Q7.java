/*team17.Quiz3.Q7
Salari & Sh'abani
@Author : Salari*/
package team17.Quiz3;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
            public static void main(String[] args) {
                int [] myArray = new int[100];
                int searchValue = 0, index;
                Scanner input = new Scanner(System.in);
        System.out.println("Random elements generated between 0 and 100 are: ");
        for (int i = 0; i < myArray.length ; i++) {
         myArray[i]=(int)(Math.random()*101);
         System.out.println(myArray[i]);
            }//for 1
        Arrays.sort(myArray);
        System.out.print("Please enter a number to search for: ");
        searchValue = input.nextInt();
        index = binarySearch(myArray,searchValue);
        if (index != -1) {
            System.out.println("Found at index: "+index);
        }
        else {
            System.out.println("Not found !");
        }

}//
            public static int binarySearch( int [] search, int find) {
            int start,end,midPt;
            start = 0;
            end = search.length-1;
            
            while (start <= end) {
                midPt = (start+end)/2;
                if (search[midPt] == find) {
                    return midPt;
                }
                else if (search[midPt] < find) {
                    start = midPt+1;
                }
                else {
                    end = midPt-1;
                }
            }
            return -1;
        }
}//