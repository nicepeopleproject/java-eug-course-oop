package myExample.decorator;

public class JustOrc implements Orc {
    @Override
    public String prepareForFight() {
        return "I should take my axe!!!";
    }
}
