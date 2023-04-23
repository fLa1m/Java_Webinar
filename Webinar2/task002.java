/*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2 */
package Webinar2;

public class task002 {
    public static void main(String[] args) {
        String dataString = "aaaabbbcdd";
        System.out.println(CheckChar(dataString));
    }

    static String CheckChar(String text) {
        StringBuilder resulString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                resulString.append(text.charAt(i - 1));
                if (count > 1) {
                    resulString.append(count);
                    count = 1;
                }
            }
        }
        resulString.append(text.charAt(text.length() - 1));
        resulString.append(count);

        return resulString.toString();
    }
}
