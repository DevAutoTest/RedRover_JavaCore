package Lesson12_AbstractClass.part2;

public class Leech extends WithoutLegs{

    @Override
    public String hasNoLegs() {
        return "Я пиявка без ног";
    }

    @Override
    public String hasNoVertebralColumn() {
        return "Я пиявка без позвоночника";
    }

    @Override
    public String hasCells() {
        return "Я пиявка и состою из клеток";
    }
}
