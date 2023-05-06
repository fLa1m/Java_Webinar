/*Взять набор слов, например,
Мороз и солнце день чудесный 
Еще ты дремлешь друг прелестный 
Пора красавица проснись.
Написать метод, который отсортирует эти слова по 
длине с помощью TreeMap. Слова с одинаковой длиной не 
должны “потеряться”. */

package Webinar5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task004 {
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.\n";

        words(line);
    }

    static void words(String s) {
        s = s.replace("\n", " ");
        s = s.replace(".", "");
        String[] wordStrings = s.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : wordStrings) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }

}
