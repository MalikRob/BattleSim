package com.company.model;

/**
 * @author malik
 *
 * This class will get, set, and provide a default constructor for all aspects of the choosen weapon.
 *
 * @version 1.0
 * @since 04/13/2021
 */
public class Weapon {
    String name;
    String image;
    int chanceToHit;
    int damage;

    /**
     * This method is the constructor, can be called to fill in the data fields of an instance of GameItem.
     * @param name For the name of the weapon.
     * @param image A visual, ASCII image of the weapon.
     * @param chanceToHit The weapon's flat attack bonus that's added to the D20 roll.
     * @param damage The flat damage the weapon does, if it hits.
     */
    public Weapon(String name, String image, int chanceToHit, int damage) {
        this.name = name;
        this.image = image;
        this.chanceToHit = chanceToHit;
        this.damage = damage;
    }

    /**
     * This method returns the String name of the weapon.
     * @return Outputs the value at the method call.
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of a weapon.
     * @param name Should be the name of a weapon as a String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the ASCII image of the weapon.
     * @return Outputs the value at the method call.
     */
    public String getImage() {
        return image;
    }

    /**
     * This method sets the ASCII image of a weapon.
     * @param image Should be the ASCII image of a weapon as a String.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method returns a weapons' chance to hit.
     * @return Outputs the value at the method call.
     */
    public int getChanceToHit() {
        return chanceToHit;
    }

    /**
     * This method sets a weapon's chance to hit.
     * @param chanceToHit Should be the chance to hit as an int value.
     */
    public void setChanceToHit(int chanceToHit) {
        this.chanceToHit = chanceToHit;
    }

    /**
     * This method returns a weapons' damage upon hit.
     * @return Outputs the value at the method call.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * This method sets a weapons' damage upon hit.
     * @param damage Should be the damage of a weapon as an int value.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
