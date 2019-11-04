package com.apple.chaptersix;

import java.awt.*;

public class BookServiceImpl implements BookService{
    @Override
    public void makebooks() {
        Book book = new Book('mch001','mch',89);
        Book magazine = new Magazine('mch002','mch02',89,'2019.11.02');

    }

    @Override
    public void showbooks() {

    }
}
