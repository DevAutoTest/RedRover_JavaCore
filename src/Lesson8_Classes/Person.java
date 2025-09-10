package Lesson8_Classes;

public class Person {
    /*
    Задача №1
    Необходимо создать класс Person с полями:
    имя, возраст, пол.
    Класс должен иметь метод - getName, метод возвращает имя
    с префиксом “Mr. ” если пол указан как мужской
    и префикс “Mrs. ” если женский
     */

    private String name;
    private int age;
    private Sex sex;

    Person(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName(){
        String result = "";
        if (sex.equals(Sex.FEMALE)) {
            result = "Mrs. " + this.name;
        }
        if (sex.equals(Sex.MALE)) {
            result = "Mr. " + this.name;
        }
        return result;
    }
}
