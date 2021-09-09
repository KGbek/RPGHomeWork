package com.company;

public class Weapon {

    private String gunType;
    private String gunName;


    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "gunType='" + gunType + '\'' +
                ", gunName='" + gunName + '\'' +
                '}';
    }

    //    public Weapon(String gunType, String gunName) {
//        this.gunType = gunType;
//        this.gunName = gunName;
//    }
}
