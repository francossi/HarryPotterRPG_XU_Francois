package com.example.harrypotterrpg_xu_francois.Items;

public enum Potion {
    SMALLPOTION("small potion",1),
    MEDIUMPOTION("medium potion",2),
    BIGPOTION("big potion",3);
    public final String potion;
    public final int potionValue;
    Potion(String potion, int potionValue){
        this.potion=potion;
        this.potionValue=potionValue;
    }
    public static Potion getPotion(int potionNumber){
        switch (potionNumber){
            case 1:
                return Potion.SMALLPOTION;
            case 2:
                return Potion.MEDIUMPOTION;
            case 3:
                return Potion.BIGPOTION;
        }
        return null;
    }


}
