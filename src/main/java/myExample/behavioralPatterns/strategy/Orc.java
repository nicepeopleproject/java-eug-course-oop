package myExample.behavioralPatterns.strategy;

public class Orc {
    private Combat combatType;

    public void setCombatType(Combat combatType) {
        this.combatType = combatType;
    }

    public void strike(){
        combatType.strike();
    }
}
