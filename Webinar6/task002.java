/*1. Напишите метод, который заполнит массив из 1000 элементов 
случайными цифрами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив и 
с помощью Set вычислите проецент уникальных значений в данном массиве
и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее кол-во чисел в массиве.*/

package Webinar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task002 {
    public static void main(String[] args) {
        Integer[] arr = createArray(1000, 0, 24);
        // System.out.println(Arrays.toString(arr));
        System.out.println(unitPersent(arr));
    }

    static Integer[] createArray(int capacity, int min, int max) {
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    static double unitPersent(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unitPersent = set.size() * 100.0 / arr.length;
        return unitPersent;

    }
}
