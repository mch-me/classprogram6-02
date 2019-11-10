package com.apple.chaptersix;

import java.awt.*;

public class BookServiceImpl implements BookService{
    @Override
    public void makebooks() {
        System.out.println("make the book");

    }

    @Override
    public void showbooks() {
        System.out.println("show the book");
    }
}
