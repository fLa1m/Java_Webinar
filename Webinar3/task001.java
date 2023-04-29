/*Даны следующие строки, cравнить их с помощью == и метода equals() класса Object */

package Webinar3;

public class task001 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        System.out.println(s1 == s2); // сравнивает ссылки
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s2)); // на первом этапе проверяет ссылки
        System.out.println(s1.equals(s3)); // а если ссылки не равны - проверяет значения
        System.out.println(s1.equals(s4)); // => ссылочные типы данных сравниваются через .equals
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }
}
