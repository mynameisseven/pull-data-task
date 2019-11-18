package com.newtv.pulldatatask.entity.secondary;

import java.util.Date;

public class SecondBatchNew {

    private Long id;
    private String code;
    private String fcCode;
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
    private Long resFactoryCategoryId;
    private Integer batchType;
    private String resFactoryCategoryName;

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

    @Override
    public String toString() {
        return "SecondBatchNew{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", fcCode='" + fcCode + '\'' +
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
                ", resFactoryCategoryId=" + resFactoryCategoryId +
                ", batchType=" + batchType +
                ", resFactoryCategoryName='" + resFactoryCategoryName + '\'' +
                '}';
    }
}
