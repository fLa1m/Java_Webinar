/*Напишите метод, который составит строку, 
состоящую из 100 повторений слова TEST и метод, 
который запишет эту строку в простой текстовый файл, 
обработайте исключения. */

package Webinar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task004 {
    public static void main(String[] args) {

        String data = "TEST\n";
        int num = 100;
        String result = RepeatString(data, num);
        SaveToFile(result);
    }

    static String RepeatString(String text, int n) {
        return text.repeat(n);
    }

    static void SaveToFile(String text) {
        Logger logger = Logger.getAnonymousLogger();
        // logger.setLevel(null); отлавливает нужный тип
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");

        } catch (IOException e) {

            e.printStackTrace();
        }

        SimpleFormatter formatter = new SimpleFormatter(); // изменение формата
        fileHandler.setFormatter(formatter); // с xml(по умолчанию) на Simple

        logger.addHandler(fileHandler);
        String path = "/n/task004text.txt";

        try (FileWriter fileWriter = new FileWriter(path, false);) {
            fileWriter.write(text);
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, "Что-то пошло не так");
        }
        fileHandler.close();
    }

}
