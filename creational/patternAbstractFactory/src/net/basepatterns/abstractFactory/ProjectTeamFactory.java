package net.basepatterns.abstractFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
