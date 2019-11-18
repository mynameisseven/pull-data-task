package com.newtv.pulldatatask.entity.primary;

import java.util.Date;

public class Category {

    private Long cateId;
    private String cateCode;
    private String cateName;
    private String cateDesc;
    private Long recOrgId;
    private String cateType;
    private String cateMainKind;
    private String cateSubKind;
    private Integer cateStatus;
    private Integer repType;
    private String provider;
    private Long unitPrice;
    private Integer isBind;
    private Long snLength;
    private Date createDate;

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateDesc() {
        return cateDesc;
    }

    public void setCateDesc(String cateDesc) {
        this.cateDesc = cateDesc;
    }

    public Long getRecOrgId() {
        return recOrgId;
    }

    public void setRecOrgId(Long recOrgId) {
        this.recOrgId = recOrgId;
    }

    public String getCateType() {
        return cateType;
    }

    public void setCateType(String cateType) {
        this.cateType = cateType;
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

    public Integer getCateStatus() {
        return cateStatus;
    }

    public void setCateStatus(Integer cateStatus) {
        this.cateStatus = cateStatus;
    }

    public Integer getRepType() {
        return repType;
    }

    public void setRepType(Integer repType) {
        this.repType = repType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getIsBind() {
        return isBind;
    }

    public void setIsBind(Integer isBind) {
        this.isBind = isBind;
    }

    public Long getSnLength() {
        return snLength;
    }

    public void setSnLength(Long snLength) {
        this.snLength = snLength;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cateId=" + cateId +
                ", cateCode='" + cateCode + '\'' +
                ", cateName='" + cateName + '\'' +
                ", cateDesc='" + cateDesc + '\'' +
                ", recOrgId=" + recOrgId +
                ", cateType='" + cateType + '\'' +
                ", cateMainKind='" + cateMainKind + '\'' +
                ", cateSubKind='" + cateSubKind + '\'' +
                ", cateStatus=" + cateStatus +
                ", repType=" + repType +
                ", provider='" + provider + '\'' +
                ", unitPrice=" + unitPrice +
                ", isBind=" + isBind +
                ", snLength=" + snLength +
                ", createDate=" + createDate +
                '}';
    }
}
