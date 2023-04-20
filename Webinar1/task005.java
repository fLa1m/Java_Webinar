/*Реализовать функцию возведения числа а в степень b. a, b из Z. 
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1 */

package Webinar1;

import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in, "cp866")) {
            System.out.println("Введите число а: ");
            int a = iScanner.nextInt();
            System.out.println("Введите число b: ");
            int b = iScanner.nextInt();

            System.out.println(Exponentiation(a, b));
        }
    }

    static double Exponentiation(int a, int b) {
        double result = 1;
        if (b == 0 || a == 1) {
            return 1;
        } else {
            for (int i = 0; i < Math.abs(b); i++) {
                result *= a;
            }
        }
        return b > 0 ? result : 1 / result;
        // if (b < 0) {
        // return 1 / (double) result;
        // } else {
        // return (int) result;
        // }
    }
}
