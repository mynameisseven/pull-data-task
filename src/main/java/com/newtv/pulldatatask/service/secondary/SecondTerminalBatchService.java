package com.newtv.pulldatatask.service.secondary;

import com.newtv.pulldatatask.entity.primary.Category;
import com.newtv.pulldatatask.entity.primary.Factory;
import com.newtv.pulldatatask.entity.primary.FactoryCategory;
import com.newtv.pulldatatask.entity.primary.PrimaryTerminalBatch;
import com.newtv.pulldatatask.entity.secondary.SecondTerminalBatch;
import com.newtv.pulldatatask.enums.FCEnum;
import com.newtv.pulldatatask.enums.TXDataEnum;
import com.newtv.pulldatatask.mapper.primary.CategoryMapper;
import com.newtv.pulldatatask.mapper.primary.FactoryCategoryMapper;
import com.newtv.pulldatatask.mapper.primary.FactoryMapper;
import com.newtv.pulldatatask.mapper.secondary.SecondTerminalBatchMapper;
import com.newtv.pulldatatask.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
@Transactional(rollbackFor = Exception.class)
public class SecondTerminalBatchService {

    @Resource
    private SecondTerminalBatchMapper secondTerminalBatchMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private FactoryCategoryMapper factoryCategoryMapper;

    @Resource
    private FactoryMapper factoryMapper;

    public void insertBatchList(List<PrimaryTerminalBatch> primaryBatchList){

        if(Objects.nonNull(primaryBatchList) && primaryBatchList.size()>0){
            SecondTerminalBatch secondBatch = new SecondTerminalBatch();
            for(PrimaryTerminalBatch batch : primaryBatchList){
                secondBatch.setId(batch.getBatchId());
                secondBatch.setModelId(batch.getModelId());
                secondBatch.setServiceProvider(batch.getServiceProvider());
                secondBatch.setProvider(batch.getProvider());
                secondBatch.setModel(batch.getModel());
                secondBatch.setBatchNo(batch.getBatchNo());
                secondBatch.setStartMac(batch.getStartMac());
                secondBatch.setEndMac(batch.getEndMac());
                secondBatch.setAuthType(batch.getAuthType());
                secondBatch.setOperationsType(batch.getOperationsType());
                secondBatch.setDepositFlag(batch.getDepositFlag());
                secondBatch.setTerminalSerial(batch.getTerminalSerial());
                secondBatch.setUsedExpireDate(batch.getUsedExpireDate());
                secondBatch.setStatus(batch.getStatus());
                secondBatch.setAppId(batch.getAppId());
                if(Objects.nonNull(batch.getCreateDate())){
                    secondBatch.setCreateDate(DateUtil.getDateByString(batch.getCreateDateStr()));
                }
                secondBatch.setUpdateDate(batch.getUpdateDate());
                secondBatch.setExpireDate(batch.getExpireDate());
                secondBatch.setOperatorId(batch.getOperatorId());
                secondBatch.setOrgId(batch.getOrgId());
                secondBatch.setLoginOrgId(batch.getLoginOrgId());
                secondBatch.setRecOrgId(batch.getRecOrgId());
                secondBatch.setCorpOrgId(batch.getCorpOrgId());
                secondBatch.setRemark(batch.getRemark());
                secondBatch.setBatchCode(batch.getBatchCode());
                secondBatch.setImportType(batch.getImportType());
                secondBatch.setAuditDate(batch.getAuditDate());
                secondBatch.setBindType(batch.getBindType());
                secondBatch.setStartRegionCode(batch.getStartRegionCode());
                secondBatch.setEndRegionCode(batch.getEndRegionCode());
                secondBatch.setTotal(batch.getCount());
                secondBatch.setFc(batch.getFc());
                secondBatch.setIsFc(batch.getIsFc());
                if(FCEnum.NEWFACTORY.getCode() == batch.getIsFc()){
                    FactoryCategory factoryCategory = factoryCategoryMapper.getFactoryCategory(batch.getFc());
                    if(Objects.nonNull(factoryCategory) && Objects.nonNull(factoryCategory.getFcName())){
                        secondBatch.setModelName(factoryCategory.getFcName());
                    }
                    if(Objects.nonNull(factoryCategory) && Objects.nonNull(factoryCategory.getProvider())){
                        Factory factory = factoryMapper.getFactory(factoryCategory.getProvider());
                            if(Objects.nonNull(factory)){
                                secondBatch.setFactoryName(factory.getResFactoryName());
                            }
                    }
                    secondBatch.setFcCode(batch.getFc());
                }else{
                        Factory factory = factoryMapper.getFactory(batch.getProvider());
                           if(Objects.nonNull(factory)){
                               secondBatch.setFactoryName(factory.getResFactoryName());
                               Category category = categoryMapper.getCategory(batch.getModel(),factory.getResFactoryName());
                               if(Objects.nonNull(category)){
                                   secondBatch.setModelName(category.getCateName());
                               }
                           }
                           secondBatch.setFcCode(batch.getProvider()+batch.getModel());
                }
                //判断是否为腾讯数据(1.批次号为70-79 2.批次号为10且fcCode的值在TXDataEnum中)
                int batchNum = Integer.valueOf(secondBatch.getBatchNo()).intValue();
                if(70 <= batchNum && batchNum <= 79){
                    secondBatch.setTxData(1);
                }else if(batchNum == 10){
                    boolean b = Arrays.stream(TXDataEnum.values()).anyMatch(statusenum -> statusenum.getCode().equals(secondBatch.getFcCode()));
                    if(b){
                        secondBatch.setTxData(1);
                    }else{
                        secondBatch.setTxData(0);
                    }
                }else {
                    secondBatch.setTxData(0);
                }
                secondTerminalBatchMapper.insert(secondBatch);
            }
        }
    }
}

