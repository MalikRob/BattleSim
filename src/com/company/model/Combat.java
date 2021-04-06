package com.company.model;

public class Combat {

    Weapon test1;
    Opponent test2;

    public Combat(Weapon test1, Opponent test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public Weapon getTest1() {
        return test1;
    }

    public void setTest1(Weapon test1) {
        this.test1 = test1;
    }

    public Opponent getTest2() {
        return test2;
    }

    public void setTest2(Opponent test2) {
        this.test2 = test2;
    }

    public void simulation(Weapon test1, Opponent test2) {
        int HP = test2.getEnemyHP();
        int AC = test2.getEnemyARMR();

        String wname = test1.getName();
        int bonus = test1.getChanceToHit();

        while (HP > 0) {
            double a = Math.random() * (20 - 1 + 1) + 1;
            int ai = (int) a;

            int attackRoll = bonus + ai;

            if (attackRoll >= AC) {
                HP -= test1.damage;
                System.out.println("You hit.");
            } else {
                System.out.println("You missed.");
            }
        }

        //System.out.printf(String.valueOf(attackRoll));
        System.out.println("\nCongratulations, you win!");
        System.exit(0);
    }
}
