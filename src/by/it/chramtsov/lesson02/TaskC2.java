package by.it.chramtsov.lesson02;

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
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int z = sc.nextInt();
            int q =n+z;
            System.out.println("DEC:"+ n+ "+" + z + "="+q);
            System.out.println("BIN:"+ Integer.toBinaryString(n)+ "+" + Integer.toBinaryString(z) + "="+Integer.toBinaryString(q));
            System.out.println("HEX:"+ Integer.toHexString(n)+ "+" + Integer.toHexString(z) + "="+Integer.toHexString(q));
            System.out.println("OCT:"+ Integer.toOctalString(n)+ "+" + Integer.toOctalString(z) + "="+Integer.toOctalString(q));

}}

