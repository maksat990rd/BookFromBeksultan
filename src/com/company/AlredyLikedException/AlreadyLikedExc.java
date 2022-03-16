package com.company.AlredyLikedException;

public class AlreadyLikedExc extends RuntimeException{
    public AlreadyLikedExc() {
        super();
    }

    public AlreadyLikedExc(String message) {
        super(message);
    }
}
