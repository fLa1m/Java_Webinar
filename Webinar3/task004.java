/*Каталог товаров книжного магазина сохранен в виде 
двумерного списка List<ArrayList<String>> так, что на 
0й позиции каждого внутреннего списка содержится 
название жанра, а на остальных позициях - названия книг. 
Напишите метод для заполнения данной структуры. */

package Webinar3;

import java.util.ArrayList;
import java.util.List;

public class task004 {
    public static void main(String[] args) {
        List<List<String>> bookList = new ArrayList<>();
        addBook(bookList, "фантастика", "Война миров");
        addBook(bookList, "фантастика", "Звездные войны");
        addBook(bookList, "фэнтези", "Гарри Поттер");
        addBook(bookList, "Роман", "Война и мир");
        addBook(bookList, "фэнтези", "Властелин колец");
        addBook(bookList, "сказка", "Колобок");
        System.out.println(bookList);

    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook) {
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)) {
                shopBook.get(i).add(nameBook);
                return;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
