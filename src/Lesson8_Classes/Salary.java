package Lesson8_Classes;

public class Salary {
    /*
    Задача №3
    Необходимо создать класс Salary с единственным статическим методом - getSum(Employee[] employeeArray),
    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
    */

    public static double getSum(Employee[] employeeArray) {
        double salarySum = 0;
        for (Employee e : employeeArray) {
            salarySum += e.getMonthSalary();
        }
        return salarySum;
    }
}
