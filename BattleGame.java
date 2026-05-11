import java.util.Random;
import java.util.Scanner;

public class BattleGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int playerHP = 100;
        int enemyHP = 100;

        System.out.println("=== BATTLE SIMULATOR ===");

        while(playerHP > 0 && enemyHP > 0) {

            System.out.println("\nYour HP: " + playerHP);
            System.out.println("Enemy HP: " + enemyHP);

            System.out.println("\nChoose action:");
            System.out.println("1. Attack");
            System.out.println("2. Heal");

            String choice = sc.nextLine();

            // PLAYER TURN
            if(choice.equals("1")) {

                int damage = random.nextInt(16) + 10;
                enemyHP -= damage;

                System.out.println("\nYou attacked the enemy for " + damage + " damage!");

            }
            else if(choice.equals("2")) {

                int heal = random.nextInt(13) + 8;
                playerHP += heal;

                if(playerHP > 100) {
                    playerHP = 100;
                }

                System.out.println("\nYou healed for " + heal + " HP!");
            }
            else {
                System.out.println("\nInvalid choice!");
                continue;
            }

            // ENEMY TURN
            if(enemyHP > 0) {

                int enemyDamage = random.nextInt(14) + 5;
                playerHP -= enemyDamage;

                System.out.println("Enemy attacked you for " + enemyDamage + " damage!");
            }
        }

        // GAME RESULT
        System.out.println("\n=== GAME OVER ===");

        if(playerHP > 0) {
            System.out.println("You won!");
        }
        else {
            System.out.println("Enemy won!");
        }

        sc.close();
    }    
}