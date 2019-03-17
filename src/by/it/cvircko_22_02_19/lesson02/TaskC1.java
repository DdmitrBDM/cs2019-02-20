package by.it.cvircko_22_02_19.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
//class TaskC1 {
import java.util.Scanner; // импорт класса Scanner

class TaskC1{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // объект класса Scanner
        System.out.println("Введите числа");
        int a = scn.nextInt(); // считываем первое введенное число
        int b = scn.nextInt();
        System.out.println("Sum = " + (a+b));
    }
}






