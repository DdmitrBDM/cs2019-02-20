package by.it.cvircko_22_02_19.lesson02;

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
OCT:42+32=74*/


import java.math.BigInteger;
class TaskC2 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in); // объект класса Scanner
            System.out.println("Введите числа");
            int a = scn.nextInt(); // считываем первое введенное число
            int b = scn.nextInt();
            System.out.println("DEC:"+ a + "+" + b + "=" + (a+b) );
            String c = (Integer.toString(a, 2));// преобразовали в двоичную систему число а
            String e = (Integer.toString(b, 2)); // преобразовали число в
            String d = (Integer.toString(a+b, 2)); //преобразовали сумму
            System.out.println((("BIN:" + c + "+" + e + "=" + d) ));
            String i = (Integer.toString(a, 16));// преобразовали в двоичную систему число а
            String f = (Integer.toString(b, 16)); // преобразовали число в
            String g = (Integer.toString(a+b, 16)); //преобразовали сумму
            System.out.println((("HEX:" + i + "+" + f + "=" + g) ));
            String h = (Integer.toString(a, 8));// преобразовали в двоичную систему число а
            String n = (Integer.toString(b, 8)); // преобразовали число в
            String m = (Integer.toString(a+b, 8)); //преобразовали сумму
            System.out.println((("OCT:" + h + "+" + n + "=" + m) ));

        }

}
