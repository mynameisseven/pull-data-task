package com.newtv.pulldatatask.mapper.primary;

import com.newtv.pulldatatask.entity.primary.PrimaryBatch;

import java.util.List;

public interface PrimaryBatchMapper {

        List<PrimaryBatch> getAll();

        List<PrimaryBatch> getYesterdayList();

        List<PrimaryBatch> getListById(Long batchId);
    }
