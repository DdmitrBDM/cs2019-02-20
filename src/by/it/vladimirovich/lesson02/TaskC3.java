package by.it.vladimirovich.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    static double getWeight(int weight){
        double result=weight/9.81*3.86;
        int r100=(int) (result*100);
        double delta=result*100-r100;
        if (delta<0.5)
            return r100/100.0;
            else
                return(r100 + 1)/100.0;
    }
    public static void main(String[] args) {
        System.out.println("Ввод:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double wm=getWeight(i);

        System.out.println(wm);
    }

}
