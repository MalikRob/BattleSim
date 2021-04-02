package com.company;

import com.company.model.Combat;
import com.company.model.Opponent;
import com.company.model.Weapon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Call Methods & Menu display

        int wChoice;
        int oChoice;

        String swChoice = null;
        String soChoice = null;

        Weapon implement = new Weapon(null, null, 0);
        Opponent enemy = new Opponent(0,0);
        Combat letsDance = new Combat(implement, enemy);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("============================================");
        System.out.println("Welcome to Battle Simulator! (Made by Blonk)");
        System.out.println("============================================");

        System.out.println("Choose your weapon!");

        System.out.println("1) Sword");
        System.out.println("2) Spear");
        System.out.println("3) Mace");
        wChoice = myObj.nextInt();

        System.out.println("Choose your opponent!");
        System.out.println("1) Zombie");
        System.out.println("2) Skeleton");
        System.out.println("3) Beast");
        oChoice = myObj.nextInt();

        switch (wChoice) {
            case 1:
                swChoice = "Sword";

                implement.setName("Sword");
                implement.setImage("      /| ________________\n" +
                        "O|===|* >________________>\n" +
                        "      \\|");
                implement.setChanceToHit(10);
                break;
            case 2:
                swChoice = "Spear";

                implement.setName("Spear");
                implement.setImage("---------------\\n" +
                        "_______________/\n");
                implement.setChanceToHit(20);
                break;
            case 3:
                swChoice = "Mace";

                implement.setName("Mace");
                implement.setImage("               <<()>>\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "                )__(\n" +
                        "               _)__(_\n" +
                        "             .'      `.\n" +
                        "             | <   >  |>\n" +
                        "            <|   <   >|\n" +
                        "              `.____.'\n" +
                        "                V  V");
                implement.setChanceToHit(30);
                break;

            default:
                System.out.println("Invalid Choice.");
                System.exit(0);
        }

        switch (oChoice) {
            case 1:
                soChoice = "Zombie";
                enemy.setEnemyHP(120);
                enemy.setEnemyARMR(40);
                break;
            case 2:
                soChoice = "Skeleton";
                enemy.setEnemyHP(50);
                enemy.setEnemyARMR(60);
                break;
            case 3:
                soChoice = "Beast";
                enemy.setEnemyHP(100);
                enemy.setEnemyARMR(50);
                break;

            default:
                System.out.println("Invalid Choice.");
                System.exit(0);
        }

//        System.out.println("Weapon: \n" + implement.getImage() + "\nOpponent: \n" + soChoice + " " + enemy.getEnemyHP()
//                + " HP and " + enemy.getEnemyARMR() + " AC");

        letsDance.simulation(implement, enemy);


    }
}
