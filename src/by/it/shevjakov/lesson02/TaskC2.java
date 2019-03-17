package by.it.shevjakov.lesson02;

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
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + sum);
        String binary1 = Integer.toBinaryString(a);
        String binary2 = Integer.toBinaryString(b);
        String binary3 = Integer.toBinaryString(sum);
        System.out.println("BIN:" + binary1 + "+" + binary2 + "=" + binary3);
        String hex1 = Integer.toHexString(a);
        String hex2 = Integer.toHexString(b);
        String hex3 = Integer.toHexString(sum);
        System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + hex3);
        String octal1 = Integer.toOctalString(a);
        String octal2 = Integer.toOctalString(b);
        String octal3 = Integer.toOctalString(sum);
        System.out.println("OCT:" + octal1 + "+" + octal2 + "=" + octal3);
    }

}
