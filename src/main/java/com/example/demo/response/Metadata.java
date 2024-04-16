package com.example.demo.response;

public class Metadata {

    private int resultCount = 0;

    public Metadata(int resultCount) {
        this.resultCount = resultCount;
    }

    public int getResultCount() {
        return resultCount;
    }
}
