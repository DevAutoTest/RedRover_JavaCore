package Lesson2_Variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        /** Необходимо создать целочисленные переменные a и b,
        присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций
        с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
        Также сделать проверку на четность этих переменных и вывести результат. */

        int a = 99;
        int b = 100;
        System.out.println("a + b = ");
        System.out.println(a + b);
        System.out.println("a * b = ");
        System.out.println(a * b);
        System.out.println("a - b = ");
        System.out.println(a - b);
        System.out.println("a / b = ");
        System.out.println(a / b);
        System.out.println("a/b = ");
        System.out.println(a / b);
        System.out.println("a % b = ");
        System.out.println(a % b);
        System.out.println("a is even or odd?: ");
        System.out.println((a%2)==0?"even":"odd");
        System.out.println("b is even or odd?: ");
        System.out.println((b%2)==0?"even":"odd");

        System.out.println("Task 2: ");
        /** Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
        а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот) */

        int aa = 5;
        int bb = 10;

        int temp = aa;
        aa = bb;
        bb = temp;

        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);

        System.out.println("Task 3: ");
        /** Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
         половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
         Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
         Вывести на экран кому сколько пиастров полагается
         Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему? */

        Loots.piratsLoots(50, 5000);

       }

       public static class Loots {

           public static void piratsLoots ( int pirats, int loot){
               double shipOwner;
               double capitanSparrow;
               double piratLoot;

               shipOwner = (double) loot / 2; // 5000/2=2500
               capitanSparrow = (loot - shipOwner) / 2; // 2500/2 = 1250
               piratLoot = (loot -shipOwner - capitanSparrow) / (pirats); //(5000 - 1250 - 2500) /2 = 1250 / 50 =
               capitanSparrow+= piratLoot + shipOwner;

               System.out.println("shipOwner = " + shipOwner);
               System.out.println("capitanSparrow = " + capitanSparrow);
               System.out.println("piratLoot = " + piratLoot);
               System.out.println(capitanSparrow + (pirats - 1) * piratLoot);


           }

       }
}
