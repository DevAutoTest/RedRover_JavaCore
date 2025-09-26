package Lesson12_AbstractClass.part1;

/*
Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees, Month[] months),
который подсчитает общую сумму к выплате на всех сотрудников — простых работников, менеджеров и директоров.
 */
public class SalaryUtils {
    private SalaryUtils() {}

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double salaryWorkingDays = 0.0;
        for (Employee e : employees) {
            for (Month m : months) {
                salaryWorkingDays += e.getSalary() * m.getWorkingDays();
            }
        }
        return salaryWorkingDays;
    }
}
