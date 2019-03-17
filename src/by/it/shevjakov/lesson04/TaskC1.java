package by.it.shevjakov.lesson04;
/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?
После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!
Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.
Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.
Пример работы программы (у вас должно быть так же, до символа):
Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0
*/

import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount < 300) System.out.println("Мы вам перезвоним!");
        else if (amount > 3000) System.out.println("Мы вам перезвоним!");
        else {
            for (int month = 0; month <= 14; month++) {
                double salary;
                if (month == 0) System.out.println("За месяц 0 начислено $0.0");
                if (month == 1) {
                    salary = amount * 1.5;
                    System.out.println("За январь начислено $" + salary);
                    if (salary == 666) break;
                }
                if (month == 2) {
                    salary = amount * 1.5;
                    System.out.println("За февраль начислено $" + salary);
                }
                if (month == 3) {
                    salary = amount * 1.5;
                    System.out.println("За март начислено $" + salary);
                }
                if (month == 4) {
                    salary = amount * 1.5;
                    System.out.println("За апрель начислено $" + salary);
                }
                if (month == 5) {
                    salary = amount * 1.5;
                    System.out.println("За май начислено $" + salary);
                }
                if (month == 6) {
                    salary = amount;
                    System.out.println("За июнь начислено $" + salary);
                    if (salary == 666) break;
                }
                if (month == 7) {
                    salary = amount;
                    System.out.println("За июль начислено $" + salary);
                }
                if (month == 8) {
                    salary = amount;
                    System.out.println("За август начислено $" + salary);
                }
                if (month == 9) {
                    salary = amount * 1.5;
                    System.out.println("За сентябрь начислено $" + salary);
                }
                if (month == 10) {
                    salary = amount * 1.5;
                    System.out.println("За октябрь начислено $" + salary);
                }
                if (month == 11) {
                    salary = amount * 1.5;
                    System.out.println("За ноябрь начислено $" + salary);
                }
                if (month == 12) {
                    salary = amount * 1.5;
                    System.out.println("За декабрь начислено $" + salary);
                }
                if (month == 13)
                    System.out.println("За месяц 13 начислено $0.0");
                if (month == 14)
                    System.out.println("За месяц 14 начислено $0.0");
            }
        }
    }
}
