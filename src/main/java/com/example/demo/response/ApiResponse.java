package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;

public class ApiResponse<T> {

    private Status status;

    @JsonInclude(Include.NON_EMPTY)
    private Metadata metadata;

    @JsonInclude(Include.NON_NULL)
    private List<T> results;

    @JsonInclude(Include.NON_NULL)
    private Object data;

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

    public ApiResponse(Code code) {
        this.status = new Status(code);
    }

    public ApiResponse(Code code, String message, Object data) {
        this.status = new Status(code, message);
        this.data = data;
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

    public Object getData() {
        return data;
    }
}
