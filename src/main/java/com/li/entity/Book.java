package com.li.entity;

public class Book {
    private long bookId;    // 图书ID

    private String name;    // 图书名称

    private int number;     // 馆藏数量

    public long getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
