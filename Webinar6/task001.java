/* 1. Создайте HashSet, заполните его след. числами:
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое множества.
2. Создайте LinkedHahSet, заполните его след. числами:
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое множества.
3. Создайте TreeSet, заполните его след. числами:
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое множества.
 */

package Webinar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class task001 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 3, 2, 6, 1, 2, 4, 5, 3 };
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1); // [1, 2, 3, 4, 5, 6]
        System.out.println(set2); // [3, 2, 6, 1, 4, 5]
        System.out.println(set3); // [1, 2, 3, 4, 5, 6]
    }

}
