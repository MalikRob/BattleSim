package com.company.model;

public class Opponent {

    int enemyHP;
    int enemyARMR;

    public Opponent(int enemyHP, int enemyARMR) {
        this.enemyHP = enemyHP;
        this.enemyARMR = enemyARMR;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemyARMR() {
        return enemyARMR;
    }

    public void setEnemyARMR(int enemyARMR) {
        this.enemyARMR = enemyARMR;
    }

}
