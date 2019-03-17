package by.it.cvircko_22_02_19.lesson05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Scanner;

public class TaskB2 {
   // public static void main(String[] args) {

            public static void main(String[] args) throws Exception
            {
                Scanner sc = new Scanner(System.in);

                int[] massiv  = new int[20];

                for (int i=0;i<massiv.length;i++)
                {
                    massiv[i]=sc.nextInt();
                }

                int[] m1 = new int [10];
                int[] m2 = new int [10];

                for (int i=0;i<m1.length;i++)
                {
                    m1[i] = massiv[i];
                }
                int k=10;
                for (int i = 0; i < m2.length ; i++,k++)
                {
                    m2[i]=massiv[k];
                }
                for (int i = 0; i < m2.length ; i++)
                {
               //     System.out.println("a="+[i]+"b="+ [i]);

                }System.out.println("a=" + Arrays.toString(m1));
                System.out.println("b=" + Arrays.toString(m2));
            }
    }
//        int m[] = new int[20];
//        int z= m.length/2;
//        System.out.println(z);
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <= m.length; i++) {
//            m[i] = sc.nextInt();
//            System.out.println(m[i] + " ");
//        }
//        int[] b = new int[z];
//        for (int i = 0; i < z; i++) {
//            b[i] = m[i];
//        }
//
//        int[] c = new int[z];
//        for (int i = z; i < m.length; i++) {
//            c[i - z] = m[i];
//        }
//        System.out.println("a=" + Arrays.toString(c));
//        System.out.println("b=" + Arrays.toString(b));
//        System.out.println("hello");
//
//    }
//}


