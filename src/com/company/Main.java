package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Call Methods & Menu display

        int wChoice;
        int oChoice;

        String swChoice = null;
        String soChoice = null;

        Weapon implement = null;
        Opponent enemy = new Opponent(0,0);

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

        Combat letsDance = new Combat(implement, enemy);
        letsDance.simulation(implement, enemy);

    }
}
