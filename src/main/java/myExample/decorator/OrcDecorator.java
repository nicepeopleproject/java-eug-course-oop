package myExample.decorator;

public class OrcDecorator implements Orc {
    protected Orc orc;

    public OrcDecorator(Orc orc) {
        this.orc = orc;
    }

    @Override
    public String prepareForFight() {
        return orc.prepareForFight();
    }
}
