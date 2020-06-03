package com.cloud.controller;

import com.cloud.test.strategyPattern.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 提现功能应用控制层
 * @author: wanghc
 * @create: 2020/6/3 下午3:41
 */
@RestController
@RequestMapping("apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    @RequestMapping("userapply")
    @ResponseBody
    public String apply(String bankName) {
        return applyService.userApply(bankName);
    }
}
