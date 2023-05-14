package com.example.harrypotterrpg_xu_francois.Items;


import com.example.harrypotterrpg_xu_francois.Console.Display;

import java.util.Scanner;

public enum Core {
    PHOENIX_FEATHER("phoenix feather",0,0,0,6),
    DRAGON_HEARTSTRING("dragon heartstring",0,6,6,6),
    UNICORN_TAIL_HAIR("unicorn tail hair",0,0,0,0),
    VEELA_HAIR("veela hair",0,0,0,0);
    public final String core;
    public final int maxHP;
    public final int accuracy;
    public final int power;
    public final int strength;
    Core(String core , int maxHP, int accuracy, int power, int strength){
        this.core =core;
        this.maxHP=maxHP;
        this.accuracy=accuracy;
        this.power=power;
        this.strength=strength;
    }


    public static Core getCore(int coreNumber){
        switch (coreNumber){
            case 1:
                return Core.DRAGON_HEARTSTRING;
            case 2:
                return Core.PHOENIX_FEATHER;
            case 3:
                return Core.UNICORN_TAIL_HAIR;
            case 4:
                return Core.VEELA_HAIR;
        }
        return null;
    }


    public static Core coreChoice(){
        Scanner scanner=new Scanner(System.in);
        Display display=new Display();
        display.printText("Enter an int to choose your Core between :"+"\n1) "+getCore(1)+"\n2) "+getCore(2)+"\n3) "+getCore(3)+"\n4) "+getCore(4));
        int core=scanner.nextInt();
        display.printText("Nice choice! You received the "+getCore(core)+".");
        return getCore(core);

    }
}
