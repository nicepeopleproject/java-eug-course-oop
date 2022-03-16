package myExample.behavioralPatterns.chainOfResponsibility;

public class ExtensionSpecialEffect extends SpecialEffect {
    public ExtensionSpecialEffect(int effectPower) {
        super(effectPower);
    }

    @Override
    protected void doEffect(String objectName) {
        System.out.printf("Extension of %s object.\n", objectName);
    }
}
