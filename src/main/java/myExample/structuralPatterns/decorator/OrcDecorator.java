package myExample.decorator;

public class OrcDecorator implements myExample.decorator.Orc {
    protected myExample.decorator.Orc orc;

    public OrcDecorator(myExample.decorator.Orc orc) {
        this.orc = orc;
    }

    @Override
    public String prepareForFight() {
        return orc.prepareForFight();
    }
}
