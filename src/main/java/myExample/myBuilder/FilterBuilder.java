package myExample.myBuilder;

public abstract class FilterBuilder {
    Filter filter;

    void createFilter() {
        filter = new Filter();
    }

    abstract void buildFileType();

    abstract void buildContainsDifferentChars();

    abstract void buildMaxAmountOfChar();


    Filter getFilter() {
        return filter;
    }
}
