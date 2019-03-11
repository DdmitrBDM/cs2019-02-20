package by.it.ivanstets.ivanstetsles4;

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
        int date = sc.nextInt();
        int month = sc.nextInt();
        if (month == 1)
            System.out.println(date);
        if (month == 2)
            System.out.println(date + 28);
        if (month == 3)
            System.out.println(date + 59);
        if (month == 4)
            System.out.println(date + 90);
        if (month == 5)
            System.out.println(date + 120);
        if (month == 6)
            System.out.println(date + 151);
        if (month == 7)
            System.out.println(date + 181);
        if (month == 8)
            System.out.println(date + 212);
        if (month == 9)
            System.out.println(date + 243);
        if (month == 10)
            System.out.println(date + 273);
        if (month == 11)
            System.out.println(date + 304);
        if (month == 12)
            System.out.println(date + 334);
        if (month > 12)
            System.out.println("В году всего 12 месяцев!");
    }

}
