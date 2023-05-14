package com.example.harrypotterrpg_xu_francois.Characters;


import com.example.harrypotterrpg_xu_francois.Items.Core;
import com.example.harrypotterrpg_xu_francois.Items.House;
import com.example.harrypotterrpg_xu_francois.Items.Pet;
import com.example.harrypotterrpg_xu_francois.Items.Wand;

public class Wizard extends Character {
    private House house;
    private Pet pet;
    private Wand wand;
    private Core core;


    public Wizard(String nom, int power, int accuracy, int strength, int HP, int maxHP, House house, Wand wand, Core core, Pet pet) {
        super(nom, power, accuracy, strength, HP, maxHP);
        this.pet = pet;
        this.house=house;
        this.wand=wand;
        this.core=core;


    }
}
