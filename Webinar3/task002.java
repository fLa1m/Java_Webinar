/*Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */

package Webinar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task002 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }
}
