package Lesson12_AbstractClass.part2;

public class Shrimp extends More6Legs {
    @Override
    public String hasMore6legs() {
        return "Я креветка и у меня много ног";
    }

    @Override
    public String hasLegs() {
        return "Я креветка и у меня есть ноги";
    }

    @Override
    public String hasNoVertebralColumn() {
        return "Я без позвоночная креветка";
    }

    @Override
    public String hasCells() {
        return "Я креветка и состою из клеток";
    }
}
