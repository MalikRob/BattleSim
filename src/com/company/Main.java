package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Call Methods & Menu display

        int wChoice = 0;
        int oChoice = 0;
        int nChoice = 100;

        String swChoice = null;
        String soChoice = null;

        Weapon implement = null;
        Opponent enemy = new Opponent(0,0);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        while (nChoice != 0) {
            System.out.println("\n============================================");
            System.out.println("Welcome to Battle Simulator! (Made by Malik)");
            System.out.println("============================================");

            System.out.println("\n1)Choose a weapon.");
            System.out.println("2)Choose an opponent.");
            System.out.println("3)Battle.");
            System.out.println("0)Exit");
            nChoice = myObj.nextInt();

            if (nChoice == 1) {
                System.out.println("\n1) Dagger");
                System.out.println("2) Long Sword");
                System.out.println("3) Greatsword");
                wChoice = myObj.nextInt();

                switch (wChoice) {
                    case 1:
                        implement = new Dagger();
                        break;
                    case 2:
                        implement = new LongSword();
                        break;
                    case 3:
                        implement = new Greatsword();
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                        System.exit(0);
                }
            } else if (nChoice == 2) {
                System.out.println("\n1) Zombie");
                System.out.println("2) Skeleton");
                System.out.println("3) Beast");
                oChoice = myObj.nextInt();

                switch (oChoice) {
                    case 1:
                        soChoice = "Zombie";
                        enemy.setEnemyHP(22);
                        enemy.setEnemyARMR(10);
                        break;
                    case 2:
                        soChoice = "Skeleton";
                        enemy.setEnemyHP(13);
                        enemy.setEnemyARMR(13);
                        break;
                    case 3:
                        soChoice = "Beast";
                        enemy.setEnemyHP(37);
                        enemy.setEnemyARMR(14);
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                        System.exit(0);
                }
            } else if (nChoice == 3) {

                Combat letsDance = new Combat(implement, enemy);
                letsDance.simulation(implement, enemy);
            } else if (nChoice == 0) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid Choice");
                System.exit(0);
            }
        }

    }
}
