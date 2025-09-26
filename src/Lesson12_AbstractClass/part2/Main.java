package Lesson12_AbstractClass.part2;

public class Main {
    public static void main(String[] args) {
        Animal warm = new Earthworm();
        System.out.println(warm.hasCells());
        System.out.println(warm.sendMessage());
    }
}
