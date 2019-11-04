package com.apple.chaptersix;

public class Magazine extends Book{
    private String dataofpulish;

    public Magazine(String bookId, String bookName, int pages,String dataofpulish) {
        super(bookId, bookName, pages);
        this.dataofpulish = dataofpulish;
    }

    public String getDataofpulish() {
        return dataofpulish;
    }

    public void setDataofpulish(String dataofpulish) {
        this.dataofpulish = dataofpulish;
    }
}
