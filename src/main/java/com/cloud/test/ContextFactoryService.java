package com.cloud.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Slf4j
@Service
public class ContextFactoryService {

    @Autowired
    private ApplicationContext applicationContext;

    public Object getBean(String type, String serviceName) {

        if (StringUtils.isEmpty(type)){
            log.error("通过ApplicationContext获取Bean失败，type 为空, serviceName = {}", type, serviceName);
            throw new RuntimeException("通过ApplicationContext获取Bean失败");
        }
        try {
            return applicationContext.getBean(type + serviceName);
        } catch (Exception e) {
            log.error("通过ApplicationContext获取Bean失败，type = {}, serviceName = {}", type, serviceName);
            throw e;
        }

    }

    public Object getBean(String serviceName) {

        try {
            return applicationContext.getBean(serviceName);
        } catch (Exception e) {
            log.error("通过ApplicationContext获取Bean失败, serviceName = {}", serviceName);
            throw e;
        }
    }

}
