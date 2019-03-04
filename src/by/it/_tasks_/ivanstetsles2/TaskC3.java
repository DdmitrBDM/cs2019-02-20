package by.it._tasks_.ivanstetsles2;

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
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

class TaskC3 {
     private static double getWeight (int m){

          double gM = 3.86;
          double gE = 9.81;
          double del = gM/gE;
          double result;
         result = del*m;
         double answer;
         answer= new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();


         return answer;
      }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int m;
        System.out.println("Ввод: ");
        m=cs.nextInt();
        double getWeight;
        getWeight = getWeight (m);
        System.out.println("Вывод: " );
        System.out.println(getWeight);







    }
    }
