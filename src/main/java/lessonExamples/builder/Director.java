package lessonExamples.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildPrice();
        builder.buildCms();

        Website website = builder.getWebsite();
        return website;
    }
}
