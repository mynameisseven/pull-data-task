package com.newtv.pulldatatask.task;

import com.newtv.pulldatatask.entity.primary.PrimaryBatch;
import com.newtv.pulldatatask.entity.primary.PrimaryBatchNew;
import com.newtv.pulldatatask.entity.primary.PrimaryTerminalBatch;
import com.newtv.pulldatatask.mapper.primary.PrimaryBatchMapper;
import com.newtv.pulldatatask.mapper.primary.PrimaryBatchNewMapper;
import com.newtv.pulldatatask.mapper.primary.PrimaryTerminalBatchMapper;
import com.newtv.pulldatatask.service.secondary.SecondBatchNewService;
import com.newtv.pulldatatask.service.secondary.SecondBatchService;
import com.newtv.pulldatatask.service.secondary.SecondTerminalBatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class SchduleTask {

    @Resource
    private PrimaryBatchMapper primaryBatchMapper;

    @Resource
    private PrimaryBatchNewMapper primaryBatchNewMapper;

    @Resource
    private PrimaryTerminalBatchMapper primaryTerminalBatchMapper;

    @Resource
    private SecondBatchService secondBatchService;

    @Resource
    private SecondBatchNewService secondBatchNewService;

    @Resource
    private SecondTerminalBatchService secondTerminalBatchService;

    private static Logger logger = LoggerFactory.getLogger(SchduleTask.class);

    /**
     * 每天凌晨一点执行
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void batchYesterdayList() {

        List<PrimaryBatch> batchlist = primaryBatchMapper.getYesterdayList();
        secondBatchService.insertBatchList(batchlist);
        logger.info("----batch---cron----导入数据结束---------------");
    }


    /**
     * 每天凌晨两点执行
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void batchNewYesterdayList() {

        List<PrimaryBatchNew> batchlist = primaryBatchNewMapper.getYesterdayList();
        secondBatchNewService.insertBatchList(batchlist);
        logger.info("-----batchNew---cron---导入数据结束---------------");
    }

    /**
     * 每天凌晨3点执行
     */
    @Scheduled(cron = "0 0 3 * * ?")
    public void terminalBatchYesterdayList() {

        List<PrimaryTerminalBatch> batchlist = primaryTerminalBatchMapper.getYesterdayList();
        secondTerminalBatchService.insertBatchList(batchlist);
        logger.info("----terminalBatch----cron---导入数据结束---------------");
    }

}
