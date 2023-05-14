package com.example.harrypotterrpg_xu_francois.Characters;

public abstract class Character {
    private String nom;
    private int power;
    private int accuracy;
    private int strength;
    private int HP;
    private int maxHP;

    public Character(String nom, int power, int accuracy, int strength, int HP, int maxHP) {
        setNom(nom);
        setPower(power);
        setAccuracy(accuracy);
        setStrength(strength);
        setHP(HP);
        setmaxHP(maxHP);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP =HP ;
    }
    public int getmaxHP() {
        return maxHP;
    }

    public void setmaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
}
