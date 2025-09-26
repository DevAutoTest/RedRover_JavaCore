package Lesson12_AbstractClass.part2;

public class Elephant extends Mammals{
    @Override
    public String canBreastfeed() {
        return "Я слон и могу кормить молоком";
    }

    @Override
    public String hasWarmBlood() {
        return "Я слон и имею теплую кровь";
    }

    @Override
    public String hasVertebralColumn() {
        return "Я слон и имею позвоночный столб";
    }

    @Override
    public String hasCells() {
        return "Я слон и состою из клеток";
    }
}
