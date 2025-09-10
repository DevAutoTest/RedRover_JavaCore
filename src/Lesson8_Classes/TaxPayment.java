package Lesson8_Classes;

import java.util.ArrayList;
import java.util.List;

public class TaxPayment {
     /*
    Задача №2
    Создать класс Employee , в котором хранится информация о сотруднике предприятия:
    -имя, месячная зарплата, количество детей.
    Создать класс TaxPayment, в котором будет храниться
    -имя сотрудника, и сумма подоходного налога, который он должен будет заплатить.
    Создать статический метод метод,
    -который получит массив сотрудников, и вернет (или распечатает, но лучше, если вернет) массив налоговых выплат (TaxPayment)
     по следующему правилу:
        Если зарплата больше 10000, то налоговая ставка 23%
        Если зарплата от 5000 до 10000, то налог составляет 18%
        Если зарплата меньше 5000, то налог составляет 13%
        За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся суммы.
    */
    String name;
    double employeeTaxPayment;

    TaxPayment(Employee employee, double employeeTaxPayment){
        this.name = employee.getName();
        this.employeeTaxPayment = employeeTaxPayment;
    }

    public String toString(){
       return this.name + ": " + this.employeeTaxPayment;
    }

    public static List<TaxPayment> calculateEmployeeTaxPayment(List<Employee> e){
        List<TaxPayment> result = new ArrayList<>();
       for(Employee worker: e) {
           double salary = worker.getMonthSalary();
           double employeeTax;
           if (worker.getOffspring() != 0) {
                salary = calculateSalaryAfterChildren(worker);
           }
           if(salary > 10_000){
               employeeTax = salary * 0.23;
               result.add(new TaxPayment(worker,employeeTax));
           }
           if (salary > 5_000 && salary <= 10_000){
               employeeTax = salary * 0.18;
               result.add(new TaxPayment(worker,employeeTax));
           }
           if(salary <= 5_000) {
               employeeTax = salary * 0.13;
               result.add(new TaxPayment(worker,employeeTax));
           }
       }

        return result;
    }

    private static double calculateSalaryAfterChildren(Employee empl){
        double salary = empl.getMonthSalary() ;
        for (int i = 1; i <= empl.getOffspring(); i++) {
            salary -= 1000;
        }
        return salary;
    }
}
