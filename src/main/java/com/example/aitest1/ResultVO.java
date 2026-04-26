package com.example.aitest1;

public class ResultVO {
    private String requestId;

    public ResultVO() {
    }

    public ResultVO(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
