package Lesson3_Conditions;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Conditions {
    public static void main(String[] args) {
        /**Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и
         вывести следующие строки:
         a == b - если переменные равны
         a < b - если переменная a меньше b
         a > b - если переменная b меньше a */

        System.out.println("Task 1: ");

        int a = 5;
        int b = 2;
        if (a == b) {
            System.out.println("а равна b");
        }
        if (a < b) {
            System.out.println("a < b");
        }

        if (a > b) {
            System.out.println("a > b");
        }

        System.out.println("Task 2: ");
        /**Необходимо создать две целочисленные переменные (a, b),
         присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
         maybe a and b are even - если сумма переменных четная
         some variable is odd - если сумма переменных нечетная */

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else System.out.println("some variable is odd");

        System.out.println("Task 3: ");
        /**Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
         больше 10 - если переменная больше 10
         меньше 100 - если переменная меньше 100
         результат деления на 2 больше 20 - если это соответствует истине
         значение переменной между 5 и 40 включительно - если это правда
         значение переменной меньше 5 или больше 40 - если предыдущие условие ложное */


        int c = 101;

        if (c > 10) {
            System.out.println(">10");
        }
        if (c < 100) {
            System.out.println("<100");
        }
        if (c / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (c >= 5 && c <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        }
        if (c < 5 || c > 40) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        System.out.println("Task 4: ");
        /**
         Необходимо вывести числа от 0 до 15. */

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("Task 5: ");
        /**Необходимо возводить в степень число 5 начиная с показателя 1
         пока результат возведения в степень меньше 10000, вывести результат каждого возведения в степень */

        int startResult = 5;
        int multiplicator = 5;
        int result = 1000;
        System.out.println(startResult);

        do {
            startResult *= multiplicator;
            System.out.println(startResult);
        }
        while (startResult <= result);

        System.out.println("Task 6: ");
        /**
         Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
         Реализовать 2 варианта:
         использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
         без использования конструкции if (шаг цикла на ваше усмотрение).
         */
        System.out.println("output 1: ");
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        int initValue = 40;
        System.out.println("output 2: ");
        do {
            System.out.println(initValue);
            initValue+=4;
        }
        while (initValue <= 60);

    }


}



