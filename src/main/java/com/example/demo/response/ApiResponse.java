package com.example.demo.response;

import java.util.List;

public class ApiResponse<T> {

    private Status status;
    private Metadata metadata;
    private List<T> results;

    public ApiResponse(List<T> results) {
        this.status = new Status(Code.OK);
        this.metadata = new Metadata(results.size());
        this.results = results;
    }

    public ApiResponse(T result) {
        this.status = new Status(Code.OK);
        this.metadata = new Metadata(1);
        this.results = List.of(result);
    }

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
