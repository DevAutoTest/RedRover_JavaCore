package Lesson9_Constructors.lesson2;

/**
 * Задача №3
 * Необходимо создать утилитарный класс со следующими методами:
 * - поиск сотрудника в массиве по его имени
 * - поиск сотрудника в массиве по вхождению указанной строки в его имени
 *
 * подсчет зарплатного бюджета для всех сотрудников в массиве
 * поиск наименьшей зарплаты в массиве
 * поиск наибольшей зарплаты в массиве
 *
 * поиск наименьшего количества подчиненных в массиве менеджеров
 * поиск наибольшего количества подчиненных в массиве менеджеров
 *
 * поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
 * поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
 */

public class Utils {
    public static int findEmployeeByName(Employee[] emplArr, String targetName) {
        int count = 0;

        for (Employee empl : emplArr) {
            if (empl.getName().equals(targetName)) {
                count++;
            }
        }
        return count;
    }

    public static int findEmployeeBySubName(Employee[] emplArr, String targetName) {
        int count = 0;

        for (Employee empl : emplArr) {
            if (empl.getName().contains(targetName)) {
                count++;
            }
        }
        return count;
    }

    public static double salaryFond(Employee[] emplArr) {
        double result = 0d;

        for (Employee empl : emplArr) {
            result += empl.getSalary();
        }
        return result;
    }

    public static double minSalary(Employee[] emplArray) {
        double result = Double.MAX_VALUE;
        for (Employee empl : emplArray) {
            if (empl.getSalary() < result) {
                result = empl.getSalary();
            }
        }
        return result;
    }

    public static double maxSalary(Employee[] emplArray) {
        double result = Double.MIN_VALUE;
        for (Employee empl : emplArray) {
            if (empl.getSalary() > result) {
                result = empl.getSalary();
            }
        }
        return result;
    }

    public static int maxCountManagerSubordinates(Employee[] emplArray) {
        int maxCountSubordinatesPerManager = Integer.MIN_VALUE;
        for (Employee empl : emplArray) {
            if (empl instanceof Manager) {
                if (((Manager) empl).getNumberOfSubordinates() > maxCountSubordinatesPerManager) {
                    maxCountSubordinatesPerManager = ((Manager) empl).getNumberOfSubordinates();
                }
                ;
            }
        }
        return maxCountSubordinatesPerManager;
    }

    public static int minCountManagerSubordinates(Employee[] emplArray) {
        int minCountSubordinatesPerManager = Integer.MAX_VALUE;
        for (Employee empl : emplArray) {
            if (empl instanceof Manager) {
                if (((Manager) empl).getNumberOfSubordinates() < minCountSubordinatesPerManager) {
                    minCountSubordinatesPerManager = ((Manager) empl).getNumberOfSubordinates();
                }
                ;
            }
        }
        return minCountSubordinatesPerManager;
    }

    public static double maxBonusPerManager(Employee[] emplArray) {
        double maxBonus = Double.MIN_VALUE;
        for (Employee empl : emplArray) {
            if (empl instanceof Manager) {
                if ((empl.getSalary() - empl.getBaseSalary()) > maxBonus) {
                    maxBonus = empl.getSalary() - empl.getBaseSalary();
                }
                ;
            }
        }
        return maxBonus;
    }

    public static double minBonusPerManager(Employee[] emplArray) {
        double minBonus = Double.MAX_VALUE;
        for (Employee empl : emplArray) {
            if (empl instanceof Manager) {
                if ((empl.getSalary() - empl.getBaseSalary()) < minBonus) {
                    minBonus = empl.getSalary() - empl.getBaseSalary();
                }
                ;
            }
        }
        return minBonus;
    }
}
