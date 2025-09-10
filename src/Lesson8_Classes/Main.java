package Lesson8_Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 35, Sex.MALE);
        System.out.println(person1.getName());
        Person person2 = new Person("Alexandra", 35, Sex.FEMALE);
        System.out.println(person2.getName());

        Employee empl1 = new Employee("Olga", 5_000, 1);
        Employee empl2 = new Employee("Max", 15_000, 2);
        Employee empl3 = new Employee("Evgen", 4_000, 0);
        Employee empl4 = new Employee("Juan", 7_500, 4);
        Employee empl5 = new Employee("Viktor", 4_500, 3);

        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(empl1);
        listEmployee.add(empl2);
        listEmployee.add(empl3);
        listEmployee.add(empl4);
        listEmployee.add(empl5);

        List<TaxPayment> tax = TaxPayment.calculateEmployeeTaxPayment(listEmployee);
        System.out.println(tax.toString());

        Employee[] e = new Employee[5];
        e[0] = empl1;
        e[1] = empl2;
        e[2] = empl3;
        e[3] = empl4;
        e[4] = empl5;

        System.out.println("сумма зарплат всех сотрудников = : " + Salary.getSum(e));

        System.out.println(Utils.converterFromIntToString(458));
    }
}
