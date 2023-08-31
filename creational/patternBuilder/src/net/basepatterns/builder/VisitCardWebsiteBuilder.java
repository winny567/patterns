package net.basepatterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("visitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
