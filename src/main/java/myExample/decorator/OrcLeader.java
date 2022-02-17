package myExample.decorator;

public class OrcLeader extends OrcDecorator {
    public OrcLeader(Orc orc) {
        super(orc);
    }


    public String callTheGenerals() {
        return "Generals come to me!";
    }

    @Override
    public String prepareForFight() {
        return callTheGenerals() + orc.prepareForFight();
    }
}
