package myExample.behavioralPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        SpecialEffect color = new ChangeColorSpecialEffect(PowerLevel.CHANGE_COLOR_EFFECT);
        SpecialEffect extension = new ExtensionSpecialEffect(PowerLevel.EXTENSION_EFFECT);
        SpecialEffect multipleExtension = new MultipleExtensionEffect(PowerLevel.MULTIPLE_EXTENSION_EFFECT);

        color.setNextSpecialEffect(extension);
        extension.setNextSpecialEffect(multipleExtension);

        color.specialEffectManager("Common object", PowerLevel.CHANGE_COLOR_EFFECT);
        color.specialEffectManager("Rare object", PowerLevel.EXTENSION_EFFECT);
        color.specialEffectManager("Legendary object", PowerLevel.MULTIPLE_EXTENSION_EFFECT);

    }
}
