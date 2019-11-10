package com.apple.chaptersix;

public class Manager {
    public static void main(String[] args) {
        Book book = new Book("mch001","mch",89);
        int pages = book.pages;

        display(String.valueOf(pages));
        display(book.getBookName());

        Book magazine = new Magazine("mch002","mch02",89,"2019.11.02");
        display(book.getBookId());
        display(magazine.getBookId());

    }
    public static void display(String content){
        System.out.println(content);
    }
}
