package by.it.shevjakov.lesson05;
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
        list.add(0, "mb");
        list.add(1, "cpu");
        list.add(2, "ram");
        list.add(3, "ssd");
        list.add(4, "case");
        int n = list.size();
        System.out.println(n);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
