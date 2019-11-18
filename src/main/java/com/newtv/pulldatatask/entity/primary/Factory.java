package com.newtv.pulldatatask.entity.primary;

import java.util.Date;

public class Factory {

    private Long resFactoryId;
    private String resFactoryCode;
    private String resFactoryName;
    private Integer resType;
    private Integer resFactoryStatus;
    private String resRemark;
    private String resFactoryCONTACT;
    private Date resFactoryAddress;
    private Date validDate;
    private Date expirDate;
    private Date updateDate;
    private Long operatorId;

    public Long getResFactoryId() {
        return resFactoryId;
    }

    public void setResFactoryId(Long resFactoryId) {
        this.resFactoryId = resFactoryId;
    }

    public String getResFactoryCode() {
        return resFactoryCode;
    }

    public void setResFactoryCode(String resFactoryCode) {
        this.resFactoryCode = resFactoryCode;
    }

    public String getResFactoryName() {
        return resFactoryName;
    }

    public void setResFactoryName(String resFactoryName) {
        this.resFactoryName = resFactoryName;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getResFactoryStatus() {
        return resFactoryStatus;
    }

    public void setResFactoryStatus(Integer resFactoryStatus) {
        this.resFactoryStatus = resFactoryStatus;
    }

    public String getResRemark() {
        return resRemark;
    }

    public void setResRemark(String resRemark) {
        this.resRemark = resRemark;
    }

    public String getResFactoryCONTACT() {
        return resFactoryCONTACT;
    }

    public void setResFactoryCONTACT(String resFactoryCONTACT) {
        this.resFactoryCONTACT = resFactoryCONTACT;
    }

    public Date getResFactoryAddress() {
        return resFactoryAddress;
    }

    public void setResFactoryAddress(Date resFactoryAddress) {
        this.resFactoryAddress = resFactoryAddress;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(Date expirDate) {
        this.expirDate = expirDate;
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

    @Override
    public String toString() {
        return "Factory{" +
                "resFactoryId=" + resFactoryId +
                ", resFactoryCode='" + resFactoryCode + '\'' +
                ", resFactoryName='" + resFactoryName + '\'' +
                ", resType=" + resType +
                ", resFactoryStatus=" + resFactoryStatus +
                ", resRemark='" + resRemark + '\'' +
                ", resFactoryCONTACT='" + resFactoryCONTACT + '\'' +
                ", resFactoryAddress=" + resFactoryAddress +
                ", validDate=" + validDate +
                ", expirDate=" + expirDate +
                ", updateDate=" + updateDate +
                ", operatorId=" + operatorId +
                '}';
    }
}
