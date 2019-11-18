package com.newtv.pulldatatask.enums;

public enum TXDataEnum {

    /**
     * 优学派
     */
    YXP("01145"),
    /**
     * 星环科技
     */
    XHKJ("01140"),
    /**
     * 神画科技
     */
    SHKJ("01139"),
    /**
     * 海翼安克
     */
    HYAK("01118"),
    /**
     * 明基
     */
    MJ("01157"),
    /**
     * 瑞格尔
     */

    RGE("01177"),
    /**
     * 优派--智能投影机
     */
    YP("01184"),
    /**
     * 神画科技--智能投影机新认证
     */
    SHKJNEW("01178"),
    /**
     * 泽宝--智能投影机
     */
    ZB("01183"),
    /**
     * 博视联--智能电视机顶盒
     */
    BSL("01182"),
    /**
     * 奥图码--智能投影机
     */
    ATM("01180"),
    /**
     * 橙子数字--智能投影机
     */
    CZSZ("01181");

    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    TXDataEnum(String code) {
        this.code = code;
    }
}
