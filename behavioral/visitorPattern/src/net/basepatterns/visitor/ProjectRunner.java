package net.basepatterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in Action");
        project.beWritten(juniorDeveloper);

        System.out.println("\n");

        System.out.println("Senior in Action...");
        project.beWritten(seniorDeveloper);
    }
}
