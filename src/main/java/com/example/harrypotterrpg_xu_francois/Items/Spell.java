package com.example.harrypotterrpg_xu_francois.Items;

public class Spell extends AbstractSpell{

    public Spell(String spellName, int power) {
        super(spellName, power);
    }

    public enum FallingThings{
        BOOK(5),
        BACKPACK(10),
        CHAIR(25),
        TABLE(30);
        private final int damage;
        FallingThings(int damage){
            this.damage=damage;
        }

        @Override
        public String toString() {
            return name().toLowerCase();
        }

        public int getDamage() {
            return damage;
        }
    }
    public static FallingThings generateThing(int thing){
        if(thing<25){
            return FallingThings.BOOK;
        } else if (thing>=25&&thing<50) {
            return FallingThings.BACKPACK;
        }else if (thing>=50 && thing<75) {
            return FallingThings.CHAIR;
        }else {
            return FallingThings.TABLE;
        }
    }
}
