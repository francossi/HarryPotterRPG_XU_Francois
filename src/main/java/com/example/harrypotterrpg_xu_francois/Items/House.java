package com.example.harrypotterrpg_xu_francois.Items;

import com.example.harrypotterrpg_xu_francois.Console.Display;

import java.util.Scanner;

public enum House {
    GRYFFINDOR("gryffondor",5,0,0,0),
    HUFFLEPUFF("hufflepuff",0,0,0,0),
    RAVENCLAW("ravenclaw",0,9,0,0),
    SLYTHERIN("slytherin",0,6,6,6);
    public final String house;
    public final int accuracy;
    public final int maxHP;
    public final int power;
    public final int strength;
    House(String house , int accuracy, int maxHP, int power, int strength){
        this.house =house;
        this.accuracy=accuracy;
        this.maxHP=maxHP;
        this.power=power;
        this.strength=strength;
    }


    public static House getHouse(int houseNumber){
        switch (houseNumber){
            case 1:
                return House.GRYFFINDOR;
            case 2:
                return House.HUFFLEPUFF;
            case 3:
                return House.SLYTHERIN;
            case 4:
                return House.RAVENCLAW;
        }
        return null;
    }


    public static House houseChoice(){
        Scanner scanner=new Scanner(System.in);
        Display display=new Display();
        display.printText("Enter an int to choose your house between :"+"\n1) "+getHouse(1)+"\n2) "+getHouse(2)+"\n3) "+getHouse(3)+"\n4) "+getHouse(4));
        int house =scanner.nextInt();
        display.printText("Nice choice! You received the "+getHouse(house)+".");
        return getHouse(house);

    }

}
