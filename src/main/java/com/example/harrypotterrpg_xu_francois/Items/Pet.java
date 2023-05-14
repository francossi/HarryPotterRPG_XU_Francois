package com.example.harrypotterrpg_xu_francois.Items;


import com.example.harrypotterrpg_xu_francois.Console.Display;

import java.util.Scanner;

public enum Pet {
    OWL("owl",2,0,0,0),
    RAT("rat",0,0,0,2),
    CAT("cat",0,0,2,0),
    TOAD("toad",0,2,0,0);
    public final String pet;
    public final int accuracy;
    public final int maxHP;
    public final int power;
    public final int strength;

    Pet(String pet , int accuracy, int maxHP, int power, int strength){
        this.pet =pet;
        this.accuracy=accuracy;
        this.maxHP=maxHP;
        this.power=power;
        this.strength=strength;
    }

    public static Pet getPet(int petNumber){
        switch (petNumber){
            case 1:
                return Pet.OWL;
            case 2:
                return Pet.RAT;
            case 3:
                return Pet.CAT;
            case 4:
                return Pet.TOAD;
        }
        return null;
    }

    public static Pet petChoice(){
        Scanner scanner=new Scanner(System.in);
        Display display=new Display();
        display.printText("Enter an int to choose your pet between :"+"\n1) "+getPet(1)+"\n2) "+getPet(2)+"\n3) "+getPet(3)+"\n4) "+getPet(4));
        int pet =scanner.nextInt();
        display.printText("Nice choice! You received the "+getPet(pet)+".");
        return getPet(pet);

    }


}
