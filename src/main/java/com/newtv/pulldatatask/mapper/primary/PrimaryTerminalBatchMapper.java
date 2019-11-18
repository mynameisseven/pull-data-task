package com.newtv.pulldatatask.mapper.primary;

import com.newtv.pulldatatask.entity.primary.PrimaryTerminalBatch;
import java.util.List;

public interface PrimaryTerminalBatchMapper {

    List<PrimaryTerminalBatch> getAll();

    List<PrimaryTerminalBatch> getYesterdayList();

    List<PrimaryTerminalBatch> getListById(Long batchId);
}
