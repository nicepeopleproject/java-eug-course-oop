package myExample.flyweight;

public class PunctuationTextHandler implements TextHandler{
    @Override
    public void handle(StringBuilder text) {
        System.out.println("Handling punctuation...");
        text.append(",");
    }
}
