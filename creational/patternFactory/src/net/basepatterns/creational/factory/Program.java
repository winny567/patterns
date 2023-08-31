package net.basepatterns.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("ph");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        switch (speciality) {
            case "java":
                return new JavaDeveloperFactory();
            case "c++":
                return new CppDeveloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(speciality + " is unknown speciality");
        }
    }

}
