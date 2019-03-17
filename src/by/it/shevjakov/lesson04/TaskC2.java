package by.it.shevjakov.lesson04;
/*
На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.
Пример:
Ввод:
1 1
Вывод
1
Ввод:
31 12
Вывод
365
Ввод:
13 9
Вывод
256
 */

import java.util.Scanner;

public class TaskC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int sum = day;
        byte c = 2;
        while (c <= month) {
            if (c == 2 || c == 4 || c == 6 || c == 8 || c == 9 || c == 11) sum = sum + 31;
            if (c == 3) sum = sum + 28;
            if (c == 5 || c == 7 || c == 10 || c == 12) sum = sum + 30;
            c++;
        }
        System.out.println(sum);
    }
}

