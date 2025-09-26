package Lesson12_AbstractClass.part1;

/*
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month)
 */
public class MonthUtils {
    private MonthUtils(){}
    public static final Month JAN = new Month("January",   31, 23);
    public static final Month FEB = new Month("February",  28, 20);
    public static final Month MAR = new Month("March",     31, 21);
    public static final Month APR = new Month("April",     30, 22);
    public static final Month MAY = new Month("May",       31, 23);
    public static final Month JUN = new Month("June",      30, 20);
    public static final Month JUL = new Month("July",      31, 23);
    public static final Month AUG = new Month("August",    31, 22);
    public static final Month SEP = new Month("September", 30, 21);
    public static final Month OCT = new Month("October",   31, 23);
    public static final Month NOV = new Month("November",  30, 20);
    public static final Month DEC = new Month("December",  31, 22);

    public static final Month[] YEAR = {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    public static final Month[] Q1 = { JAN, FEB, MAR };
    public static final Month[] Q2 = { APR, MAY, JUN };
    public static final Month[] Q3 = { JUL, AUG, SEP };
    public static final Month[] Q4 = { OCT, NOV, DEC };
}
