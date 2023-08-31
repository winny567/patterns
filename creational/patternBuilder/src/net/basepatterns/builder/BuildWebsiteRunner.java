package net.basepatterns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);

        // нууу, типа один из примеров реализации, но очень странный
        // т.к. есть вариант с build методами, через которые можно создавать непосредственно в процессе.
        // здесь же заранее заготовки..
    }
}
