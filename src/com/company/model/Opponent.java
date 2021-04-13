package com.company.model;

/**
 * @author malik
 *
 * This class will get, set, and provide a default constructor for all aspects of the choosen opponent.
 *
 * @version 1.0
 * @since 04/13/2021
 */
public class Opponent {

    int enemyHP;
    int enemyARMR;

    /**
     * This method is the constructor, can be called to fill in the data fields of an instance of Opponent.
     * @param enemyHP
     * @param enemyARMR
     */
    public Opponent(int enemyHP, int enemyARMR) {
        this.enemyHP = enemyHP;
        this.enemyARMR = enemyARMR;
    }

    /**
     * This method returns the hit points(HP) of the opponent.
     * @return Outputs the value at the method call.
     */
    public int getEnemyHP() {
        return enemyHP;
    }

    /**
     * This method sets the maximum number of hit points for the opponent.
     * @param enemyHP Should be the maximum hit points as an int.
     */
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    /**
     * This method returns the number that must be met, or exceeded, for a weapon to hit the opponent. (AC)
     * @return Outputs the value at the method call.
     */
    public int getEnemyARMR() {
        return enemyARMR;
    }

    /**
     * This method sets the AC of an opponent.
     * @param enemyARMR Should be the AC of the opponent as an int.
     */
    public void setEnemyARMR(int enemyARMR) {
        this.enemyARMR = enemyARMR;
    }

}
