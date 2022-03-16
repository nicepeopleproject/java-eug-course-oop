package myExample.builder;

public class MOLFileWithDifferentCharWithAmountLessThan100FilterBuilder  extends FilterBuilder{
    @Override
    void buildFileType() {
        filter.setFileType(FileType.MOL);
    }

    @Override
    void buildContainsDifferentChars() {
        filter.setContainsDifferentChars(true);
    }

    @Override
    void buildMaxAmountOfChar() {
        filter.setMaxAmountOfChar(100);
    }
}
