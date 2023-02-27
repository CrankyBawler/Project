package Lesson1ObjectsAndClasses;

public class Author {
    private String name;
    private String familiaName;

    public Author(String name, String familiaName) {
        this.name = name;
        this.familiaName = familiaName;
    }

    public String getName() {
        return this.name;
    }

    public String getFamiliaName() {
        return this.familiaName;
    }
}