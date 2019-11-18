package com.newtv.pulldatatask.enums;

public enum FCEnum {

    /**
     *是否为新厂商
     */
    NEWFACTORY(1),
    /**
     * 失效
     */
    NOTNEWFACTORY(0);

    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    FCEnum(int code) {
        this.code = code;
    }
}
