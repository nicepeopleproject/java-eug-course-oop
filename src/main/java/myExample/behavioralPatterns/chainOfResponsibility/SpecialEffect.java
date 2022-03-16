package myExample.behavioralPatterns.chainOfResponsibility;

public abstract class SpecialEffect {
    int effectPower;
    SpecialEffect nextSpecialEffect;

    public SpecialEffect(int effectPower) {
        this.effectPower = effectPower;
    }

    public void setNextSpecialEffect(SpecialEffect nextSpecialEffect) {
        this.nextSpecialEffect = nextSpecialEffect;
    }

    public void specialEffectManager(String objectName, int powerLevel) {
        if (powerLevel >= effectPower) {
            doEffect(objectName);
        }

        if (nextSpecialEffect != null) nextSpecialEffect.specialEffectManager(objectName, powerLevel);
    }

    protected abstract void doEffect(String objectName);
}
