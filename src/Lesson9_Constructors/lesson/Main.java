package Lesson9_Constructors.lesson;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alexandra", 40, Sex.FEMALE);
        Person p2 = new Person("Alex", 25, Sex.MALE);
        System.out.println(p1.getPrefixName());
        System.out.println(p2.getPrefixName());

        Employee empl1 = new Employee("Alexandra", 40, Sex.FEMALE, 1250.56);
        Employee empl2 = new Employee("Alex", 25, Sex.MALE, 950.91);
        Employee empl3 = new Employee("Alexey", 45, Sex.MALE, 4500.99);

        Employee[] allEmpl = new Employee[3];
        allEmpl[0] = empl1;
        allEmpl[1] = empl2;
        allEmpl[2] = empl3;

        double sum = new Salary().getSum(allEmpl);
        double rounded = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(rounded);

    }
}
