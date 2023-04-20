/* Дан массив двоичных чисел, например [1,1,0,1,1,1], 
вывести максимальное количество подряд идущих 1. */

package Webinar1;

import java.util.Arrays;
import java.util.Random;

public class task002web {
    public static void main(String[] args) {
        int[] arr = generateArray(10, 0, 1);
        System.out.println(Arrays.toString(arr));
        int count = countOnes(arr);
        System.out.println(count);
    }

    static int[] generateArray(int size, int min_val, int max_val) {
        int[] resultArray = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            resultArray[i] = rnd.nextInt(min_val, max_val + 1);
        }
        return resultArray;
    }

    /**
     * @param arr
     * @return
     */
    static int countOnes(int[] arr) {
        int maxOnes = -1;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            } else {
                if (temp > maxOnes) {
                    maxOnes = temp;
                }
                temp = 0;
            }
            if (temp > maxOnes) {
                maxOnes = temp;
            }
        }
        return maxOnes;

    }
}
