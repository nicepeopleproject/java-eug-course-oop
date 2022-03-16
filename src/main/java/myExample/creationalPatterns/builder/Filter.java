package myExample.builder;


public class Filter {
    private FileType fileType;
    private boolean containsDifferentChars;
    private int maxAmountOfChar;

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public void setContainsDifferentChars(boolean containsDifferentChars) {
        this.containsDifferentChars = containsDifferentChars;
    }

    public void setMaxAmountOfChar(int maxAmountOfChar) {
        this.maxAmountOfChar = maxAmountOfChar;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "fileType=" + fileType +
                ", containsDifferentChars=" + containsDifferentChars +
                ", maxAmountOfChar=" + maxAmountOfChar +
                '}';
    }
}
