/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, начиная с c1.
Ответ: c1c2c1…c2 (всего N символов) */

package Webinar2;

import java.util.Scanner;
import java.lang.StringBuilder;

public class task001 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "cp866")) {
            int N = input.nextInt();
            char c1 = input.next().charAt(0);
            char c2 = input.next().charAt(0);
            System.out.println(BuildString(c1, c2, N));
        }
    }

    static String BuildString(char a, char b, int num) {

        if (num % 2 != 0) {
            return "Вы ввели нечетное число";
        }

        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            sBuilder.append(a);
            sBuilder.append(b);
        }

        return sBuilder.toString();
    }
}
