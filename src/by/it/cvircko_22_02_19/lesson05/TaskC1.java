package by.it.cvircko_22_02_19.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> baseList = new ArrayList();
        ArrayList<Integer> listDiv3 = new ArrayList();
        ArrayList<Integer> listDiv2 = new ArrayList();
        ArrayList<Integer> listRemain = new ArrayList();

        for (int i = 0; i < 20; i++) {
            int value = scanner.nextInt();
            baseList.add(value);
        }
        for (int i = 0; i < 20; i++) {
            int var = baseList.get(i);
            if (var % 3 == 0 && var % 2 == 0) {
                listDiv3.add(var);
                listDiv2.add(var);
            } else if (var % 3 == 0 && var % 2 != 0) {
                listDiv3.add(var);
            } else if (var % 3 != 0 && var % 2 == 0) {
                listDiv2.add(var);
            } else
                listRemain.add(var);
        }

        printList(listDiv3);
        printList(listDiv2);
        printList(listRemain);
    }

    private static void printList(List<Integer> list) {

        for (Integer aList : list) System.out.println(aList);
    }


}