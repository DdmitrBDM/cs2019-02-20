package by.it.ivanstets.ivanstetsles2;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/

public class TaskC1 {



    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int fn, sn, Sum;
        System.out.println("Введите первое число: ");
        fn = cs.nextInt ();
        System.out.println("Введите второе число: ");
        sn = cs.nextInt();
        Sum = fn + sn;

        System.out.println("Sum = " + Sum);
    }




}
