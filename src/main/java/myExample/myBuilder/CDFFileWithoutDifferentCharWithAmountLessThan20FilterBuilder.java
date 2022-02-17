package myExample.myBuilder;

public class CDFFileWithoutDifferentCharWithAmountLessThan20FilterBuilder extends FilterBuilder {
    @Override
    void buildFileType() {
        filter.setFileType(FileType.CDF);
    }

    @Override
    void buildContainsDifferentChars() {
        filter.setContainsDifferentChars(false);
    }

    @Override
    void buildMaxAmountOfChar() {
        filter.setMaxAmountOfChar(20);
    }
}
