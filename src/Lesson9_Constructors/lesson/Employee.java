package Lesson9_Constructors.lesson;

/**
 * Задача №2
 *
 * Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
 * Класс должен иметь метод isSameName(Employee employee) который возвращает true,
 * если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
 */
public class Employee extends Person{
    private double salary;

    public Employee(String name, int age, Sex sex, double salary){
        super(name, age, sex);
        this.salary = salary;
    }
    public boolean isSameName(Employee employee){
        return employee.getName().equals(this.getName());
    }

    public double getSalary(){
        return this.salary;
    }
}
