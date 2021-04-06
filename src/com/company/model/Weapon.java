package com.company.model;

public class Weapon {
    String name;
    String image;
    int chanceToHit;
    int damage;

    public Weapon(String name, String image, int chanceToHit, int damage) {
        this.name = name;
        this.image = image;
        this.chanceToHit = chanceToHit;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getChanceToHit() {
        return chanceToHit;
    }

    public void setChanceToHit(int chanceToHit) {
        this.chanceToHit = chanceToHit;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
