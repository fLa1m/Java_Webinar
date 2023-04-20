/* Дан массив двоичных чисел, например [1,1,0,1,1,1], 
вывести максимальное количество подряд идущих 1. */

package Webinar1;

public class task002 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 };
        int count = 0;
        int temp = 0;
        for (int i : arr) {
            if (i == 1) {
                temp++;
            } else {
                if (temp > count) {
                    count = temp;

                }
                temp = 0;
            }
        }
        System.out.println(count);
    }
}
