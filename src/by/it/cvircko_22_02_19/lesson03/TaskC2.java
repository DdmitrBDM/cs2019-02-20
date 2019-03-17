package by.it.cvircko_22_02_19.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sumDigitsInNumber(x));
    }

    public static int sumDigitsInNumber(int x) {
        int a = (x / 1000)-(x%1); //5
        int b = ((x / 100)%10); //4
        int c = ((x / 10)%100)%10; //6
        int d = ((x %1000)%100)%10; //7
        int sum = a + b + c + d;
        return sum;
    }
}


