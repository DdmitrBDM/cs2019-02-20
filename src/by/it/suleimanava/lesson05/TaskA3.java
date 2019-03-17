package by.it.suleimanava.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;



public class TaskA3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;

        int max = 0;

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {

            mas[i] = scanner.nextInt();

            if (min > i)

                min = i;

            if (max < i)

                max = i;

        }

        System.out.println(min + " " + max);

    }

}