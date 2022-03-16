package myExample.flyweight;

public class SynonymsTextHandler implements TextHandler {
    @Override
    public void handle(StringBuilder text) {
        System.out.println("Replacing with synonyms...");
        text.append("alal");
    }
}
