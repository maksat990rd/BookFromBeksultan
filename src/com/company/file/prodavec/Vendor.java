package com.company.file.prodavec;

import com.company.file.books.Book;

import java.util.List;

public class Vendor {
    private String vendorName;
    private String vendorEmail;
    private String phoneNumber;
    private List<Book<?>> booksToSale;

    public Vendor() {}

    public Vendor(String vendorName, String vendorEmail, String phoneNumber, List<Book<?>> booksToSale) {
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.phoneNumber = phoneNumber;
        this.booksToSale = booksToSale;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book<?>> getBooksToSale() {
        return booksToSale;
    }

    public void setBooksToSale(List<Book<?>> booksToSale) {
        this.booksToSale = booksToSale;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorName='" + vendorName + '\'' +
                ", vendorEmail='" + vendorEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", booksToSale=" + booksToSale +
                '}';
    }
}
