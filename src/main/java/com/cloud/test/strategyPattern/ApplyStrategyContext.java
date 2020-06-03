package com.cloud.test.strategyPattern;

import com.cloud.test.ContextFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 提现策略类
 * @author: wanghc
 * @create: 2020/6/3 下午3:24
 */
@Component
public class ApplyStrategyContext {

    @Autowired
    private ContextFactoryService contextFactoryService;

    public String UserApply(String bankName) {

        String serviceName = bankName + "BankApplyService";
        ApplyStrategyService applyStrategyService = (ApplyStrategyService) contextFactoryService.getBean(serviceName);
        return applyStrategyService.userApply();
    }
}
