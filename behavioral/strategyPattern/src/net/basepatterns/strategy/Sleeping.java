package net.basepatterns.strategy;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
