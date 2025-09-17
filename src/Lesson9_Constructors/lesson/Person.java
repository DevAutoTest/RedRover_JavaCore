package Lesson9_Constructors.lesson;

import java.util.Objects;

/**
 * Задача №1
 * Необходимо создать класс Person с полями: имя, возраст, пол.
 * Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr.
 * ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */
public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getPrefixName() {
        if (Objects.requireNonNull(this.sex) == Sex.MALE) {
            return "Mr. " + this.name;
        } else return "Mrs. " + this.name;
    }

    public String getName() {
        return this.name;
    }


}
