package Webinar1;

public class task004web {
    public static void main(String[] args) {
        String words = "Добро пожаловать на курс по Java";
        System.out.println(Reverse(words));
    }

    static String Reverse(String txt) {
        String result = "";
        String[] tempArr = txt.split(" ");
        for (int i = tempArr.length - 1; i >= 0; i--) {
            result += tempArr[i] + " ";
        }

        return result;
    }

}
