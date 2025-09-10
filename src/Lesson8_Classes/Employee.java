package Lesson8_Classes;

public class Employee {
    /*
    Задача №2
    Создать класс Employee , в котором хранится информация о сотруднике предприятия:
    -имя, месячная зарплата, количество детей.
    Создать класс TaxPayment, в котором будет храниться
    -имя сотрудника, и сумма подоходного налога, который он должен будет заплатить.
    Создать статический метод метод,
    -который получит массив сотрудников, и вернет (или распечатает, но лучше, если вернет) массив налоговых выплат (TaxPayment) по следующему правилу:
        Если зарплата больше 10000, то налоговая ставка 23%
        Если зарплата от 5000 до 10000, то налог составляет 18%
        Если зарплата меньше 5000, то налог составляет 13%
        За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся суммы.
    */
    private String name;
    private double monthSalary;
    private int offspring;

    Employee(String name, double monthSalary, int offspring){
        this.name = name;
        this.monthSalary = monthSalary;
        this.offspring = offspring;
    }

    public String getName(){
        return this.name;
    }

    public double getMonthSalary(){
        return this.monthSalary;
    }

    public int getOffspring(){
        return this.offspring;
    }

}
