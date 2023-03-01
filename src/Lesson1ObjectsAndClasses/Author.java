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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return familiaName.equals(c2.familiaName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(familiaName);
    }
    @Override
    public String toString() {
        return name + " " + familiaName;
    }

}