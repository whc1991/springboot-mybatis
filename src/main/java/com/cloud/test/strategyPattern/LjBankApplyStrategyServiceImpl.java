package com.cloud.test.strategyPattern;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: 龙江银行提现策略实现类
 * @author: wanghc
 * @create: 2020/6/3 下午3:02
 */
@Component("LjBankApplyService")
public class LjBankApplyStrategyServiceImpl implements ApplyStrategyService{

    @Override
    public String userApply() {
        return "龙江银行提现策略实现类-->提现成功";
    }
}
