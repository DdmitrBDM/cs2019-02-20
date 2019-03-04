package by.it._tasks_.ivanstetsles3;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/

import java.util.Scanner;



class TaskB2 {
    private static double dis(int a, int b, int c) {
        double D;
        D = b * b - 4 * a * c;
        return D;

    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a, b, c;
        a = cs.nextInt();
        b = cs.nextInt();
        c = cs.nextInt();
        double x;
        double y;
        double di;
        di =dis(a, b, c);
        double z = Math.sqrt(di);
        x = (-b + z) / (2 * a);
        y = (-b - z) / (2 * a);
        if (di > 0) System.out.println(x + " " + y);
        if (di < 0) System.out.println("Отрицательный дискриминант");
        if (di == 0) System.out.println(x);


    }

}
