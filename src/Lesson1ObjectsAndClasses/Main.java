package Lesson1ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        String tolstoyName = tolstoy.getName();
        String tolstoyFamilia = tolstoy.getFamiliaName();
        String tolsoyFullName = tolstoyName + " " + tolstoyFamilia;
        Author dostoevski = new Author("Фёдор", "Достаевский");
        String dostaevskiyName = dostoevski.getName();
        String dostaevskiyFamilia = dostoevski.getFamiliaName();
        String dostaevskiyFullName = dostaevskiyName + " " + dostaevskiyFamilia;
        Author tyrgenev = new Author("Иван", "Тургенев");
        String tyrgenevName = tyrgenev.getName();
        String tyrgenevFamilia = tyrgenev.getFamiliaName();
        String tyrgenevFullName = tyrgenevName + " " + tyrgenevFamilia;
        Book warAndPeace = new Book("Война и мир", tolsoyFullName, 1867);
        Book krimeAndPunishment = new Book("Преступление и наказание", dostaevskiyFullName, 1866);
        Book fathersAndSons = new Book("Отцы и дети", tyrgenevFullName, 1862);
        System.out.println(warAndPeace.getBookName() + ", " + warAndPeace.getAuthorName() + ", " + warAndPeace.getPublishingYear());
        System.out.println(fathersAndSons.getBookName() + ", " + fathersAndSons.getAuthorName() + ", " + fathersAndSons.getPublishingYear());
        System.out.println(krimeAndPunishment.getBookName() + ", " + krimeAndPunishment.getAuthorName() + ", " + krimeAndPunishment.getPublishingYear());
        krimeAndPunishment.setPublishingYear(1998);
        System.out.println(krimeAndPunishment.getBookName() + ", " + krimeAndPunishment.getAuthorName() + ", " + krimeAndPunishment.getPublishingYear());
    }
}
