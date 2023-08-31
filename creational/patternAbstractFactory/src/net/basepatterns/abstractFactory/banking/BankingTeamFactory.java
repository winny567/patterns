package net.basepatterns.abstractFactory.banking;

import net.basepatterns.abstractFactory.Developer;
import net.basepatterns.abstractFactory.ProjectManager;
import net.basepatterns.abstractFactory.ProjectTeamFactory;
import net.basepatterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
