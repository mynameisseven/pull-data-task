package com.newtv.pulldatatask.mapper.primary;

import com.newtv.pulldatatask.entity.primary.PrimaryBatchNew;

import java.util.List;

public interface PrimaryBatchNewMapper {

    List<PrimaryBatchNew> getAll();

    List<PrimaryBatchNew> getYesterdayList();

    List<PrimaryBatchNew> getListById(Long batchId);
}
