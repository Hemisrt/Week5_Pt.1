package com.company.Greenlee;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Goosebumps", "R.L. Stine", 199, 15.75);
        Book book2 = new Book("Programming Logic", "Joyce Ferrel;", 56, 34.21);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println("Number of books: " + Book.numBooks);

        Person person1 = new Person("Yunis", 18);
        System.out.println(person1);
        Person person2 = new Person("Elijah");
        System.out.println(person2);

        person1.readingBook(book1);
        System.out.println(Book.totalPrice);
    }
}
