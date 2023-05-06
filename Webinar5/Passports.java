package Webinar5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String numPassport, String lastname) {
        map.put(numPassport, lastname);
    }

    String getByNumPassport(String numPassport) {
        return numPassport + ": " + map.get(numPassport);
    }

    String getByLastName(String lastname) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(lastname)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");

            }
        }
        if (stringBuilder.length() == 0) {
            return "Записей нет";
        }
        return stringBuilder.toString();
    }

    String getAllList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String getAllList2() {
        return map.toString();
    }

}
