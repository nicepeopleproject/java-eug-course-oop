package myExample.builder;

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
