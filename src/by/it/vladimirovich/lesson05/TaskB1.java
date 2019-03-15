package by.it.vladimirovich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "a1");
        list.add(1, "a2");
        list.add(2, "a3");
        list.add(3, "a4");
        list.add(4, "a5");
        int n = list.size();
        System.out.println(n);
        for (String s : list) {
            System.out.println(s);
        }
}}
