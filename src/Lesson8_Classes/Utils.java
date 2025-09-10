package Lesson8_Classes;

public class Utils {
    /*
    Задача №4
    Написать статический метод,
    превращающий натуральное (целое положительное) число (например, 643) в строку,
    состоящую из названий цифр этого числа (например, “шесть четыре три”).
    */
    public static String converterFromIntToString(int a) {
        StringBuilder result = new StringBuilder();
        String str = "" + a;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                    result.append("ноль").append(" ");
                    break;
                case '1':
                    result.append("один").append(" ");
                    break;
                case '2':
                    result.append("два").append(" ");
                    break;
                case '3':
                    result.append("три").append(" ");
                    break;
                case '4':
                    result.append("четыре").append(" ");
                    break;
                case '5':
                    result.append("пять").append(" ");
                    break;
                case '6':
                    result.append("шесть").append(" ");
                    break;
                case '7':
                    result.append("семь").append(" ");
                    break;
                case '8':
                    result.append("восемь").append(" ");
                    break;
                case '9':
                    result.append("девять").append(" ");
                    break;
            }
        }
        return result.toString();
    }
}
