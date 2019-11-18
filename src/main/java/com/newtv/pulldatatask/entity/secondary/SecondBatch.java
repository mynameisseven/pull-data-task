package com.newtv.pulldatatask.entity.secondary;

import java.util.Date;

public class SecondBatch {

    private Long id;
    private String code;
    private String resTypeCode;
    private String startRegionCode;
    private String endRegionCode;
    private String startCode;
    private Long total;
    private Integer status;
    private Date validDate;
    private Date expirDate;
    private Date updateDate;
    private Date createDate;
    private Long operatorId;
    private Integer bindStatus;
    private Long resFactoryId;
    private Integer batchType;
    private String resFactoryName;
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "SecondBatch{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", resTypeCode='" + resTypeCode + '\'' +
                ", startRegionCode='" + startRegionCode + '\'' +
                ", endRegionCode='" + endRegionCode + '\'' +
                ", startCode='" + startCode + '\'' +
                ", total=" + total +
                ", status=" + status +
                ", validDate=" + validDate +
                ", expirDate=" + expirDate +
                ", updateDate=" + updateDate +
                ", createDate=" + createDate +
                ", operatorId=" + operatorId +
                ", bindStatus=" + bindStatus +
                ", resFactoryId=" + resFactoryId +
                ", batchType=" + batchType +
                ", resFactoryName='" + resFactoryName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
