package com.cloud.test.strategyPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 提现功能业务处理层
 * @author: wanghc
 * @create: 2020/6/3 下午3:42
 */
@Service
public class ApplyService {

    @Autowired
    private ApplyStrategyContext applyStrategyContext;

    public String userApply(String bankName){
        return applyStrategyContext.UserApply(bankName);
    }
}
