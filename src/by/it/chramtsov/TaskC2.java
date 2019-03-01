package by.it.chramtsov;

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
 private static int sumDigitsInNumber(int number){

    int x=number%10;
    int y1=   number/10;
    int y=y1%10;
    int z1= (int)  number/100;
    int z=z1%10;
    int q1= (int)  number/1000;
    int q=q1%10;
    return x+y+z+q;
}



   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
               int f = sc.nextInt();
               int g=sumDigitsInNumber(f);
       System.out.println(g);
    }

}
