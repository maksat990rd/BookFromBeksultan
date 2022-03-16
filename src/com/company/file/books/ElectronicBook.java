package com.company.file.books;

import com.company.file.FileInfo;

public class ElectronicBook implements BookType {
    private String fragment;
    private int pageSize;
    private String publishingHouse;
    private FileInfo eBook;

    public ElectronicBook(String s, int i, String dilazyk, FileInfo fileInfo) {
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public FileInfo geteBook() {
        return eBook;
    }

    public void seteBook(FileInfo eBook) {
        this.eBook = eBook;
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "audioFragment=" + fragment +
                ", pageSize=" + pageSize +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", eBook=" + eBook +
                '}';
    }
}
