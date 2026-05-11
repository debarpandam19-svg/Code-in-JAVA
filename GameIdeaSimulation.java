import java.util.Scanner;
import java.util.Random;

public class GameIdeaSimulation {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int level = 1;
        int growth = 0;
        int HP = 100;
        int enemyHP = 50;

        System.out.println("=== GAME START ===");
        while (level<=3){    
        System.out.println("Press 1 to shoot ");
        int choice = sc.nextInt();
        if (choice == 1) {
            int damage = rand.nextInt(21) + growth;
            enemyHP -= damage;
            int enemyDamage = rand.nextInt(11) + (growth*2);
            HP -= enemyDamage;
            System.out.println("Enemy HP: " + enemyHP);
            System.out.println("Your HP: " + HP);

            
            if (enemyHP <= 0) {

                System.out.println("\nEnemy defeated!");

                
                level = level + 1;
                growth = growth + 3;
                enemyHP = 50 + (level - 1) * 20;

                System.out.println("Level up! \nCurrent level: " + level);
                    
                
            }
            if (HP <= 0) {
                System.out.println("\nYou have been defeated! Game Over.");
                return;
            }
        }
    }
    System.out.println("\nMax level reached");
        sc.close();
    }

}