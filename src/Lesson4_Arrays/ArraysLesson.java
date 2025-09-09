package Lesson4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

import static Lesson4_Arrays.ArraysLesson.MailName.longestEmail;

public class ArraysLesson {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести все нечетные числа из массива.
         */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("odd numbers: ");
        for (int i = 0; i < array.length;i++) {
            if(array[i]%2!=0) {
                System.out.println(" " + array[i]);
            }
        }

        System.out.println("Task 2: ");
        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести все значения массива больше 5.
         */
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("numbers > 5: ");
        for (int i = 0; i < array.length; i++) {
            if (array2[i] > 5) {
                System.out.println(" " + array2[i]);
            }
        }

        System.out.println("Task 3: ");
        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо увеличить все значения массива на 15.
         */
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.println("old value = " + array3[i]);
            array3[i] = array3[i] + 15;
            System.out.println("new value = " + array3[i]);
        }

        System.out.println("Task 4: ");
        /*
         Дана строка:
         String s = “Перестановочный алгоритм быстрого действия”;
         необходимо вывести все буквы “о” из этой строки.
         Для указанной строки ответ будет “ооооо” (или в столбик)

         */
        String s = "Перестановочный алгоритм быстрOго действия";
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'о' || chars[i] == 'O') {
                result += chars[i];
            }
        }
        System.out.println("All letters \"o or O\": " + result);

        System.out.println("Task 5: ");
        /**
         Дана строка:
         String s = “Перевыборы выбранного президента”;
         необходимо подсчитать количество букв “е” в строке.
         Для указанной строки ответ будет 4.
         */
        String s2 = "Перевыборы выбранного президента";
        char[] chars2 = s2.toCharArray();
        String result2 = "";
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == 'е') {
                result2 += chars2[i];
            }
        }
        System.out.println("All letters \"е\" : " + result2.length());

        System.out.println("Task 6: ");
        /*
         Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести сумму всех значений массива.
         */
        int[] array4 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result4 = 0;

        for (int i = 0; i < array4.length; i++) {
            result4 += array4[i];
        }
        System.out.println("sum of all values = " + result4);

        System.out.println("Task 7: ");
        /*
         Имеется 20 коробок спичек.
         Найти все коробки, количество спичек в которых отличается от среднего количества больше, чем на 3.
         Например, если есть следующие данные:
         60, 59, 58, 59, 64, 60,
         то среднее количество будет чуть меньше 60.
         Соответственно, коробка с 64 спичками будет сильно отличаться от среднего.
         */

        int[] numberInBox = {60, 59, 58, 59, 64, 60, 61, 59, 60, 65, 63, 63, 63, 64, 61, 60, 61, 62, 57, 60};
        double avg;
        double sum = 0;
        int result7 = 0;

        for (int i = 0; i < numberInBox.length; i++) {
            sum += numberInBox[i];
        }
        avg = sum / numberInBox.length;

        for (int i = 0; i < numberInBox.length; i++) {
            if (Math.abs(numberInBox[i] - avg) > 3) {
                result7 += 1;
            }
        }

        int[] resultArray = new int[result7];

        int startIndx = 0;
        int startInd2 = 0;
        while (startIndx < numberInBox.length) {
            if (Math.abs(numberInBox[startIndx] - avg) > 3) {
                resultArray[startInd2] = numberInBox[startIndx];
                startInd2 += 1;
            }
            startIndx += 1;
        }

        System.out.printf("avg = %.3f: ", avg);
        System.out.println("More than avg by 3: " + Arrays.toString(resultArray));

        System.out.println("Task5.1: ");
        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести сумму всех значений массива.
         */
        int[] array8 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum8 = 0;
        for (int j : array8) {
            sum8 += j;
        }
        System.out.println("sum8 = " + sum8);

        System.out.println("Task5.2: ");
        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести максимальное значение массива
         */
        int[] array9 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int j : array9) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("max value = " + max);

        System.out.println("Task5.3: ");

        /*
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести минимальное значение массива
         */
        int[] array10 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;

        for (int x : array10) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("min value = " + min);

        System.out.println("Task5.4: ");

        /*
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         необходимо вывести среднее арифметическое всех значений массива.
         */

        int[] array11 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double avg11;

        int sum11 = 0;

        for (int s11 : array11) {
            sum11 += s11;
        }

        avg11 = (double) sum11 / array11.length;
        System.out.println("avg11 = " + avg11);

        System.out.println("Task5.5: ");

        /*
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести сумму элементов массива.
         */

        int[][] array12 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum12 = 0;

        for (int i = 0; i < array12.length; i++) {
            for (int j = 0; j < array12[i].length; j++) {
                sum12 += array12[i][j];
            }
        }

        System.out.println("sum12 = " + sum12);

        System.out.println("Task5.6: ");

        /*
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести максимальное значение массива.
         */

        int[][] array13 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max13 = Integer.MIN_VALUE;

        for (int i = 0; i < array13.length; i++) {
            for (int j = 0; j < array13[i].length; j++) {
                if (array13[i][j] > max13) {
                    max13 = array13[i][j];
                }
            }
        }
        System.out.println("max13 = " + max13);

        System.out.println("Task5.7: ");

        /*
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести количество элементов в массиве.
         */

        int[][] array14 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;

        for (int i = 0; i < array14.length; i++) {
            for (int j = 0; j < array14[i].length; j++) {
                count++;
            }
        }

        count = 0;
        for (int[] ar : array14) {
            count = count + ar.length;
        }

        System.out.println("count = " + count);

        System.out.println("Task 6.1 ");
        /*
         Вы ведете записи наивысшей дневной температуры.
         Найдите самый жаркий день. Найдите второй самый жаркий.
         Предполагается, что во все дни температура разная.
         */

        int[] array15 = {30, 35, 31, 32, 33, 34};

        int maxTemp = Integer.MIN_VALUE;
        int secondMaxTemp = Integer.MIN_VALUE;

        for (int temp : array15) {
            if (temp > maxTemp) {
                secondMaxTemp = maxTemp; // 0 30
                maxTemp = temp; //30 35
            } else if (temp > secondMaxTemp) {
                secondMaxTemp = temp;
            }
        }
        System.out.println("maxTemp = " + maxTemp);
        System.out.println("second max temp = " + secondMaxTemp);

        System.out.println("Task 6.2 ");
        /*
         У вас есть список адресов электронной почты.
         Найдите все адреса с доменом gmail.com. /*@gmail.com
         Адреса поддельных сайтов типа myrealgmail.com не учитывать. / != *@myrealgmail.com
         Найти самый короткий и самый длинный адреса.
         Проверить, нет ли адресов с юзернеймом admin / admin@gmail.com
         */

        ArrayList<String> emails = new ArrayList<>();
        emails.add("user@gmail.com");
        emails.add("Admin@gmail.com");
        emails.add("long.username+tag@gmail.com");
        emails.add("foo@yahoo.com");
        emails.add("bar@myrealgmail.com");
        emails.add("x@gmail.com");
        emails.add("admin@gmail.com");
        emails.add("someone@outlook.com");
        emails.add("sd@myrealgmail.com");
        emails.add("");
        emails.add("someone2@GMAIL.COM");

        ArrayList<String> resultList = MailName.validMailName(emails);

        for (String email : resultList) {
            System.out.println(email);
        }

        ArrayList<String> adminsEmailsList = MailName.adminUserNameEmails(resultList);

        for (String email : adminsEmailsList) {
            System.out.println(email);
        }

        String longestEmail = longestEmail(resultList);
        System.out.println(longestEmail);

        String shortestEmail = MailName.shortestEmail(resultList);
        System.out.println(shortestEmail);


        System.out.println("Task 6.3 ");
        /*
         Создайте двумерный массив 5х5, заполните его какими-нибудь числами.

         Напечатайте его таким образом, чтобы он сохранял форматирование
         (колонки были выровнены), если числа в нем будут любыми от -99 до 999.

         */

        int[][] array16 = {{55, 978, -95, 0, 41}, {0, 566, 999, 45, 7}, {74, -54, 15, 78, 14}, {0, 0, 0, 0, 0}, {8, -8, 8, 8, 8}};
        for (int i = 0; i < array16.length; i++) {
            for (int j = 0; j < array16[i].length; j++) {
                String num = String.valueOf(array16[i][j]);
                if (num.length() == 1)
                    System.out.print(array16[i][j] + "   ");
                if (num.length() == 2)
                    System.out.print(array16[i][j] + "  ");
                if (num.length() == 3)
                    System.out.print(array16[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("Task 6.4 ");
        /*
         Возьмите массив из предыдущей задачи,
         и выведите в одну строку все числа,
         лежащие на его диагонали от верхнего левого угла до нижнего правого.
         В другой строке — числа на н другой диагонали, от верхнего правого до нижнего левого углов.
         */

        int[][] array17 = {{55, 978, -95, 0, 41}, {0, 566, 999, 45, 7}, {74, -54, 15, 78, 14}, {0, 0, 0, 0, 0}, {8, -8, 8, 8, 8}};

        int srcRow = array17.length; //5
        int srcCol = array17[srcRow - 1].length; //5

        int[][] array18 = new int[2][srcRow];

        System.out.println("srcRow = " + srcRow + "," + " srcCol = " + srcCol);

        for (int i = 0; i < srcRow; i++) {
            array18[0][i] = array17[i][i];
            array18[1][i] = array17[i][srcCol - 1 - i];
        }
        System.out.println(Arrays.deepToString(array18));

//        for (int i = 0; i < array17.length; i++) {
//            for (int k = 0; k < array18.length; k++) {
//                array18[k][i] = array17[i][i];
//            }
//            array18[array18.length - 1][i] = array17[i][array17.length-1-i];
//        }
//        System.out.println(Arrays.deepToString(array18));

        System.out.println("Task 6.5: ");
        /*
        Возьмите массив из предыдущей задачи, или любой другой квадратный массив (матрицу).
        Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла.
         */

        String[][] array19 = { {"a00", "a01", "a02", "a03", "a04"},
                               {"a10", "a11", "a12", "a13", "a14"},
                               {"a20", "a21", "a22", "a23", "a24"},
                               {"a30", "a31", "a32", "a33", "a34"},
                               {"a40", "a41", "a42", "a43", "a44"}};

        int srcRow19 = array19.length; //5
        int srcCol19 = array19[srcRow-1].length;//5

        String[][] array20 = new String[srcRow19][srcCol19];

        for (int i = 0; i < srcRow19; i++) {
            for (int j = 0; j < srcCol19; j++) {
                array20[i][j] = array19[j][i];
            }

        }
        for (int i = 0; i < srcRow19; i++) {
            for (int j = 0; j < srcCol19; j++) {
                if(j!=(srcCol19-1)){
                    System.out.print(array20[i][j]);
                } else System.out.println("");}
        }
        System.out.println(Arrays.deepToString(array20));

        System.out.println("Task 6.2: ");
        /*
        Дана строка:
        I’m just 16,
        going on	17!

        (перед 17 стоит Tab, а не пробел).
        В принципе, это может быть ЛЮБАЯ строка, содержащая латинские буквы в верхнем и нижнем регистре, цифры, знаки препинания.
        Найти, сколько в этой строке
        -заглавных букв,
        -сколько прописных,
        -сколько гласных,
        -сколько согласных,
        -сколько цифр,
        -сколько знаков препинания,
        -сколько “пробельных” символов (в них входят пробелы, символы табуляции, перевод строки и пр. Поищите “whitespace characters”).
        Имейте в виду, что некоторые проверки можно делать легче, чем другие.
        Поэкспериментируйте.
         */

        String text = "I’m just 16 \\ \",\n" +
                "        going on\t17!";

        int capitals = TextUtils.capitalLettersCount(text);
        System.out.println("capitals = " + capitals);
        int lowers = TextUtils.lowerCaseLettersCount(text);
        System.out.println("lowers = " + lowers);
        int consonants = TextUtils.consonantsLettersCount(text);
        System.out.println("constants = " + consonants);
        int digits = TextUtils.digitsCount(text);
        System.out.println("digits = " + digits);
        int wightSpaces = TextUtils.whiteSpaceCount(text);
        System.out.println("wightsapces = " + wightSpaces);
        int punctuations = TextUtils.punctuationsCount(text);
        System.out.println("punctuations = " + punctuations);
        int vowels = TextUtils.vowelsLettersCount(text);
        System.out.println("vowels = " + vowels);


        System.out.println("Task 6.7");
        /*
        Напишите код, который будет проверять, насколько трудно подобрать пароль.
        Чтобы пройти проверку, пароль должен быть
        -не менее 8 символов,
        содержать как минимум:
        -заглавную латинскую букву
        -строчную латинскую букву
        -цифру
        -знак препинания из списка: ~@#$%^&*()_-+=
        -и не иметь пробелов и символов НЕ упомянутых в этом перечислении.

       */

        String password = "Lena1234 @";

        System.out.println(PasswordUtils.validPassword(password));

        System.out.println("Task 6.8 : ");

        /*C:\Users\Elena\IdeaProjects\RedRover_JavaCore\src\resources\Arrays_Task10.png
        Вывести следующие строки с соответствующим форматированием (как пирамиды):
        Задача № 8
        0  1  2  3  4  5  6  7  8  9
        0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
        0  1  2  3  4  5  6
        0  1  2  3  4  5
        0  1  2  3  4
        0  1  2  3
        0  1  2
        0  1
        0


                 0
               0  1
             0  1  2
           0  1  2  3
         0  1  2  3  4
       0  1  2  3  4  5
     0  1  2  3  4  5  6
   0  1  2  3  4  5  6  7
 0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7  8  9
        */

        String[][] array21 = {
                {"a00", "a01", "a02", "a03", "a04", "a05", "a06", "a07", "a08", "a09"},
                {"a10", "a11", "a12", "a13", "a14", "a15", "a16", "a17", "a18", ""},
                {"a20", "a21", "a22", "a23", "a24", "a25", "a26", "a27", "", ""},
                {"a30", "a31", "a32", "a33", "a34", "a35", "a36", "", "", ""},
                {"a40", "a41", "a42", "a43", "a44", "a45", "", "", "", ""},
                {"a50", "a51", "a52", "a53", "a54", "", "", "", "", ""},
                {"a60", "a61", "a62", "a63", "", "", "", "", "", ""},
                {"a70", "a71", "a72", "", "", "", "", "", "", ""},
                {"a80", "a81", "", "", "", "", "", "", "", ""},
                {"a90", "", "", "", "", "", "", "", "", ""}
        };

        String[][] array22 = new String[10][10];
        int columns = array22.length - 1; // 0 -9
        int rows = array22.length - 1; // 0-9
        String space = "   "; // зависит от количества символов в значении, у меня = 3, поэтому 3 пробела


        for (int i = 0; i <= columns; i++) {
            for (int j = i; j <= rows; j++) {
                if (i == 0) {
                    array22[j][i] = space.repeat(columns - j) + array21[j - i][i] + space;
                } else array22[j][i] = array21[j - i][i] + space;
            }
        }

        for (int i = 0; i <= columns; i++) {
            for (int j = 0; j <= rows; j++) {
                if (array22[i][j] == null) {
                    array22[i][j] = space;
                }
            }
        }

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (j != columns) {
                    System.out.print(array22[i][j]);
                } else System.out.print(array22[i][j] + "\n");
            }
        }


        System.out.println("Task 6.9 : ");

        /* [Открыть Arrays_Task9.png](src/main/resources/Arrays_Task9.png) */

        /*
        Задача № 9

0  1  2  3  4  5  6  7  8  9
    0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
             0  1  2  3  4  5  6
                 0  1  2  3  4  5
                     0  1  2  3  4
                         0  1  2  3
                             0  1  2
                                 0  1
                                     0

         */

        String[][] array23 = {
                {"a00", "a01", "a02", "a03", "a04", "a05", "a06", "a07", "a08", "a09"},
                {"", "a10", "a11", "a12", "a13", "a14", "a15", "a16", "a17", "a18"},
                {"", "", "a20", "a21", "a22", "a23", "a24", "a25", "a26", "a27"},
                {"", "", "", "a30", "a31", "a32", "a33", "a34", "a35", "a36"},
                {"", "", "", "", "a40", "a41", "a42", "a43", "a44", "a45"},
                {"", "", "", "", "", "a50", "a51", "a52", "a53", "a54"},
                {"", "", "", "", "", "", "a60", "a61", "a62", "a63"},
                {"", "", "", "", "", "", "", "a70", "a71", "a72"},
                {"", "", "", "", "", "", "", "", "a80", "a81"},
                {"", "", "", "", "", "", "", "", "", "a90"}
        };

        String[][] array24 = new String[10][10];
        int columns24 = array23.length - 1; // 0 -9
        int rows24 = array23.length - 1; // 0-9
        String space24 = "   "; // зависит от количества символов в значении, у меня = 3, поэтому 3 пробела

        for (int i = 0; i <= columns24; i++) {
            for (int j = i, k = rows24; j <= rows24 && k >= 0; j++, k--) {
                if (i == 0) {
                    array24[j][i] = space.repeat(columns - j) + array23[i][k] + space;
                }
                if (i != 0 && k >= i) {
                    array24[j][i] = array23[i][k] + space;
                }
            }
        }

        //replace null values
        for (int i = 0; i <= columns24; i++) {
            for (int j = 0; j <= rows24; j++) {
                if (array24[i][j] == null) {
                    array24[i][j] = space;
                }
            }
        }

        //Print array24:
        for (int i = 0; i <= rows24; i++) {
            for (int j = 0; j <= columns24; j++) {
                if (j != columns) {
                    System.out.print(array24[i][j]);
                } else System.out.print(array24[i][j] + "\n");
            }
        }

        System.out.println("Task 6.9 : ");

        /*
        Задача № 10

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
      7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
         6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                  3 2 1 0 1 2 3
                     2 1 0 1 2
                        1 0 1
                           0

         */
        String[][] array25 = {
                {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"", "8", "7", "6", "5", "4", "3", "2", "1", "0", "1", "2", "3", "4", "5", "6", "7", "8", ""},
                {"", "", "7", "6", "5", "4", "3", "2", "1", "0", "1", "2", "3", "4", "5", "6", "7", "", ""},
                {"", "", "", "6", "5", "4", "3", "2", "1", "0", "1", "2", "3", "4", "5", "6", "", "", ""},
                {"", "", "", "", "5", "4", "3", "2", "1", "0", "1", "2", "3", "4", "5", "", "", "", ""},
                {"", "", "", "", "", "4", "3", "2", "1", "0", "1", "2", "3", "4", "", "", "", "", ""},
                {"", "", "", "", "", "", "3", "2", "1", "0", "1", "2", "3", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "2", "1", "0", "1", "2", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "1", "0", "1", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", "0", "", "", "", "", "", "", "", "", ""}
        };

        String[][] array26 = new String[10][19];

        int rows25 = array25.length - 1; //9
        int columns25 = array25[rows25 - 1].length - 1; //18
        String space26 = " ";

        for (int i = rows25, k = 0; i >= 0 && k <= columns25; i--, k++) {
            for (int j = k; j <= columns25; j++) {
                array26[i][j] = array25[k][j]; //90=00 ; 91=01 .....918=018
                //81=11 ; 82=12 .....817=117
            }
        }

        for (int i = 0; i < rows25; i++) {
            for (int j = 0; j < columns25; j++) {
                if (array26[i][j] == null || array26[i][j].isEmpty()) {
                    array26[i][j] = space26;
                }
            }
        }

        //Print array26:
        for (int i = 0; i <= rows25; i++) { //
            for (int j = 0; j <= columns25; j++) {
                if (j != columns25) {
                    System.out.print(array26[i][j]);
                } else System.out.print(array26[i][j] + "\n");
            }
        }
    }


//***********************************************************************************************************************//

    static class MailName {
        static ArrayList<String> validMailName(ArrayList<String> emails) {
            ArrayList<String> resultArrayList = new ArrayList<>();
            int indexAt;
            String userName;
            String domainName = null;

            for (String email : emails) {
                if (!email.isEmpty()) {
                    indexAt = email.indexOf("@");
                    domainName = email.substring(indexAt + 1);
                    if (domainName.equalsIgnoreCase("gmail.com")) {
                        resultArrayList.add(email);
                    }
                }
            }
            return resultArrayList;
        }

        static ArrayList<String> adminUserNameEmails(ArrayList<String> emails) {
            ArrayList<String> adminsEmails = new ArrayList<>();

            for (String email : emails) {
                if (email.toLowerCase().contains("admin")) {
                    adminsEmails.add(email);
                }
            }
            return adminsEmails;
        }

        static String longestEmail(ArrayList<String> emails) {
            int longestIndex = Integer.MIN_VALUE;
            String longestEmail = "";

            for (String email : emails) {
                if (!email.isEmpty()) {
                    int indexAt = email.indexOf("@");
                    String userName = email.substring(0, indexAt);
                    if (userName.length() > longestIndex) {
                        longestIndex = userName.length();
                        longestEmail = email;
                    }
                }
            }
            return longestEmail;
        }

        static String shortestEmail(ArrayList<String> emails) {
            int shortestName = Integer.MAX_VALUE;
            String shortestEmail = "";

            for (String email : emails) {
                if (!email.isEmpty()) {
                    int indexAt = email.indexOf("@");
                    String userName = email.substring(0, indexAt);
                    if (userName.length() < shortestName) {
                        shortestName = userName.length();
                        shortestEmail = email;
                    }
                }
            }
            return shortestEmail;
        }
    }

    static class TextUtils {
        public static int capitalLettersCount(String text) {
            int countCapitals = 0;
            for (int i = 0; i < text.length(); i++) {
                if (Character.isUpperCase(text.charAt(i))) {
                    countCapitals += 1;
                }
                ;
            }
            return countCapitals;
        }

        static int lowerCaseLettersCount(String text) {
            int lowerCaseCount = 0;
            for (int i = 0; i < text.length(); i++) {
                if (Character.isLowerCase(text.charAt(i))) {
                    lowerCaseCount += 1;
                }
            }
            return lowerCaseCount;
        }

        static int vowelsLettersCount(String text) {
            int countVowels = 0;

            for (int i = 0; i < text.length(); i++) {
                if ("AEIOUaeiou".indexOf(text.charAt(i)) != -1) {
                    countVowels += 1;
                }
            }
            return countVowels;
        }

        static int consonantsLettersCount(String text) {
            int countConsonants = 0;

            for (int i = 0; i < text.length(); i++) {
                if ("ZXCVBNMLKJHGFDSQWRTYPzxcvbnmlkjhgfdsqwrtyp".indexOf(text.charAt(i)) != -1) {
                    countConsonants += 1;
                }
            }
            return countConsonants;
        }

        static int digitsCount(String text) {
            int countDigits = 0;

            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    countDigits += 1;
                }
            }
            return countDigits;
        }

        static int punctuationsCount(String text) {
            int countPunctuationsChars = 0;

            for (int i = 0; i < text.length(); i++) {
                if ("`~!@#$%^:&?*()-_+=\"'<>,./|\\’".indexOf(text.charAt(i)) != -1) {
                    countPunctuationsChars += 1;
                }
            }
            return countPunctuationsChars;
        }

        static int whiteSpaceCount(String text) {
            int countWhiteSpace = 0;

            for (int i = 0; i < text.length(); i++) {
                if (Character.isWhitespace(text.charAt(i))) {
                    countWhiteSpace += 1;
                }
            }
            return countWhiteSpace;
        }
    }

    static class PasswordUtils {
        static String validPassword(String password) {
            if (is8symbols(password)) {
                if (hasUpperCase(password)) {
                    if (hasLowerCase(password)) {
                        if (hasDigit(password)) {
                            if (hasPunctuations(password)) {
                                if (hasWhiteSpaces(password)) {
                                    return "Password has white spaces !!!";
                                }
                                return "Password Is Perfect !";
                            }
                            return "Password has no punctuations symbols !!!";
                        }
                        return "Password has no digit !!!";
                    }
                    return "Password has no lower letters !!!";
                }
                return "Password has no capital letters !!!";
            }
            return "Password less than 8 symbols!!!";
        }

        private static boolean is8symbols(String password) {
            return password.length() >= 8;
        }

        private static boolean hasUpperCase(String password) {
            boolean hasUpperCase = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                }
            }
            return hasUpperCase;
        }

        private static boolean hasLowerCase(String password) {
            boolean hasLower = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    hasLower = true;
                }
            }
            return hasLower;
        }

        private static boolean hasDigit(String password) {
            boolean hasDigits = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigits = true;
                }
            }
            return hasDigits;
        }

        private static boolean hasPunctuations(String password) {
            boolean hasPunctuations = false;
            for (int i = 0; i < password.length(); i++) {
                if ("~@#$%^&*()_-+=".indexOf(password.charAt(i)) != -1) {
                    hasPunctuations = true;
                }
            }
            return hasPunctuations;
        }

        private static boolean hasWhiteSpaces(String password) {
            boolean hasWhiteSpaces = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isWhitespace(password.charAt(i))) {
                    hasWhiteSpaces = true;
                }
            }
            return hasWhiteSpaces;
        }
    }
}

