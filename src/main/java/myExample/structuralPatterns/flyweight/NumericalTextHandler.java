package myExample.flyweight;

public class NumericalTextHandler implements TextHandler {
    @Override
    public void handle(StringBuilder text) {
        System.out.println("Replacing number by text...");
        text.append("1");
    }
}
