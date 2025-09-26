package Lesson12_AbstractClass.part1;
/*
Создать неизменяемый (immutable) класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
Поля должны быть спрятаны, для каждого поля создать getter.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
 */
public final class Month {
    private String month;
    private int days;
    private int workingDays;

    public Month(String month, int days, int workingDays){
        if (month == null || month.isBlank()) {
            throw new IllegalArgumentException("month must not be blank");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("days must be > 0");
        }
        if (workingDays < 0 || workingDays > days) {
            throw new IllegalArgumentException("workingDays out of range");
        }
        this.month = month;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getMonth(){
        return this.month;
    }

    public int getDays() {
        return this.days;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}
