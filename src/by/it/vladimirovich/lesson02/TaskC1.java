package by.it.vladimirovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
        //System.out.println("Ввод (это вы вводите с клавиатуры):");
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int q = sc.nextInt();
        int Sum = i+q;
        System.out.println("Sum" + " " + "=" + " " + Sum);
    }





}
