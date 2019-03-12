package by.it.vladimirovich.lesson04;

import java.util.Scanner;

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
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int daynumber;
        if (month == 1) daynumber = day;
        if (month == 2) daynumber = day + 31;
        if (month == 3) daynumber = day + 59;
        if (month == 4) daynumber = day + 90;
        if (month == 5) daynumber = day + 120;
        if (month == 6) daynumber = day + 151;
        if (month == 7) daynumber = day + 181;
        if (month == 8) daynumber = day + 212;
        if (month == 9) daynumber = day + 242;
        if (month == 10) daynumber = day + 273;
        if (month == 11) daynumber = day + 303;
        if (month == 12) daynumber = day + 334;}


    }


