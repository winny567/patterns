package net.basepatterns.abstractFactory.website;

import net.basepatterns.abstractFactory.Developer;
import net.basepatterns.abstractFactory.ProjectManager;
import net.basepatterns.abstractFactory.ProjectTeamFactory;
import net.basepatterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
