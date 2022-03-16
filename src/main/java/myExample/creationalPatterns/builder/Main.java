package myExample.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CDFFileWithoutDifferentCharWithAmountLessThan20FilterBuilder());
        Filter filter = director.buildFilter();
        System.out.println(filter);
    }
}
