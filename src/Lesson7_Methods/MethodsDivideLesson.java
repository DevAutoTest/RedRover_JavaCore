package Lesson7_Methods;

public class MethodsDivideLesson {
    public static void main(String[] args) {
        //1
        MathDivideOperation.divide(5,3); //1 = 1, остаток от деления отбрасывается
        //2
        MathDivideOperation.divide(5d,3d);
        //3
        MathDivideOperation.divide(5.0,3); // в случае если divide(double, int) не будет, то произойдет расширение типа к методу divide(double, double)
        //4
        MathDivideOperation.divide(5.0,0); // Infinity
        //5
       // MathDivideOperation.divide(5,0); //Exception!
        //5
        MathDivideOperation.divide(0.0,0.0); //NaN
        //6
        MathDivideOperation.divide(-5.0,0); // -Infinity
    }

    static class MathDivideOperation {
        static void divide(int a , int b){
            System.out.println("Метод 1");
            int result = a / b;
            System.out.println("int result = int a / int b равно " + result + "\n");
        }
        static void divide(double a , double b){
            System.out.println("Метод 2");
            double result = a / b;
            System.out.println("Double result = double a / double b равно " + result + "\n");
        }
        static void divide(double a , int b){
            System.out.println("Метод 3");
            double result = a / b;
            System.out.println("double result = double a / int b равно " + result + "\n");
        }

    }

}
