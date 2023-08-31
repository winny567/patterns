package net.basepatterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

    public String makeCodeReview() {
        return " Make code review.";
    }
}
