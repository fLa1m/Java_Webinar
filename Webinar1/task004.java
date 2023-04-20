/*Во фразе "Добро пожаловать на курс по Java" 
переставить слова в обратном порядке. */

package Webinar1;


public class task004 {
    public static void main(String[] args) {
        String sentence = "Добро пожаловать на курс по Java";
        System.out.println(inverseSentence(sentence));
    }

    static String inverseSentence(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        String newSentence = String.join(" ", words);

        return newSentence;
    }
}
