package net.basepatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();

        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));

        for (Developer developer : developerList) {
            developer.writeCode();
        }

    }
}
