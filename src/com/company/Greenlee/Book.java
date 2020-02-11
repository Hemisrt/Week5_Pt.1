package com.company.Greenlee;

/**
 * Created by 061935 on 2/11/2020.
 */
public class Book {
    private String title;
    private String author;
    private int totalPages;
    private double price;

    static double totalPrice = 0;
    static int numBooks = 0;

    public Book(String title, String author, int totalPages, double price) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.price = price;
        numBooks++;
        totalPrice += this.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static void setNumBooks(int numBooks) {
        Book.numBooks = numBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                ", price=" + price +
                '}';
    }
}
