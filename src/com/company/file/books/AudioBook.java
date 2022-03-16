package com.company.file.books;

import com.company.file.FileInfo;
import com.company.file.books.BookType;

import java.time.LocalTime;

public class AudioBook implements BookType {
    private FileInfo fragment;
    private LocalTime deratoin;
    private FileInfo audio;
    public AudioBook() {}

    public AudioBook(FileInfo fragment, LocalTime deratoin, FileInfo audio) {
        this.fragment = fragment;
        this.deratoin = deratoin;
        this.audio = audio;
    }

    public FileInfo getFragment() {
        return fragment;
    }

    public void setFragment(FileInfo fragment) {
        this.fragment = fragment;
    }

    public LocalTime getDeratoin() {
        return deratoin;
    }

    public void setDeratoin(LocalTime deratoin) {
        this.deratoin = deratoin;
    }

    public FileInfo getAudio() {
        return audio;
    }

    public void setAudio(FileInfo audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "fragment=" + fragment +
                ", deratoin=" + deratoin +
                ", audio=" + audio +
                '}';
    }
}
