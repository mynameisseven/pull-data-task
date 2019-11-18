package com.newtv.pulldatatask.entity.secondary;

import java.util.Date;

public class SecondTerminalBatch {

    private Long id;
    private Long modelId;
    private String serviceProvider;
    private String provider;
    private String model;
    private String batchNo;
    private String startMac;
    private String endMac;
    private Integer authType;
    private Integer operationsType;
    private Integer depositFlag;
    private String terminalSerial;
    private Date usedExpireDate;
    private Long status;
    private Long appId;
    private Date createDate;
    private Date updateDate;
    private Date expireDate;
    private Long operatorId;
    private Long orgId;
    private Long loginOrgId;
    private Long recOrgId;
    private Long corpOrgId;
    private String remark;
    private String batchCode;
    private String importType;
    private Date auditDate;
    private Integer bindType;
    private String startRegionCode;
    private String endRegionCode;
    private Long total;
    private String fc;
    private Integer isFc;
    private String factoryName;
    private String modelName;
    /**
     * 厂商编码+设备编码组成的5位码
     */
    private String fcCode;
    private Integer txData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getStartMac() {
        return startMac;
    }

    public void setStartMac(String startMac) {
        this.startMac = startMac;
    }

    public String getEndMac() {
        return endMac;
    }

    public void setEndMac(String endMac) {
        this.endMac = endMac;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public Integer getOperationsType() {
        return operationsType;
    }

    public void setOperationsType(Integer operationsType) {
        this.operationsType = operationsType;
    }

    public Integer getDepositFlag() {
        return depositFlag;
    }

    public void setDepositFlag(Integer depositFlag) {
        this.depositFlag = depositFlag;
    }

    public String getTerminalSerial() {
        return terminalSerial;
    }

    public void setTerminalSerial(String terminalSerial) {
        this.terminalSerial = terminalSerial;
    }

    public Date getUsedExpireDate() {
        return usedExpireDate;
    }

    public void setUsedExpireDate(Date usedExpireDate) {
        this.usedExpireDate = usedExpireDate;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
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

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getLoginOrgId() {
        return loginOrgId;
    }

    public void setLoginOrgId(Long loginOrgId) {
        this.loginOrgId = loginOrgId;
    }

    public Long getRecOrgId() {
        return recOrgId;
    }

    public void setRecOrgId(Long recOrgId) {
        this.recOrgId = recOrgId;
    }

    public Long getCorpOrgId() {
        return corpOrgId;
    }

    public void setCorpOrgId(Long corpOrgId) {
        this.corpOrgId = corpOrgId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getImportType() {
        return importType;
    }

    public void setImportType(String importType) {
        this.importType = importType;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public Integer getIsFc() {
        return isFc;
    }

    public void setIsFc(Integer isFc) {
        this.isFc = isFc;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode;
    }

    public Integer getTxData() {
        return txData;
    }

    public void setTxData(Integer txData) {
        this.txData = txData;
    }

    @Override
    public String toString() {
        return "SecondTerminalBatch{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", serviceProvider='" + serviceProvider + '\'' +
                ", provider='" + provider + '\'' +
                ", model='" + model + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", startMac='" + startMac + '\'' +
                ", endMac='" + endMac + '\'' +
                ", authType=" + authType +
                ", operationsType=" + operationsType +
                ", depositFlag=" + depositFlag +
                ", terminalSerial='" + terminalSerial + '\'' +
                ", usedExpireDate=" + usedExpireDate +
                ", status=" + status +
                ", appId=" + appId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", expireDate=" + expireDate +
                ", operatorId=" + operatorId +
                ", orgId=" + orgId +
                ", loginOrgId=" + loginOrgId +
                ", recOrgId=" + recOrgId +
                ", corpOrgId=" + corpOrgId +
                ", remark='" + remark + '\'' +
                ", batchCode='" + batchCode + '\'' +
                ", importType='" + importType + '\'' +
                ", auditDate=" + auditDate +
                ", bindType=" + bindType +
                ", startRegionCode='" + startRegionCode + '\'' +
                ", endRegionCode='" + endRegionCode + '\'' +
                ", total=" + total +
                ", fc='" + fc + '\'' +
                ", isFc=" + isFc +
                ", factoryName='" + factoryName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", fcCode='" + fcCode + '\'' +
                ", txData=" + txData +
                '}';
    }
}
