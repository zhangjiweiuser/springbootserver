package com.zhang.boot2.entity;

public enum ResultEnum implements IEnum<Integer> {
    PRIMARY_SCHOOL(100, "你可能在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上中学");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
