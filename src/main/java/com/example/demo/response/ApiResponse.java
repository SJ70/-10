package com.example.demo.response;

import java.util.List;

public class ApiResponse<T> {

    private Status status;
    private Metadata metadata;
    private List<T> results;

    public Status getStatus() {
        return status;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public List<T> getResults() {
        return results;
    }
}
