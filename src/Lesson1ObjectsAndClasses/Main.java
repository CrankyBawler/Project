package Lesson1ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevski = new Author("Фёдор", "Достаевский");
        Author tyrgenev = new Author("Иван", "Тургенев");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1867);
        Book krimeAndPunishment = new Book("Преступление и наказание", dostoevski, 1866);
        Book fathersAndSons = new Book("Отцы и дети", tyrgenev, 1862);
        System.out.println(warAndPeace.getBookName() + ", " + warAndPeace.getAuthorName().getName() + " " + warAndPeace.
                getAuthorName().getFamiliaName() + ", " + warAndPeace.getPublishingYear());
        System.out.println(fathersAndSons.getBookName() + ", " + fathersAndSons.getAuthorName().getName() + " " +
                        fathersAndSons.getAuthorName().getFamiliaName() + ", " + fathersAndSons.getPublishingYear());
        System.out.println(krimeAndPunishment.getBookName() + ", " + krimeAndPunishment.getAuthorName().getName() + " "
                + krimeAndPunishment.getAuthorName().getFamiliaName() + ", " + krimeAndPunishment.getPublishingYear());
        krimeAndPunishment.setPublishingYear(1998);
        System.out.println(krimeAndPunishment.getBookName() + ", " + krimeAndPunishment.getAuthorName().getName() + " "
                + krimeAndPunishment.getAuthorName().getFamiliaName() + ", " + krimeAndPunishment.getPublishingYear());
    }
}
