package lessonExamples.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise website.");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
