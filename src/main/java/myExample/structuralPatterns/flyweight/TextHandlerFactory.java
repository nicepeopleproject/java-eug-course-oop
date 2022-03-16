package myExample.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextHandlerFactory {
    private final static Map<String, TextHandler> textHandlers = new HashMap<>();

    public TextHandler getTextHandlerByType(String type) {
        TextHandler textHandler = textHandlers.get(type);

        if (textHandler == null) {
            switch (type) {
                case "numerical":
                    System.out.println("Creating numerical text handler...");
                    textHandler = new NumericalTextHandler();
                    break;
                case "punctuation":
                    System.out.println("Creating punctuation text handler...");
                    textHandler = new PunctuationTextHandler();
                    break;
                case "synonyms":
                    System.out.println("Creating synonyms text handler...");
                    textHandler = new SynonymsTextHandler();
                    break;
            }
            textHandlers.put(type, textHandler);
        }
        return textHandler;
    }
}
