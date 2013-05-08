package com.mengqiu.domain;

public class Email {
    private final String fromAddress;
    private final String toAddress;

    public Email(String fromAddress, String toAddress) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }
    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

}
