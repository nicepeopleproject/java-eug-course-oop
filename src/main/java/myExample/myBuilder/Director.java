package myExample.myBuilder;

public class Director {
    FilterBuilder filterBuilder;

    public Director(FilterBuilder filterBuilder) {
        this.filterBuilder = filterBuilder;
    }

    Filter buildFilter() {
        filterBuilder.createFilter();
        filterBuilder.buildFileType();
        filterBuilder.buildContainsDifferentChars();
        filterBuilder.buildMaxAmountOfChar();
        return filterBuilder.getFilter();
    }
}
