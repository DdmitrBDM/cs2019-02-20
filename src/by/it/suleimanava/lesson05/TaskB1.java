package by.it.suleimanava.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

import java.util.Scanner;



public class TaskB1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList();

        int listLength = 0;

        for (int i = 0; i < 5; i++) {

            String value = scanner.next();

            list.add(value);

            listLength = listLength + value.length();

        }

        System.out.println(listLength);

        //for (int i = 0; i < list.size(); i++)

        //    System.out.println(list.get(i));

        for (String string : list) System.out.println(string);

    }

}
