package com.company.model;

/**
 * @author malik
 *
 * This class will get, set, and provide a default constructor for the Weapon and Opponent instances given to the class.
 * Along with simulating combat based on the attibutes of instances used.
 *
 * @version 1.0
 * @since 04/13/2021
 */
public class Combat {

    Weapon test1;
    Opponent test2;

    /**
     * This method is the constructor, can be called to fill in the data fields of an instance of Combat.
     * @param test1
     * @param test2
     */
    public Combat(Weapon test1, Opponent test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    /**
     * This method returns the instance of Weapon inside the Combat instance.
     * @return Outputs the value at the method call.
     */
    public Weapon getTest1() {
        return test1;
    }

    /**
     * This method sets the instance of Weapon that Combat will be using.
     * @param test1 Needs to be an instance of the Weapon class.
     */
    public void setTest1(Weapon test1) {
        this.test1 = test1;
    }

    /**
     * This method returns the instance of Opponent inside the Combat instance.
     * @return Outputs the value at the method call.
     */
    public Opponent getTest2() {
        return test2;
    }

    /**
     * This method sets the instance of Opponent that Combat will be using.
     * @param test2 Needs to be an instance of the Opponent class.
     */
    public void setTest2(Opponent test2) {
        this.test2 = test2;
    }

    /**
     * This method simulates the combat scenario by loading enemy HP, ARMR, and weapon bonus to hit into variables. And
     * then creating a while loop where a random number is rolled (between 1 and 20) and adds the weapon bonus to it. If
     * the final number equal to, or larger, than the Opponent instance's ARMR value, then they hit and do the flat
     * [damage] value that the Opponent instance has.
     *
     * Upon hitting or missing, a message is displayed. Each hit subtracts that flat damage from the Opponent instance's
     * HP until it hits 0, upon which a victory message is displayed.
     *
     * @param test1 Needs to be an instance of the Weapon class.
     * @param test2 Needs to be an instance of the Opponent class.
     */
    public void simulation(Weapon test1, Opponent test2) {
        int HP = test2.getEnemyHP();
        int AC = test2.getEnemyARMR();

        int bonus = test1.getChanceToHit();

        while (HP > 0) {
            double a = Math.random() * (20 - 1 + 1) + 1;

            //Convert the original random number into a whole, int number.
            int ai = (int) a;

            int attackRoll = bonus + ai;

            if (attackRoll >= AC) {
                HP -= test1.damage;
                System.out.println("You hit.");
            } else {
                System.out.println("You missed.");
            }
        }
        System.out.println("\nCongratulations, you win!");
    }
}
