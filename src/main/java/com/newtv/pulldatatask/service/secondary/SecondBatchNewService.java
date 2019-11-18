package com.newtv.pulldatatask.service.secondary;

import com.newtv.pulldatatask.entity.primary.PrimaryBatchNew;
import com.newtv.pulldatatask.entity.secondary.SecondBatchNew;
import com.newtv.pulldatatask.mapper.secondary.SecondBatchNewMapper;
import com.newtv.pulldatatask.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
@Transactional(rollbackFor = Exception.class)
public class SecondBatchNewService {

    @Resource
    private SecondBatchNewMapper secondBatchNewMapper;

    public void insertBatchList(List<PrimaryBatchNew> primaryBatchList){

        if(Objects.nonNull(primaryBatchList) && primaryBatchList.size()>0){
            SecondBatchNew secondBatch = new SecondBatchNew();
            for(PrimaryBatchNew batch : primaryBatchList){
                secondBatch.setId(batch.getBatchId());
                secondBatch.setCode(batch.getBatchCode());
                secondBatch.setFcCode(batch.getFcCode());
                secondBatch.setStartRegionCode(batch.getStartRegionCode());
                secondBatch.setEndRegionCode(batch.getEndRegionCode());
                secondBatch.setStartCode(batch.getStartCode());
                secondBatch.setTotal(batch.getCount());
                secondBatch.setStatus(batch.getBatchStatus());
                secondBatch.setValidDate(batch.getValidDate());
                secondBatch.setExpirDate(batch.getExpirDate());
                secondBatch.setUpdateDate(batch.getUpdateDate());
                if(Objects.nonNull(batch.getCreateDate())){
                    secondBatch.setCreateDate(DateUtil.getDateByString(batch.getCreateDateStr()));
                }
                secondBatch.setOperatorId(batch.getOperatorId());
                secondBatch.setBindStatus(batch.getBindStatus());
                secondBatch.setResFactoryCategoryId(batch.getResFactoryCategoryId());
                secondBatch.setBatchType(batch.getBatchType());
                secondBatch.setResFactoryCategoryName(batch.getResFactoryCategoryName());
                secondBatchNewMapper.insert(secondBatch);
            }
        }
    }
}
