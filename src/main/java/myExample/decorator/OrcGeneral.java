package myExample.decorator;

public class OrcGeneral extends OrcDecorator {
    public OrcGeneral(Orc orc) {
        super(orc);
    }

    public String callArmy() {
        return "Orcs come to me! We gonna go to the fight.";
    }

    @Override
    public String prepareForFight() {
        return callArmy() + super.prepareForFight();
    }
}
