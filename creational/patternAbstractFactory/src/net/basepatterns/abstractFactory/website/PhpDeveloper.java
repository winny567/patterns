package net.basepatterns.abstractFactory.website;

import net.basepatterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
