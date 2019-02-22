package by.it._tasks_.ivanstets;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int fn, sn, Sum;
        System.out.println("Введите первое число: ");
        fn = cs.nextInt();
        System.out.println("Введите второе число: ");
        sn = cs.nextInt();
        Sum = fn + sn;

        String B1 = Integer.toBinaryString(fn);
        String B2 = Integer.toBinaryString(sn);
        String BIN = Integer.toBinaryString(Sum);

        String O1 = Integer.toOctalString(fn);
        String O2 = Integer.toOctalString(sn);
        String OCT = Integer.toOctalString(Sum);

        String H1 = Integer.toHexString(fn);
        String H2 = Integer.toHexString(sn);
        String HEX = Integer.toHexString(Sum);


        System.out.println("DEC:" + fn + "+" + sn + "=" + Sum);
        System.out.println("BIN:" + B1 + "+" + B2 + "=" + BIN);
        System.out.println("HEX:" + H1 + "+" + H2 + "=" + HEX);
        System.out.println("OCT:" + O1 + "+" + O2 + "=" + OCT);
    }


}
