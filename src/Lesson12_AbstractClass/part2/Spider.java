package Lesson12_AbstractClass.part2;

public class Spider extends More6Legs{
    @Override
    public String hasMore6legs() {
        return "Я паук и у меня 8 ног";
    }

    @Override
    public String hasLegs() {
        return "Я паук и у меня ноги";
    }

    @Override
    public String hasNoVertebralColumn() {
        return "Я без позвоночный паук";
    }

    @Override
    public String hasCells() {
        return "я паук и состою из клеток";
    }
}
