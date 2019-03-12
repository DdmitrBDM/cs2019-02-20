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
        int daynumber=1;
            switch (month){


                case 1: daynumber = day;
                    System.out.println(daynumber); break;
                case 2: daynumber = day + 31;
                    System.out.println(daynumber); break;
                case 3: daynumber = day + 59;
                    System.out.println(daynumber); break;
                case 4: daynumber = day + 90;
                    System.out.println(daynumber); break;
                case 5: daynumber = day + 120;
                    System.out.println(daynumber); break;
                case 6: daynumber = day + 151;
                    System.out.println(daynumber); break;
                case 7: daynumber = day + 181;
                    System.out.println(daynumber); break;
                case 8: daynumber = day + 212;
                    System.out.println(daynumber); break;
                case 9: daynumber = day + 243;
                    System.out.println(daynumber); break;
                case 10: daynumber = day + 273;
                    System.out.println(daynumber); break;
                case 11: daynumber = day + 303;
                    System.out.println(daynumber); break;
                case 12: daynumber = day + 334;
            System.out.println(daynumber); break;}


    }}


