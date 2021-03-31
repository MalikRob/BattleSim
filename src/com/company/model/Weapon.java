package com.company.model;

public class Weapon {
    String image;
    int chanceToHit;

    public Weapon(String image, int chanceToHit) {
        this.image = image;
        this.chanceToHit = chanceToHit;
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
