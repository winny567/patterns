package net.basepatterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice webs ite");
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
