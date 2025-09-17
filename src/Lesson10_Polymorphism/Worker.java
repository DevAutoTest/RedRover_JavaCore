package Lesson10_Polymorphism;

/**
 * Задача №2
 * Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
 */

public class Worker extends Employee{
    public Worker(String name, double baseSalary){
       super(name, baseSalary);
    }

    @Override
    public double getSalary(){
        return super.getBaseSalary();
    }

    @Override
    public String getName(){
        return super.getName();
    }
}
