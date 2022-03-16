package myExample.behavioralPatterns.chainOfResponsibility;

public class MultipleExtensionEffect extends SpecialEffect {
    public MultipleExtensionEffect(int effectPower) {
        super(effectPower);
    }

    @Override
    protected void doEffect(String objectName) {
        System.out.printf("Multiple extending %s.\n", objectName);
    }
}
