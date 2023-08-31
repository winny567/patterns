package net.basepatterns.state;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping..");
    }
}
