package Lesson9_Constructors.lesson2;

/**
 * Задача №1
 * Необходимо создать класс Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * setBaseSalary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */
public class Employee {
    private String name;
    private double baseSalary;
    private double salary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public double getSalary() {
      return this.baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
