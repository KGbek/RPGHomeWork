package com.company;

public class GameEntity {
    int health;
    int damage;
    String defenseType;
    int superAbility;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public int getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(int superAbility) {
        this.superAbility = superAbility;
    }
}
