package com.cloud.test.strategyPattern;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: 光大银行提现策略实现类
 * @author: wanghc
 * @create: 2020/6/3 下午3:16
 */
@Component("GdBankApplyService")
public class GdBankStrategyServiceImpl implements ApplyStrategyService{

    @Override
    public String userApply() {
        return "光大银行提现策略实现类-->提现成功";
    }
}
