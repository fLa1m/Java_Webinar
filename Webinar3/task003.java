/*Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа. */

package Webinar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task003 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add("15");
        list.add("привет");
        list.add(4.5);
        list.add(10);
        list.add(6);
        System.out.println(list);
        delInteger(list);
        System.out.println(list);
        iteratorMethod(list);
        System.out.println(list);
    }

    static void delInteger(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
    }

    static void iteratorMethod(List<Object> list) {
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Double) {
                iterator.remove();
            }
        }
    }
}
