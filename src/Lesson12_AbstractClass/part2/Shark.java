package Lesson12_AbstractClass.part2;

public class Shark extends Fishes {

    @Override
    public String haveFlippers() {
        return "Я акула ии мею плавники";
    }

    @Override
    public String hasNoWarmBlood() {
        return "Я акула и имею теплую кровь";
    }

    @Override
    public String hasVertebralColumn() {
        return "Я акула и имею позвоночник";
    }

    @Override
    public String hasCells() {
        return "Я акула и состою из клеток";
    }
}
