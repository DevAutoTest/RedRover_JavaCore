package Lesson10_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee w1 = new Worker(" Bien Alice", 2000);
        Employee w2 = new Worker("Alice", 999);
        Employee w3 = new Worker("Alex Alex", 2500);
        Employee w4 = new Worker("Max Trumb", 1500);
        Employee w5 = new Worker("Max Pox", 1000);
        Employee w6 = new Worker(" Vox Alice", 7777);
        Manager m1 = new Manager("Bob Dilan", 5, 10); // 6.5
        Manager m2 = new Manager("Elena Star", 2500, 1); // 2575
        Manager m3 = new Manager("Alex Bol", 4500, 5); // 5175

        Director d1 = new Director("Pedro Shanzesh", 3000, 0); //3000

        Employee[] staff = {w1, w2, w3, w4, w6, m1, m2, m3, d1, w5};

        System.out.println((Utils.findEmployeeByName(staff, "Alice")));
        System.out.println((Utils.findEmployeeBySubName(staff, "Alice")));
        System.out.println(Utils.salaryFond(staff));
        System.out.println(Utils.minSalary(staff));
        System.out.println(Utils.maxSalary(staff));
        System.out.println(Utils.maxCountManagerSubordinates(staff));
        System.out.println(Utils.minCountManagerSubordinates(staff));
        System.out.println(Utils.maxBonusPerManager(staff));
        System.out.println(Utils.minBonusPerManager(staff));
    }
}
