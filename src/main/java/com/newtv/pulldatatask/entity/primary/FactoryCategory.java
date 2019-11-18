package com.newtv.pulldatatask.entity.primary;

import java.util.Date;

public class FactoryCategory {

    private Long fcId;
    private String fcCode;
    private String fcName;
    private String fcDesc;
    private String cateMainKind;
    private String cateSubKind;
    private Integer resType;
    private Date createDate;
    private Date updateDate;
    private Long operatorId;
    private String provider;
    private String country;

    public Long getFcId() {
        return fcId;
    }

    public void setFcId(Long fcId) {
        this.fcId = fcId;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode;
    }

    public String getFcName() {
        return fcName;
    }

    public void setFcName(String fcName) {
        this.fcName = fcName;
    }

    public String getFcDesc() {
        return fcDesc;
    }

    public void setFcDesc(String fcDesc) {
        this.fcDesc = fcDesc;
    }

    public String getCateMainKind() {
        return cateMainKind;
    }

    public void setCateMainKind(String cateMainKind) {
        this.cateMainKind = cateMainKind;
    }

    public String getCateSubKind() {
        return cateSubKind;
    }

    public void setCateSubKind(String cateSubKind) {
        this.cateSubKind = cateSubKind;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "FactoryCategory{" +
                "fcId=" + fcId +
                ", fcCode='" + fcCode + '\'' +
                ", fcName='" + fcName + '\'' +
                ", fcDesc='" + fcDesc + '\'' +
                ", cateMainKind='" + cateMainKind + '\'' +
                ", cateSubKind='" + cateSubKind + '\'' +
                ", resType=" + resType +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", operatorId=" + operatorId +
                ", provider='" + provider + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
