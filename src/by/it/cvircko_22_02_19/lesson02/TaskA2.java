package by.it.cvircko_22_02_19.lesson02;

/*
напишите тело main программы которая выводит на экран 5 строк
"Я начинаю изучать Java!"

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/

class TaskA2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Я начинаю изучать Java!");
            i++;
        } while (i < 6);
    }
}