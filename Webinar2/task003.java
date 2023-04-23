/*Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка палиндромом (возвращает boolean значение).
 */

package Webinar2;

public class task003 {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.println(IsPolindrom(text));
        System.out.println(IsPolindromArr(text));
    }

    static boolean IsPolindrom(String text) {

        text = text.replace(" ", "");

        StringBuilder sBuilder1 = new StringBuilder(text);
        sBuilder1.reverse();

        return sBuilder1.toString().equalsIgnoreCase(text);
    }

    static boolean IsPolindromArr(String text) {
        text = text.replace(" ", "").toLowerCase();
        char[] arr = text.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
