package net.basepatterns.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReboot() {
        return " Send week report to custom.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReboot();
    }
}
