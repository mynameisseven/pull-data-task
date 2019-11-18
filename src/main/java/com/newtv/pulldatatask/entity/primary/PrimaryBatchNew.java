package com.newtv.pulldatatask.entity.primary;

import java.util.Date;

public class PrimaryBatchNew {

    private Long batchId;
    private String batchCode;
    private String fcCode;
    private String startRegionCode;
    private String endRegionCode;
    private String startCode;
    private Long count;
    private Integer batchStatus;
    private Date validDate;
    private Date expirDate;
    private Date updateDate;
    private Date createDate;
    private Long operatorId;
    private Integer bindStatus;
    private Long resFactoryCategoryId;
    private Integer batchType;
    private String resFactoryCategoryName;
    private String createDateStr;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode;
    }

    public String getStartRegionCode() {
        return startRegionCode;
    }

    public void setStartRegionCode(String startRegionCode) {
        this.startRegionCode = startRegionCode;
    }

    public String getEndRegionCode() {
        return endRegionCode;
    }

    public void setEndRegionCode(String endRegionCode) {
        this.endRegionCode = endRegionCode;
    }

    public String getStartCode() {
        return startCode;
    }

    public void setStartCode(String startCode) {
        this.startCode = startCode;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(Integer batchStatus) {
        this.batchStatus = batchStatus;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public Long getResFactoryCategoryId() {
        return resFactoryCategoryId;
    }

    public void setResFactoryCategoryId(Long resFactoryCategoryId) {
        this.resFactoryCategoryId = resFactoryCategoryId;
    }

    public Integer getBatchType() {
        return batchType;
    }

    public void setBatchType(Integer batchType) {
        this.batchType = batchType;
    }

    public String getResFactoryCategoryName() {
        return resFactoryCategoryName;
    }

    public void setResFactoryCategoryName(String resFactoryCategoryName) {
        this.resFactoryCategoryName = resFactoryCategoryName;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }

    @Override
    public String toString() {
        return "PrimaryBatchNew{" +
                "batchId=" + batchId +
                ", batchCode='" + batchCode + '\'' +
                ", fcCode='" + fcCode + '\'' +
                ", startRegionCode='" + startRegionCode + '\'' +
                ", endRegionCode='" + endRegionCode + '\'' +
                ", startCode='" + startCode + '\'' +
                ", count=" + count +
                ", batchStatus=" + batchStatus +
                ", validDate=" + validDate +
                ", expirDate=" + expirDate +
                ", updateDate=" + updateDate +
                ", createDate=" + createDate +
                ", operatorId=" + operatorId +
                ", bindStatus=" + bindStatus +
                ", resFactoryCategoryId=" + resFactoryCategoryId +
                ", batchType=" + batchType +
                ", resFactoryCategoryName='" + resFactoryCategoryName + '\'' +
                ", createDateStr='" + createDateStr + '\'' +
                '}';
    }
}
