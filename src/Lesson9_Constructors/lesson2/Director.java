package Lesson9_Constructors.lesson2;

/**
 *  * Необходимо создать класс Director с теми же методами,
 *  * что и Manager, но метод getSalary должен возвращать результат по формуле
 *  * - <базовая ставка> * (<количество подчиненных> / 100 * 9).
 *  * Если количество подчиненных 0, то результат как у обычного рабочего.
 */
public class Director extends  Employee{
    private int subordinates;

    public Director(String name, double baseSalary, int subordinates){
        super(name, baseSalary);
        this.subordinates = Math.max(0,subordinates);
    }
    public int getNumberOfSubordinates(){
        return this.subordinates;
    }
    public void setNumberOfSubordinates(int subordinates){
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary(){
        if(subordinates==0){
            return super.getSalary();
        } else return this.getBaseSalary() * (1 + ((double) this.subordinates /100 * 9));
    }

    @Override
    public String getName(){
        return super.getName();
    }
}
