package by.it.ivanstets.ivanstetsles5;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            list.add(r.readLine());
        }
        System.out.println(list.size());
        for (String elements : list) {
            System.out.println(elements);
        }
    }

}
