package myExample.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<TextHandler> textHandlerList = new ArrayList<>();
        TextHandlerFactory textHandlerFactory = new TextHandlerFactory();

        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("numerical"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("punctuation"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("punctuation"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("punctuation"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("punctuation"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("synonyms"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("synonyms"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("synonyms"));
        textHandlerList.add(textHandlerFactory.getTextHandlerByType("synonyms"));

        StringBuilder text = new StringBuilder("Lalalala,mm,...13131");
        System.out.println(text);
        textHandlerList.forEach(textHandler -> textHandler.handle(text));
        System.out.println(text);

    }
}
