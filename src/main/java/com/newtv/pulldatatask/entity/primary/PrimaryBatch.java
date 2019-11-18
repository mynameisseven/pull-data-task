package com.newtv.pulldatatask.entity.primary;


import java.util.Date;

public class PrimaryBatch {

    private Long batchId;
    private String batchCode;
    private String resTypeCode;
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
    private Long resFactoryId;
    private Integer batchType;
    private String resFactoryName;
    private String catetoryName;
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

    public String getResTypeCode() {
        return resTypeCode;
    }

    public void setResTypeCode(String resTypeCode) {
        this.resTypeCode = resTypeCode;
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

    public Long getResFactoryId() {
        return resFactoryId;
    }

    public void setResFactoryId(Long resFactoryId) {
        this.resFactoryId = resFactoryId;
    }

    public Integer getBatchType() {
        return batchType;
    }

    public void setBatchType(Integer batchType) {
        this.batchType = batchType;
    }

    public String getResFactoryName() {
        return resFactoryName;
    }

    public void setResFactoryName(String resFactoryName) {
        this.resFactoryName = resFactoryName;
    }

    public String getCatetoryName() {
        return catetoryName;
    }

    public void setCatetoryName(String catetoryName) {
        this.catetoryName = catetoryName;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }

    @Override
    public String toString() {
        return "PrimaryBatch{" +
                "batchId=" + batchId +
                ", batchCode='" + batchCode + '\'' +
                ", resTypeCode='" + resTypeCode + '\'' +
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
                ", resFactoryId=" + resFactoryId +
                ", batchType=" + batchType +
                ", resFactoryName='" + resFactoryName + '\'' +
                ", catetoryName='" + catetoryName + '\'' +
                ", createDateStr='" + createDateStr + '\'' +
                '}';
    }
}
