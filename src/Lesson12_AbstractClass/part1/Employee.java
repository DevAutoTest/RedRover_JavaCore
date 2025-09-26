package Lesson12_AbstractClass.part1;

public abstract class Employee {
    String name;
    double baseSalary;
    private double salary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    };

    public abstract double getSalary();

    public String getName(){
        return this.name;
    }
}
