package com.cloud.test.strategyPattern;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: 
 * @param: null 
 * @return 
 * @author wanghc
 * @date 2020/6/3
 */
@Component
public interface ApplyStrategyService {

    /**
     * @description:
     * @param:
     * @return java.lang.String
     * @author wanghc
     * @date 2020/6/3
     */
    String userApply();
}
