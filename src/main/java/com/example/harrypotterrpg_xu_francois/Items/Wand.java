package com.example.harrypotterrpg_xu_francois.Items;

import com.example.harrypotterrpg_xu_francois.Console.Display;

import java.util.Scanner;

public enum Wand {
    FAKEWAND("fake wand",0,0,6),
    EVILWAND("evil wand",6,6,6),
    EPICWAND("epic wand",10,0,0),
    BESTWAND("best wand",0,0,0);
    public final String wand;
    public final int accuracy;
    public final int power;
    public final int strength;
    Wand(String wand , int accuracy, int power, int strength){
        this.wand =wand;
        this.accuracy=accuracy;
        this.power=power;
        this.strength=strength;
    }

    public static Wand getWand(int wandNumber){
        switch (wandNumber){
            case 1:
                return Wand.EVILWAND;
            case 2:
                return Wand.EPICWAND;
            case 3:
                return Wand.FAKEWAND;
            case 4:
                return Wand.BESTWAND;
        }
        return null;
    }


    public static Wand wandChoice(){
        Scanner scanner=new Scanner(System.in);
        Display display=new Display();
        display.printText("Enter an int to choose your pet between :"+"\n1) "+getWand(1)+"\n2) "+getWand(2)+"\n3) "+getWand(3)+"\n4) "+getWand(4));
        int wand =scanner.nextInt();
        display.printText("Nice choice! You received the "+getWand(wand)+".");
        return getWand(wand);

    }
}
