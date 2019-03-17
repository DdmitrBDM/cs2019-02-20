package by.it.cvircko_22_02_19.lesson04;

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

import java.time.DayOfWeek;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int e = sc.nextInt();
        Integer[] numberDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum=0;
        for (int i = 0; i < e-1; i++) {
            sum = sum + numberDay[i];
        }
        System.out.println(sum+k);
    }
}