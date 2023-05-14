package com.example.harrypotterrpg_xu_francois.Items;

public class AbstractSpell {
    private String spellName;
    private int power;
    public AbstractSpell(String spellName, int power){
        setSpellName(spellName);
        setPower(power);
    }
    public String getSpellName() {
        return spellName;

    }
    public void setSpellName(String spellName) {
        this.spellName=spellName;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

}
