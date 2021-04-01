package com.company.model;

public class Weapon {
    String name;
    String image;
    int chanceToHit;

    public Weapon(String name, String image, int chanceToHit) {
        this.name = name;
        this.image = image;
        this.chanceToHit = chanceToHit;
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


}
