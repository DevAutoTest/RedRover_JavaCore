package Lesson12_AbstractClass.part1;

public class Manager extends Employee{
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
            return baseSalary;

        } else return this.getBaseSalary() * (1+ ((double) this.subordinates /100 * 3));
    }
}
