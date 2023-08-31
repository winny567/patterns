package net.basepatterns.iterator;

public class JavaDevRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring","Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Roman Tkachev", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
