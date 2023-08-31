package net.basepatterns.abstractFactory.website;

import net.basepatterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
