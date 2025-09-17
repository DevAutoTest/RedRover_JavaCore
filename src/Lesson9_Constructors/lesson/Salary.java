package Lesson9_Constructors.lesson;

/**
 * Задача №3
 *
 * Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
 * метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
 */

public class Salary {
    public double getSum(Employee[] employeeArray){
        double allSalary = 0.0;
        for(Employee empl: employeeArray){
            allSalary+=empl.getSalary();
        }
        return allSalary;
    }
}
