package myExample.behavioralPatterns.chainOfResponsibility;

public class ChangeColorSpecialEffect extends SpecialEffect {

    public ChangeColorSpecialEffect(int effectPower) {
        super(effectPower);
    }

    @Override
    protected void doEffect(String objectName) {
        System.out.printf("Change color for %s object.\n", objectName);
    }
}
