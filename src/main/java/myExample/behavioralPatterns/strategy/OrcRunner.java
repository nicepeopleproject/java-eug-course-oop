package myExample.behavioralPatterns.strategy;

public class OrcRunner {
    public static void main(String[] args) {
        Orc orc = new Orc();
        orc.setCombatType(new CloseCombat());
        orc.strike();
        orc.setCombatType(new CloseCombat());
        orc.strike();
        orc.setCombatType(new RangedCombat());
        orc.strike();
        orc.setCombatType(new RangedCombat());
        orc.strike();
        orc.setCombatType(new CloseCombat());
        orc.strike();
    }
}
