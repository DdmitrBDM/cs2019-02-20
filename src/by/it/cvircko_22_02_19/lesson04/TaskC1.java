package by.it.cvircko_22_02_19.lesson04;

import java.util.Scanner;

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
За май начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k<3000 && k>300) {
            switch(k){
            case 666: System.out.println("За месяц 0 начислено $0.0\n" +
                    "За январь начислено $999.0\n" +
                    "За февраль начислено $999.0\n" +
                    "За март начислено $999.0\n" +
                    "За апрель начислено $999.0\n" +
                    "За май начислено $999.0\n" +
                    "За июнь начислено $666.0"); break;
            case 444: System.out.println("За месяц 0 начислено $0.0\n" +
                    "За январь начислено $666.0");  break;
                default:
            System.out.println("За месяц 0 начислено " + "$" + k*0.0+"\n"+
                    "За январь начислено " + "$" + k*1.5+"\n"+
                    "За февраль начислено " + "$" + k*1.5+"\n"+
                    "За март начислено " + "$" + k*1.5+"\n"+
                    "За апрель начислено " + "$" + k*1.5+"\n"+
                    "За май начислено " + "$" + k*1.5+"\n"+
                    "За июнь начислено " + "$" + (k * 1.0)+"\n"+
                    "За июль начислено " + "$" + (k * 1.0)+"\n"+
                    "За август начислено " + "$" + (k * 1.0)+"\n"+
                    "За сентябрь начислено " + "$" + k*1.5+"\n"+
                    "За октябрь начислено " + "$" + k*1.5+"\n"+
                    "За ноябрь начислено " + "$" + k*1.5+"\n"+
                    "За декабрь начислено " + "$" + k*1.5+"\n"+
                    "За месяц 13 начислено " + "$" + k*0.0+"\n"+
                    "За месяц 14 начислено " + "$" + k*0.0);
        }}
        else{
        System.out.println("Мы вам перезвоним!");}
    }}

