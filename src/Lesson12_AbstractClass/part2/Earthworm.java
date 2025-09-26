package Lesson12_AbstractClass.part2;

public class Earthworm extends  Worms{

    @Override
    public String looksSlimy() {
        return "Я склизкий червь";
    }

    @Override
    public String hasNoLegs() {
        return "Я червь, у которого нет ног";
    }

    @Override
    public String hasNoVertebralColumn() {
        return "Я червь, у которого нет позвоночника";
    }

    @Override
    public String hasCells() {
        return "Я червь и состою из клеток, как все животные";
    }
    @Override
    public String sendMessage() {
        return "послание из класса Earthworm";
    }

}
