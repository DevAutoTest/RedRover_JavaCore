package Lesson9_Constructors.codewars;

/**
 * declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
 * <p>
 * Lew attacks Harry; Harry now has 3 health.
 * Harry attacks Lew; Lew now has 6 health.
 * Lew attacks Harry; Harry now has 1 health.
 * Harry attacks Lew; Lew now has 2 health.
 * Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
 */
public class Kata {
    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        System.out.println("\n");
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));

        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attaker = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
        Fighter defender = attaker == fighter1 ? fighter2 : fighter1;
        String result = "";

        do {
            defender.health -= attaker.damagePerAttack;
            if (defender.health <= 0) {
                //System.out.printf("%s attacks %s; %s now has %d health and is dead. %s wins.\n", attaker.name, defender.name, defender.name, defender.health, attaker.name);
                result = attaker.name;
                break;
            }
            //System.out.printf("%s attacks %s; %s now has %d health.\n", attaker.name, defender.name, defender.name, defender.health);

            Fighter temp = attaker;
            attaker = defender;
            defender = temp;
        }
        while (defender.health > 0);

        return result;
    }
}

