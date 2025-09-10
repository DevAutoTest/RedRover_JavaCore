package Lesson7_Methods;

/**
 * Операция + работает только для числовых примитивов (int, double, …) и строк (String)!!!
 * автоупаковка и распаковка не работают для массивов!
 * В Java арифметические операции (+, -, *, /) над типами byte и short автоматически приводятся к int. Это правило языка.
 * при autoboxing не всегда создается действительно новый объект Integer. Для значений от -128 до 127 включительно объекты кэшируются.
 * В случае перегрузки метода, если не будет найден соответствующий тип, то будет найден ближайший метод, расширяющий этот тип
 * в вещественных числа мантисса от 1.0 до 10, экспонента записывается как Е
 */
public class MethodsSumLesson {
    public static void main(String[] args) {
        //1
        MathSumOperation.sum((Object) 5, (Object) 6);
        //2
        MathSumOperation.sum((Integer) 5, (Integer) 6);
        //3
        MathSumOperation.sum(5, 6);

        //4
        byte sumByte = MathSumOperation.sum((byte) 127, (byte) 127); // сработает переполнение, = -2
        System.out.println("sumByte result = " + sumByte + "\n");
        //5
        MathSumOperation.sum(2_147_483_647, 2_147_483_647); // сработает переполнение, = -2
        //6
        MathSumOperation.sum(2_147_483_647, 2_147_483_647); // выберется сумма int, сработает переполнение, = -2
        //7
        MathSumOperation.sum(2_147_483_647L, 2_147_483_647); // выберется сумма long, рассчитается без ошибок
        //8
        MathSumOperation.sum(10, 15.3d);
        //9
        MathSumOperation.sum(10d, 15.3d);
        //10
        MathSumOperation.sum(10d, 15.3f); // произойдет расширение типа с float до double
        //11
        MathSumOperation.sum(1.25E-2, 1.375E2); //0.0125 + 137.5
    }

    static class MathSumOperation {
        static void sum(int a, int b) {
            System.out.println("Метод 1");
            int sum = a + b;
            System.out.println("int sum = int + int равно " + sum + "\n");
        }

        static byte sum(byte a, byte b) {
            byte sum;
            System.out.println("Метод 2");
            System.out.println("срабатывает скрытый автобоксинг из byte в int при сложении");
            sum = (byte) (a + b);
            System.out.println("byte sum = (byte) (a[byte] + b[byte]) равно " + sum + "\n");
            return sum;
        }

        static void sum(long a, long b) {
            System.out.println("Метод 3");
            long sum = a + b;
            System.out.println("long sum = long + long равно " + sum + "\n");
        }

        static void sum(int a, double b) {
            System.out.println("Метод 4");
            int sum = a + (int) b;
            System.out.println("int sum = int + (int)double равно " + sum + "\n");
        }

        static void sum(int a, float b) {
            System.out.println("Метод 5");
            double sum = a + b;
            System.out.println("double sum = int + float равно " + sum + "\n");
        }

        static void sum(double a, double b) {
            System.out.println("Метод 4");
            double sum = a + b;
            System.out.println("double sum = double + double равно " + sum + "\n");
        }

        static void sum(Integer a, Integer b) {
            System.out.println("Метод 6");
            int sum;
            sum = a + b;
            System.out.println("int sum = Integer + Integer равно " + sum + "\n");
        }

        static void sum(Object a, Object b) {
            System.out.println("Метод 7");
            int sum = ((int) a + (int) b);
            System.out.println("int sum = ((int)Object + (int)Object) равно " + sum + "\n");
        }
    }
}
