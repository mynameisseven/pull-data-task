package com.newtv.pulldatatask.service.secondary;

import com.newtv.pulldatatask.entity.primary.Category;
import com.newtv.pulldatatask.entity.primary.PrimaryBatch;
import com.newtv.pulldatatask.entity.secondary.SecondBatch;
import com.newtv.pulldatatask.mapper.primary.CategoryMapper;
import com.newtv.pulldatatask.mapper.secondary.SecondBatchMapper;
import com.newtv.pulldatatask.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
@Transactional(rollbackFor = Exception.class)
public class SecondBatchService {

    @Resource
    private SecondBatchMapper secondBatchMapper;

    @Resource
    private CategoryMapper categoryMapper;

    public void insertBatchList(List<PrimaryBatch> primaryBatchList){

        if(Objects.nonNull(primaryBatchList) && primaryBatchList.size()>0){
            SecondBatch secondBatch = new SecondBatch();
            for(PrimaryBatch batch : primaryBatchList){
                secondBatch.setId(batch.getBatchId());
                secondBatch.setCode(batch.getBatchCode());
                secondBatch.setResTypeCode(batch.getResTypeCode());
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
                secondBatch.setResFactoryId(batch.getResFactoryId());
                secondBatch.setBatchType(batch.getBatchType());
                secondBatch.setResFactoryName(batch.getResFactoryName());

                if(Objects.nonNull(batch) && Objects.nonNull(batch.getResTypeCode()) && Objects.nonNull(batch.getResTypeCode())){
                    Category category = categoryMapper.getCategory(batch.getResTypeCode(),batch.getResFactoryName());
                    if(Objects.nonNull(category) && Objects.nonNull(category.getCateName())){
                        secondBatch.setCategoryName(category.getCateName());
                    }
                }
                secondBatchMapper.insert(secondBatch);
            }
        }
    }

}
