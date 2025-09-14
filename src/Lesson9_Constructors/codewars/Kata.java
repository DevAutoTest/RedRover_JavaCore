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
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        int damage;
        int health;
        int score;

        int damage2;
        int health2;
        int score2;

        String result = null;

        if (firstAttacker.equals(fighter1.name)) {
            damage = fighter1.damagePerAttack;
            health = fighter2.health;
            score = health - damage;

            damage2 = fighter2.damagePerAttack;
            health2 = fighter1.health;
            score2 = health2 - damage2;

            do {
                System.out.printf("%s attacks %s; %s now has %d health.\n", fighter1.name, fighter2.name, fighter2.name, score);
                health-=damage;
                score = health - damage;
                System.out.printf("%s attacks %s; %s now has %d health.\n", fighter2.name, fighter1.name, fighter1.name, score2);
                health2-=damage2;
                score2 = health2 - damage2;
            }
            while (health - damage >= 0 || health2 - damage2 >= 0);

            if(health - damage < 0 ) {
              result = String.format("%s attacks %s; %s now has %d health and is dead. %s wins.\n", fighter1.name, fighter2.name, fighter2.name, score, fighter1.name);
              return result;
            }
            if(health2 - damage2 < 0) {
               result =  String.format("%s attacks %s; %s now has %d health and is dead. %s wins.\n", fighter2.name, fighter1.name, fighter1.name, score2, fighter2.name);
               return result;
            }

        }
        if (firstAttacker.equals(fighter2.name)) {
            damage = fighter2.damagePerAttack;
            health = fighter1.health;
            score = health - damage;

            damage2 = fighter1.damagePerAttack;
            health2 = fighter2.health;
            score2 = health2 - damage2;

            do {
                System.out.printf("%s attacks %s; %s now has %d health.\n", fighter2.name, fighter1.name, fighter1.name, score);
                health-=damage;
                score = health - damage;
                System.out.printf("%s attacks %s; %s now has %d health.\n", fighter1.name, fighter2.name, fighter2.name, score2);
                health2-=damage2;
                score2 = health2 - damage2;
            }
            while (health - damage >= 0 || health2 - damage2 >= 0);

            if(health - damage < 0 ) {
                result = String.format("%s attacks %s; %s now has %d health and is dead. %s wins.\n", fighter2.name, fighter1.name, fighter1.name, score, fighter2.name);
                return result;
            }
            if(health2 - damage2 < 0) {
                result =  String.format("%s attacks %s; %s now has %d health and is dead. %s wins.\n", fighter1.name, fighter2.name, fighter2.name, score2, fighter1.name);
                return result;
            }

        }
        return null;
    }
}

