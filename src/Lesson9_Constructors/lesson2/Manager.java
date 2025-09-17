package Lesson9_Constructors.lesson2;

/**
 * * Необходимо создать класс Manager в который нужно добавить следующие методы:
 *  * getNumberOfSubordinates - получить количество подчиненных
 *  * setNumberOfSubordinates
 *  *
 *  * в классе, метод getSalary будет возвращать значение по формуле
 *  * - <базовая ставка> * (<количество подчиненных> / 100 * 3).
 *  Если количество подчиненных 0, то результат как у обычного рабочего.
 */
public class Manager extends Employee {
    private int subordinates;

    public Manager(String name, double baseSalary, int subordinates){
        super(name, baseSalary);
        this.subordinates = subordinates;
    }
    public int getNumberOfSubordinates(){
        return this.subordinates;
    }
    public void setNumberOfSubordinates(int subordinates){
        this.subordinates = Math.max(0,subordinates);
    }

    @Override
    public double getSalary(){
        if(subordinates==0){
            return super.getSalary();
        } else return this.getBaseSalary() * (1+ ((double) this.subordinates /100 * 3));
    }

    @Override
    public String getName(){
       return super.getName();
    }
}
