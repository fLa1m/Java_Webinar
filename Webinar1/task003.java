/* Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) 
элементов массива должны быть отличны от заданного, 
а остальные - равны ему. */
// arrOne: [3, 2, 5, 3]
// arrTwo: [3, 3, 3, 3]
package Webinar1;

import java.util.Arrays;

public class task003 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 5, 3 };
        int values = 3;
        int[] tempArr = getTempArray(arr, values);
        System.out.println(Arrays.toString(compareArray(arr, tempArr, values)));
    }

    static int[] getTempArray(int[] array, int val) {
        int[] temp = new int[array.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = val;

        }
        return temp;
    }

    static int[] compareArray(int[] arrOne, int[] arrTwo, int val) {
        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrOne.length; j++) {
                if (arrTwo[i] != arrOne[j]) {
                    arrTwo[i] = arrOne[j];
                    arrOne[j] = val;
                    break;
                }
            }
        }
        return arrTwo;
    }
}
