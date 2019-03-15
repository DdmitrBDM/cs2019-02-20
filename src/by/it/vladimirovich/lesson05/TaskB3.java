package by.it.vladimirovich.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]=sc.nextInt();
        }
        int first=array[0];
        int last=array[array.length-1];
        for (int i = 1; i <array.length ; i++) {
            for (int j = array.length-1; j >=i ; j--) {
                if (array[j-1]>array[j]){
                    int t=array[j-1];
                    array[j-1] = array[j];
                    array[j]=t;
                }


            }        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == first) System.out.println("Index of first element=" + i);
            if (array[i] == last) System.out.println("Index of last element=" + i);
        }
        }}

